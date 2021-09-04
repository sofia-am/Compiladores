package variables;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Lexer;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        CharStream input = CharStreams.fromFileName("src/entrada.txt");
        // create a lexer that feeds off of input CharStream
        SyntaxAnalyzerLexer lexer = new  SyntaxAnalyzerLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        SyntaxAnalyzerParser parser = new SyntaxAnalyzerParser(tokens);

        parser.programa();
    }
}
