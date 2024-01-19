public class ExceptionOptimisation extends Exception {
    public ExceptionOptimisation(String line, String message) {
        super("Translator exception : " + message + "\n\t" + line);
    }
}
