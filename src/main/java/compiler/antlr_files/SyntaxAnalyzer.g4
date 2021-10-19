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
TIPOV : INT | DOUBLE | CHAR;
TIPOF : VOID | TIPOV;

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

ID : (LETRA | UNDERSCORE) (LETRA | DIGITO)*;
//asignacion compone todos los tokens que se utilizan al declarar una variable
FLOAT : DIGITO+'.'+DIGITO+;

asignacion 
       : IGUAL expr_aritm;
      // | (' ' '-'? ' '? (LETRA | (DIGITO+ '.' DIGITO+) | DIGITO+));

programa : instrucciones  EOF     
         ; 

instrucciones : instruccion instrucciones
              |  
              ; 

instruccion :
       (TIPOV secvar 
       | secvar 
       | condicional)
       ;

secvar : 
       (dec_var  
       | asg_var)
//       | com_dec_var
//       | com_asg_var
       (COMA secvar)*
       PYC*
       ;  

com_asg_var : asg_var secvar;

asg_var : ID asignacion;

com_dec_var : ID COMA secvar; //cuando se declara una combinacion de variables

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
//       | NOT expr_logica (AND|OR) expr_logica
//       | expr_logica (AND|OR) NOT expr_logica
//       | NOT expr_logica (AND|OR) NOT expr_logica
       | expr_compar 
       | PA expr_logica PC
//       | NOT PA expr_logica PC
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
////     | (' ' '-'? ' '? (LETRA | (DIGITO+ '.' DIGITO+) | DIGITO+)) 
       