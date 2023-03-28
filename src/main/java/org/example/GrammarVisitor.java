// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(GrammarParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(GrammarParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(GrammarParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GrammarParser.ArgsContext ctx);
}