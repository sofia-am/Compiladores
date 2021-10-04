package compiler.antlr_files;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiler.antlr_files.SyntaxAnalyzerParser.DeclaracionContext;
import compiler.antlr_files.SyntaxAnalyzerParser.ProgramaContext;
import compiler.antlr_files.SyntaxAnalyzerParser.SecvarContext;

public class OurListener extends SyntaxAnalyzerBaseListener {
    private Integer tokens = 0;
    private Integer decl = 0;
    private Integer vars = 0;

    @Override public void visitTerminal(TerminalNode node) {
        tokens++;
        // System.out.println("|" + node.getText() + "|");
    }

    @Override
    public void enterDeclaracion(DeclaracionContext ctx) {
        decl++;
        System.out.print("Inicio declaracion ->" + ctx.getText());
        System.out.println("<- | start |" + ctx.getStart() + "| stop |" + ctx.getStop() + "|");
    }

    @Override
    public void exitSecvar(SecvarContext ctx) {
        vars++;
        System.out.println("  ---> Variable |" + ctx.getStart().getText() + "|");        
    }

    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        System.out.print("Fin declaracion ->" + ctx.getText());
        System.out.println("<- | start |" + ctx.getStart() + "| stop |" + ctx.getStop() + "|");
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
    }

}