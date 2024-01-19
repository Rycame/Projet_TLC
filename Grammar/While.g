grammar While;

options { 
  output=AST; 
}

tokens {
	EQUAL;
	FUNCTION;
	PROGRAM;
	INPUTS;
	OUTPUTS;
	COMMANDS;
	IF;
	WHILE;
	FOR;
	FOREACH;
	NOP;
	NIL;
	CONS;
	LIST;
	HD;
	TL;
	SYMB;
	VARS;
	EXPRS;
	CONDITION;
	NOM;
	THEN;
	ELSE;
}

Variable 
	:	'A'..'Z'('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;
	
Symbol
	:	'a'..'z'('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;
	
program 
	:	function+  -> ^(PROGRAM function+);
	
function
	:	'function' Symbol ':' definition -> ^(FUNCTION ^(NOM Symbol) definition);
	
definition
	:	'read' input '%' commands '%' 'write' output -> input commands output;
	
input	
	:	inputSub -> inputSub | -> ^(INPUTS);
//	:	inputSub? -> inputSub?;
	
inputSub
	:	Variable (',' Variable)* -> ^(INPUTS Variable*);
	
output	
	:	Variable (',' Variable)* -> ^(OUTPUTS Variable+);
	
commands
	:	command (';' command)* -> ^(COMMANDS command+);
	
commandNop	
	:	'nop' -> NOP;
	
commandEqual
	:	vars ':=' exprs -> ^(EQUAL vars exprs);
	
commandIf
	//:	'if' expression 'then' c1=commands ('else' commands)? 'fi' -> ^(IF ^(CONDITION expression) ^(THEN $c1) ^(ELSE commands)?);
	:	'if' expression 'then' c1=commands ('else' c2=commands)? 'fi' -> ^(IF ^(CONDITION expression) ^(THEN $c1) ^(ELSE $c2)?);


commandWhile
	:	'while' expression 'do' commands 'od' -> ^(WHILE expression commands);
	
commandFor
	:	'for' expression 'do' commands 'od' -> ^(FOR expression commands);
	
commandForeach
	:	'foreach' Variable 'in' expression 'do' commands 'od' -> ^(FOREACH Variable expression commands);
	
command
	:	commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach;
	
vars
	:	Variable (',' Variable)* -> ^(VARS Variable+);
	
exprs
	:	expression (',' expression)* -> ^(EXPRS expression+);
	
exprBase1
	:	'nil' -> NIL | Variable | Symbol;
	
exprBase2
	:	'(' 'cons' lexpr ')' -> ^(CONS lexpr?) | '(' 'list' lexpr ')' -> ^(LIST lexpr?);
	
exprBase3
	:	'(' 'hd' exprBase ')' -> ^(HD exprBase) | '(' 'tl' exprBase ')' -> ^(TL exprBase);
	
exprBase4
	:	'(' Symbol lexpr ')' -> ^(SYMB Symbol lexpr?);
	
exprBase
	:	exprBase1 | exprBase2 | exprBase3 | exprBase4;
	
expression
	:	exprBase ('=?' exprBase)? -> exprBase+ ;
	
lexpr
	:	exprBase* -> exprBase*;

