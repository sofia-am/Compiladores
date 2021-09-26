package compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import compiler.analizador_semantico.Funcion;
import compiler.analizador_semantico.TablaSimbolos;
import compiler.analizador_semantico.TipoDato;
import compiler.analizador_semantico.Variable;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Lexer;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        /* ================================TEST ZONE ================================== */

        // chequeo que tengan el mismo id de objeto para asegurarme que funciona el singletone
        TablaSimbolos tablaSimbolos = TablaSimbolos.getInstanceOf();
        System.out.println(tablaSimbolos);
        TablaSimbolos tablaSimbolos2 = TablaSimbolos.getInstanceOf();
        System.out.println(tablaSimbolos2);

        ArrayList<TipoDato> argumentos = new ArrayList<TipoDato>();
        
        argumentos.add(TipoDato.CHAR);
        argumentos.add(TipoDato.INT);
        
        Funcion funcion = new Funcion(TipoDato.VOID, "test", argumentos, false, false);
        
        System.out.println(funcion.toString());
        
        Variable var = new Variable(TipoDato.INT, "num", false, false);
        Variable var2 = new Variable(TipoDato.INT, "num2", false, false);
        Variable var3 = new Variable(TipoDato.INT, "num3", false, false);

        System.out.println(var.toString());
        
        tablaSimbolos.addContexto();
        tablaSimbolos.addSimbolo(var);
        tablaSimbolos.addSimbolo(funcion);
        tablaSimbolos.addContexto();
        tablaSimbolos.addSimbolo(var2);

        System.out.println(tablaSimbolos.buscarSimbolo(var2).toString() + " " + tablaSimbolos.buscarSimboloLocal(var).toString());
        
        /* =============================END TEST ZONE ================================= */

        //===============================ANTLR ZONE ======================================
        
        /* 
        CharStream input = CharStreams.fromFileName("src/entrada.txt");
        // create a lexer that feeds off of input CharStream
        SyntaxAnalyzerLexer lexer = new  SyntaxAnalyzerLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        SyntaxAnalyzerParser parser = new SyntaxAnalyzerParser(tokens);

        parser.programa();
        */

        //=============================END ANTLR ZONE ======================================
    }
}