// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(gParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(gParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(gParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(gParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(gParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(gParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(gParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(gParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(gParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(gParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(gParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(gParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(gParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(gParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrays}.
	 * @param ctx the parse tree
	 */
	void enterArrays(gParser.ArraysContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrays}.
	 * @param ctx the parse tree
	 */
	void exitArrays(gParser.ArraysContext ctx);
}