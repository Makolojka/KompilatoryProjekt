grammar g;
classDeclaration: modificators? 'class' NAME '{' classBody* '}';

classBody: methodDeclaration+ | variable+;

variable: modificators? TYPE NAME ';' | modificators? TYPE NAME '=' '"'*  NAME+ '"'* ';';

methodDeclaration: modificators? argument '('argument*')' parenthesis*;

modificators : ('public '|'protected '|'private ');
TYPE: 'int ' | 'float ' | 'short ' | 'string ' | 'void ';

fragment NEW_DIGIT: [0-9];

NAME: 'a' .. 'z' + | 'A' .. 'Z' + | NEW_DIGIT + | '_' + | '-' +;
argument:TYPE NAME | TYPE NAME', 'argument;
parenthesis: '{'body'}' | '{' '}' | '{ }';

WS : [ \t\r\n]+ -> skip ;
body: variable+;


OBR: '[';
CBR: ']';

arrays : ('int' | 'float' | 'short' | 'String' | 'void')(OBR CBR)?;

//expr
// : NAME
//// | expr AND expra
//// | expr OR expr
// ;

//OR   : 'OR' | '|';
//AND  : 'AND' | '&';

//STRING_LITERAL:     '"' (~["\\r\n] | EscapeSequence)* '"';
//void sdhasdhjasadas(int asdsad)
//fragment EscapeSequence
//    : '\' 'u005c'? [btnfr"'\]
//    | '\' 'u005c'? ([0-3]? [0-7])? [0-7]
//    | '\' 'u'+ HexDigit HexDigit HexDigit HexDigit
//    ;
//fragment HexDigit
//    : [0-9a-fA-F]
//    ;

//void nazwa(int a){
//
//}
//prule: 'hello ' CHAR;
//CHAR: 'a'..'z' | ' ';


//methodDeclaration
//    : typeTypeOrVoid identifier formalParameters ('[' ']')*
//      (THROWS qualifiedNameList)?
//      methodBody
//    ;
