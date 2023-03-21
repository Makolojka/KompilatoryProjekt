// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(gParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(gParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(gParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(gParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(gParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(gParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(gParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrays(gParser.ArraysContext ctx);
}