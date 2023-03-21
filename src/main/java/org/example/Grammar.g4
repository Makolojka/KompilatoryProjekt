grammar Grammar;

WS : [ \t\r\n]+ -> skip ;

seq : 'seq('fun','fun')';
fun: PHRASE'('args*')';

args:PHRASE| ',' args;


INTEGER : [0-9]+ ;
ID      : [a-zA-Z]+ ;

fragment NEW_DIGIT:[0-9];
PHRASE : ([a-zA-Z_] | NEW_DIGIT | '_' |'-')+;
