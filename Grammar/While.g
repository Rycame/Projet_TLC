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
}

Variable 
	:	'A'..'Z'('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;
	
Symbol
	:	'a'..'z'('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;
	
program 
	:	function program? -> ^(PROGRAM function+);
	
function
	:	'function' Symbol ':' definition -> ^(FUNCTION Symbol definition);
	
definition
	:	'read' input '%' commands '%' 'write' output -> input commands output;
	
input	
	:	inputSub | -> inputSub?;
	
inputSub
	:	Variable (',' inputSub)? -> ^(INPUTS Variable*);
	
output	
	:	Variable (',' output)? -> ^(OUTPUTS Variable+);
	
commands
	:	command (';' commands)? -> ^(COMMANDS command+);
	
commandNop	
	:	'nop' -> NOP;
	
commandEqual
	:	vars ':=' exprs -> ^(EQUAL vars exprs);
	
commandIf
	:	'if' expression 'then' commands ('else' commands)? 'fi' -> ^(IF expression commands commands?);
	
commandWhile
	:	'while' expression 'do' commands 'od' -> ^(WHILE expression commands);
	
commandFor
	:	'for' expression 'do' commands 'od' -> ^(FOR expression commands);
	
commandForeach
	:	'foreach' Variable 'in' expression 'do' commands 'od' -> ^(FOREACH Variable expression commands);
	
command
	:	commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach;
	
vars
	:	Variable (',' vars)? -> ^(VARS Variable+);
	
exprs
	:	expression (',' exprs)? -> ^(EXPRS expression+);
	
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
	:	exprBase lexpr | -> exprBase;

