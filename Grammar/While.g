grammar While;

Variable 
	:	'A'..'Z'('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;
	
Symbol
	:	'a'..'z'('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;
	
program 
	:	function program?;
	
function
	:	'function' Symbol ':' definition;
	
definition
	:	'read' input '%' commands '%' 'write' output;
	
input	
	:	inputSub | ;
	
inputSub
	:	Variable (',' inputSub)?;
	
output	
	:	Variable (',' output)?;
	
commands
	:	command (';' commands)?;
	
commandNop	
	:	'nop';
	
commandEqual
	:	vars ':=' exprs;
	
commandIf
	:	'if' expression 'then' commands ('else' commands)? 'fi';
	
commandWhile
	:	'while' expression 'do' commands 'od';
	
commandFor
	:	'for' expression 'do' commands 'od';
	
commandForeach
	:	'foreach' Variable 'in' expression 'do' commands 'od';
	
command
	:	commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach;
	
vars
	:	Variable (',' vars)?;
	
exprs
	:	expression (',' exprs)?;
	
exprBase1
	:	'nil' | Variable | Symbol;
	
exprBase2
	:	'(' 'cons' lexpr ')' | '(' 'list' lexpr ')';
	
exprBase3
	:	'(' 'hd' exprBase ')' | '(' 'tl' exprBase ')';
	
exprBase4
	:	'(' Symbol lexpr ')';
	
exprBase
	:	exprBase1 | exprBase2 | exprBase3 | exprBase4;
	
expression
	:	exprBase ('=?' exprBase)?;
	
lexpr
	:	exprBase lexpr | ;
	

