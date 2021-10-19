grammar SyntaxAnalyzer;

@header{
    package compiler.antlr_files;
}

fragment LETRA : [A-Za-z] ;
DIGITO : [0-9];
fragment INT : 'int';
fragment DOUBLE : 'double';
fragment CHAR : 'char';
fragment VOID : 'void';

WS : [\t\n\r] -> skip;
COMA : ',';
IGUAL : '=';
PYC : ';' ;
UNDERSCORE : '_';
TIPOD : VOID | INT | DOUBLE | CHAR;

PA: '(';
PC: ')';
NOT: '!';
AND: '&&';
OR: '||';
SUMA: '+';
RESTA: '-';
MULT: '*';
DIV: '/';
MAYQ: '>';
MENQ: '<';
MAYIG: '>=';
MENIG: '<=';
DISTINTO: '!=';
IGUALLOG: '=='; 

IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
LLAVEA: '{';
LLAVEC: '}';
RETURN: 'return';

ID : (LETRA | UNDERSCORE) (LETRA | DIGITO)*;

FLOAT : DIGITO+'.'+DIGITO+;

asignacion 
       : IGUAL expr_aritm;

programa : instrucciones  EOF
         ; 

instrucciones : instruccion instrucciones
              |  
              ; 

instruccion : 
         TIPOD secvar 
       | secvar 
       | condicional
       | funcion
       | bloque
       ;

bloque: LLAVEA instrucciones LLAVEC;

funcion: TIPOD ID PA parametro* PC (bloque* | PYC*) ;

return: RETURN (ID | DIGITO)* PYC;

parametro: TIPOD ID (COMA parametro)*;

secvar : 
       (dec_var  
       | asg_var )
       (COMA secvar)*
       PYC*
       ;  

asg_var : ID asignacion;

dec_var : ID;

comparador: MAYQ | MENQ | MAYIG | MENIG | IGUAL | DISTINTO | IGUALLOG;

condicional
       : FOR PA expr_logica PC LLAVEA* instrucciones LLAVEC* 
       | WHILE PA expr_logica PC LLAVEA* instrucciones LLAVEC*
       | IF PA expr_logica PC LLAVEA* instrucciones LLAVEC*
       | ELSE (PA expr_logica PC)* LLAVEA* instrucciones LLAVEC*
       ;

expr_logica
       : expr_logica (AND|OR) expr_logica
       | expr_compar 
       | PA expr_logica PC
       | ID
       | DIGITO
       | NOT expr_logica
       | expr_logica PYC expr_logica
       ;

expr_compar
       : expr_aritm comparador expr_aritm
       | PA expr_compar PC
       ;

expr_aritm
       : expr_aritm MULT expr_aritm
       | expr_aritm DIV expr_aritm
       | expr_aritm SUMA expr_aritm
       | expr_aritm RESTA expr_aritm
       | RESTA expr_aritm
       | PA expr_aritm PC
       | NOT PA expr_aritm PC
       | ID
       | DIGITO+
       | FLOAT
       PYC*
       ;