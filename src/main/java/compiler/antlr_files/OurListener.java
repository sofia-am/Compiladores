package compiler.antlr_files;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiler.analizador_semantico.TablaSimbolos;
import compiler.analizador_semantico.TipoDato;
import compiler.analizador_semantico.Variable;
import compiler.antlr_files.SyntaxAnalyzerParser.Asg_varContext;
//import compiler.analizador_semantico.Variable;
import compiler.antlr_files.SyntaxAnalyzerParser.BloqueContext;
import compiler.antlr_files.SyntaxAnalyzerParser.Dec_varContext;
import compiler.antlr_files.SyntaxAnalyzerParser.ProgramaContext;
import compiler.antlr_files.SyntaxAnalyzerParser.SecvarContext;

public class OurListener extends SyntaxAnalyzerBaseListener {
    private Integer tokens = 0;
    private Integer decl = 0;
    private Integer vars = 0;
    private Integer cont = 0;

    @Override public void visitTerminal(TerminalNode node) {
        tokens++;
        // System.out.println("|" + node.getText() + "|");
    }

    @Override
    public void exitSecvar(SecvarContext ctx) {
        vars++;
        System.out.println("  ---> Variable |" + ctx.getStart().getText() + "|");        
    }
    

    @Override
    public void enterDec_var(Dec_varContext ctx) {
        vars++;
        //TipoDato tipo = 
        /*  -> podríamos ver la regla segvar, si viene una asg_var entonces está inicializado
            -> como consultamos el tipo dato si eso lo declara en instruccion? y en asg_var ni siquiera lo tiene
            -> dec_var -> esta inicializado? no
            -> asg_var -> esta inicializado? si
            -> usado?????????
            -> nombre = ctx.getText();
        */
        Variable var = new Variable(tipo, nombre, inicializado, usado);
    }
    

    @Override
    public void enterAsg_var(Asg_varContext ctx) {
        
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        cont++;
        TablaSimbolos tablasim = TablaSimbolos.getInstanceOf();
        tablasim.addContexto();
    }


    @Override
    public void exitBloque(BloqueContext ctx) {
        TablaSimbolos tablasim = TablaSimbolos.getInstanceOf();
        tablasim.delContexto();
    }


    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("Comienza compilacion");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("Fin compilacion");
        System.out.println("Se encontraron " + tokens + " tokens");
        System.out.println("Se realizaron " + decl + " declaraciones");
        System.out.println("Se declararon " + vars + " variables");
        System.out.println("Se crearon "+ cont + " bloques/contextos");
    }

}