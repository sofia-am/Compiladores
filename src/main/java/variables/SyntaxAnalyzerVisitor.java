// Generated from c:\Users\sofia\Compiladores\Compiladores\Nueva carpeta\Compiladores\src\main\java\variables\SyntaxAnalyzer.g4 by ANTLR 4.8

    package variables;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SyntaxAnalyzerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SyntaxAnalyzerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SyntaxAnalyzerParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SyntaxAnalyzerParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxAnalyzerParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(SyntaxAnalyzerParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxAnalyzerParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(SyntaxAnalyzerParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxAnalyzerParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(SyntaxAnalyzerParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxAnalyzerParser#secvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecvar(SyntaxAnalyzerParser.SecvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxAnalyzerParser#comvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComvar(SyntaxAnalyzerParser.ComvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxAnalyzerParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SyntaxAnalyzerParser.VarContext ctx);
}