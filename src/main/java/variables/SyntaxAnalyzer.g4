grammar SyntaxAnalyzer;

@header{
    package variables;
}

//reglas lexicas

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9];
fragment INT : 'int';
fragment DOUBLE : 'double';
fragment CHAR : 'char';

COMA : ',';
IGUAL : '=';
PYC : ';' ;
UNDERSCORE : '_';
TIPO : INT | DOUBLE | CHAR;

ID : (LETRA | UNDERSCORE) (LETRA | DIGITO)*;

ASIGNACION : IGUAL (LETRA | (DIGITO+ COMA DIGITO+) | DIGITO+) ;

programa : instrucciones EOF;
instrucciones : instruccion instrucciones;
instruccion : declaracion
            ;
//TIPO ID = (CHAR | DOUBLE | INT) , ;

declaracion : TIPO secvar PYC; 

secvar : comvar  
       | var;      

comvar : ID ASIGNACION? COMA secvar;
var : ID ASIGNACION?;

/*var COMA secvar | var*/
/*
declaracion : INT secvar PYC
secvar: ID COMA secvar 
      | ID ;                */