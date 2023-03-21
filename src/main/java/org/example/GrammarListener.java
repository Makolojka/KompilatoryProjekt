// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(GrammarParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(GrammarParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(GrammarParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(GrammarParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammarParser.ArgsContext ctx);
}