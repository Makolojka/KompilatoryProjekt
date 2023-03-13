grammar g;
methodDeclaration: TYPE NAME '('TYPE NAME')' parenthesis;

TYPE: 'int ' | 'float ' | 'short' | 'String ' | 'void ';
NAME : 'a' .. 'z' + | 'A' .. 'Z' + ;

parenthesis: '{'body'}' | '{' '}' | '{ }';

body: TYPE NAME;


//expr
// : NAME
//// | expr AND expr
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
