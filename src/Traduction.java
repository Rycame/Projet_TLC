import java.util.*;
import java.util.stream.Collectors;


public class Traduction {

    List<String> res = new ArrayList<>();

    Set<String> variables = new HashSet<>();

    List<List<String>> words;
    int n;
    int tabs;

    final static String PARAMS_STACK = "paramsStack";
    final static String PARAMS_STACK_FUNC = "paramsStackFunc";
    final static String RETURN_STACK = "returnStack";
    final static String PREFIX = "tlc_";


    /**
     * Transform to JS
     * @param strs lines of 3addr
     * @return lines of JS
     * @throws ExceptionOptimisation
     */
    public List<String> translate(List<String> strs) throws ExceptionOptimisation {
        words = strs.stream().map(line -> Arrays.stream(line.split(" ")).collect(Collectors.toList())).toList();
        n = 0;

        List<String> line;
        while((line = getNextInputLine()) != null) {
            translateLine(line);
        }

        return res;
    }

    /**
     * Translate a line
     * @param line list of words
     * @throws ExceptionOptimisation
     */
    private void translateLine(List<String> line) throws ExceptionOptimisation {
        String firstWord = line.get(0);

        switch (firstWord){
            case "func" -> translateFunction(line);
            case "return" -> addReturnValue(line);
            case "Return" -> translateReturn(line);
            case "if" -> parseIf(line, false);
            case "ifz" -> parseIf(line, true);
            case "param" -> addParam(line);
            case "call" -> translateCallFunction(line);
            case "goto" -> {}
            case "get" -> getParam(line);
            default -> {
                if(firstWord.startsWith("WHILE_"))
                    parseWhile(line);
                else if(firstWord.startsWith("FOR_"))
                    translateFor(line);
                else if(line.size() >= 2 && line.get(1).equals("="))
                    TranslateAssignation(line);
                else throw new ExceptionOptimisation(getCurrentLine(), "No operation found");
            }
        }
    }

    /**
     * Transform a for
     * @param line
     * @throws ExceptionOptimisation
     */
    private void translateFor(List<String> line) throws ExceptionOptimisation {
        variables.add(line.get(0));
        String init = getCurrentLine();
        String variable = line.get(0);
        getNextInputLine();
        line = getNextInputLine();
        getNextInputLine();
    
        // La condition en Python se fait généralement via une itération
        // Par exemple, "for i in range(0, 10):"
        // Vous devrez adapter cette logique en fonction de votre spécificité du code 3 adresses
        String iterVar = line.get(2); // Variable d'itération
        String rangeStart = "0"; // Début de la plage d'itération
        String rangeEnd = line.get(4); // Fin de la plage d'itération
    
        String lineFor = "for " + iterVar + " in range(" + rangeStart + ", " + rangeEnd + "):";
        addLineToOutput(lineFor);
        tabs++;
    
        line = getNextInputLine();
    
        while (!line.get(0).equals(variable)) {
            translateLine(line);
            line = getNextInputLine();
        }
        getNextInputLine();
        getNextInputLine();
    
        tabs--;
    }
    

    private void getParam(List<String> line) {
        addLineToOutput(line.get(1) + " = " + PARAMS_STACK_FUNC + ".shift()");
        variables.add(line.get(1));
    }

    private void translateCallFunction(List<String> line) throws NombreArgument {
        if(line.size() != 3)
            throw new NombreArgument(getCurrentLine());
        addLineToOutput(PREFIX+line.get(1) + "("+PARAMS_STACK+")");
        clearParam();
    }

    /**
     * Reset parameters of functions
     */
    private void clearParam(){
        addLineToOutput(PARAMS_STACK + " = []");
    }

    /**
     * Add a paramater for a function call
     * @param line
     */
    private void addParam(List<String> line) {
        String var = line.get(1);
        addLineToOutput(PARAMS_STACK + ".push(" + var + ")");
    }

    private void parseWhile(List<String> line) throws ExceptionOptimisation {
        String label = line.get(0);
        line = getNextInputLine();
        addLineToOutput("while(toBool("+line.get(1)+")){");
        tabs++;

        line = getNextInputLine();
        while(true){
            if(line.size() == 2 && line.get(0).equals("goto") && (line.get(1) + ":").equals(label)){
                getNextInputLine();
                break;
            }

            translateLine(line);
            line = getNextInputLine();
        }

        tabs--;
        addLineToOutput("}");
    }

    private void parseIf(List<String> line, boolean zero) throws ExceptionOptimisation {
        // Adaptation de la condition pour Python
        if (zero)
            addLineToOutput("if not to_bool(" + line.get(1) + "):"); // Supposition d'une fonction to_bool adaptée
        else
            addLineToOutput("if to_bool(" + line.get(1) + "):");
    
        tabs++;
    
        String label1 = line.get(3) + ":";
        String endLabel = "";
    
        List<String> lastLine = line;
        line = getNextInputLine();
    
        while (true) {
            if (line.get(0).equals(label1)) {
                if (lastLine.get(0).equals("goto")) {
                    endLabel = lastLine.get(1) + ":";
                    tabs--;
                    addLineToOutput("else:"); // else en Python
                    tabs++;
                } else {
                    break;
                }
            } else if (line.get(0).equals(endLabel)) {
                break;
            } else {
                translateLine(line);
            }
            lastLine = line;
            line = getNextInputLine();
        }
    
        tabs--;
        // Pas besoin d'accolade fermante en Python
    }
    

    private void TranslateAssignation(List<String> line) throws NombreArgument {
        if (line.size() < 3) {
            throw new NombreArgument(getCurrentLine());
        }
    
        String leftName = line.get(0);
        String right = line.get(2);
    
        // En Python, 'null' est représenté par 'None'
        if (right.equals("nil")) {
            right = "None";
        }
    
        boolean clearParams = false;
    
        // Adaptation pour les appels de fonction en Python
        if (line.size() == 5) {
            right = PREFIX + line.get(3) + "(" + PARAMS_STACK + ")";
            clearParams = true;
        }
    
        // Gestion des index de tableau
        int bracLeft = leftName.indexOf("[");
        int n = -1;
        if (bracLeft != -1) {
            n = Integer.parseInt(leftName.substring(bracLeft + 1, leftName.length() - 1));
            leftName = leftName.substring(0, bracLeft);
        }
    
        // En Python, pas besoin de déclarer explicitement les variables
        if (!variables.contains(leftName)) {
            variables.add(leftName);
            if (n != -1) {
                addLineToOutput(leftName + " = []"); // Initialisation d'une liste en Python
            }
        }
    
        // Assignation en Python
        addLineToOutput(leftName + " = " + right);
    
        if (clearParams) {
            clearParam();
        }
    }
    

    private void addReturnValue(List<String> line) throws NombreArgument {
        assertSize(line, 2);
        addLineToOutput(RETURN_STACK + ".push(" +line.get(1)+ ")");
    }

    private void translateReturn(List<String> line) {
        addLineToOutput("return " + RETURN_STACK);
    }

    /**
     * Check if a line has enough words
     * @param line list of words
     * @param n number of minimum words
     * @throws NombreArgument
     */
    private void assertSize(List<String> line, int n) throws NombreArgument {
        if(line.size() < n)
            throw new NombreArgument(getCurrentLine());
    }

    private void translateFunction(List<String> line) throws ExceptionOptimisation {
        variables.clear();
        assertSize(line, 2);
        if(line.get(1).equals("begin")){
            assertSize(line, 3);

            addLineToOutput("def " + PREFIX + line.get(2) + "(" + PARAMS_STACK_FUNC + "):");
            tabs++;
            addLineToOutput(RETURN_STACK + " = []");
            addLineToOutput(PARAMS_STACK + " = []");

            int lineDefine = getOutputLineIndex();

            line = getNextInputLine();
            while(line.size() != 2 || !line.get(0).equals("func") || !line.get(1).equals("end")){
                translateLine(line);
                line = getNextInputLine();
            }

            for(String var : variables){
                addLineToOutput(repeatString("  ", tabs) + var + " = None", lineDefine);
            }

            tabs--;
        } else {
            throw new ExceptionOptimisation(getCurrentLine(), "Operation not found");
        }
    }

    private String repeatString(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    private String getCurrentLine(){
        return String.join(" ", words.get(n-1));
    }

    private void addLineToOutput(String line){
        res.add("  ".repeat(tabs) + line);
    }
    private void addLineToOutput(String line, int n){
        res.add(n, "\t".repeat(tabs) + line);
    }
    private int getOutputLineIndex(){
        return res.size();
    }

    private List<String> getNextInputLine(){
        if(n >= words.size())
            return null;
        return words.get(n++);
    }
}