grammar Grammar;

WS : [ \t\r\n]+ -> skip ;

seq : 'seq('fun','fun')';
fun: PHRASE'('args*')';

args: PHRASE | ',' args;

fragment NEW_DIGIT:[0-9];
PHRASE : ([a-zA-Z_] | NEW_DIGIT | '_' |'-')+;
