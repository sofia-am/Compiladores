// Generated from /home/juanmagil/MEGA/Facultad/Compiladores/TP_Variables/Compiladores/src/main/java/variables/SyntaxAnalyzer.g4 by ANTLR 4.8

    package variables;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaxAnalyzerParser}.
 */
public interface SyntaxAnalyzerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaxAnalyzerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SyntaxAnalyzerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxAnalyzerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SyntaxAnalyzerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxAnalyzerParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(SyntaxAnalyzerParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxAnalyzerParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(SyntaxAnalyzerParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxAnalyzerParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(SyntaxAnalyzerParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxAnalyzerParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(SyntaxAnalyzerParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxAnalyzerParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SyntaxAnalyzerParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxAnalyzerParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SyntaxAnalyzerParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxAnalyzerParser#secvar}.
	 * @param ctx the parse tree
	 */
	void enterSecvar(SyntaxAnalyzerParser.SecvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxAnalyzerParser#secvar}.
	 * @param ctx the parse tree
	 */
	void exitSecvar(SyntaxAnalyzerParser.SecvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxAnalyzerParser#comvar}.
	 * @param ctx the parse tree
	 */
	void enterComvar(SyntaxAnalyzerParser.ComvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxAnalyzerParser#comvar}.
	 * @param ctx the parse tree
	 */
	void exitComvar(SyntaxAnalyzerParser.ComvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxAnalyzerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SyntaxAnalyzerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxAnalyzerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SyntaxAnalyzerParser.VarContext ctx);
}