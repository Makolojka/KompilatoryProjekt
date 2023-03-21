grammar Grammar;

seq : (expression ',')* expression;
expression
  : INTEGER
  | ID
  ;

INTEGER : [0-9]+ ;
ID      : [a-zA-Z]+ ;
