package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        // create a CharStream from your pseudo code string
        CharStream input = CharStreams.fromString("seq(fun1(sda,sds, a , b),fun2(sd,ds, test,   asd))");

        // create a lexer that will tokenize the input
        GrammarLexer lexer = new GrammarLexer(input);

        // create a buffer of tokens that the parser will use
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that will parse the tokens
        GrammarParser parser = new GrammarParser(tokens);

        // parse the input and get the parse tree
        ParseTree tree = parser.seq();

        // create a visitor that will translate the parse tree to Java
        PseudoToJavaVisitor visitor = new PseudoToJavaVisitor();

        // visit the parse tree and get the translated Java code
        String javaCode = visitor.visit(tree);

        // output the translated Java code
        System.out.println(javaCode);
    }
}

class PseudoToJavaVisitor extends GrammarBaseVisitor<String> {
    @Override
    public String visitSeq(GrammarParser.SeqContext ctx) {
        // translate the seq rule of the grammar to Java
        return visit(ctx.fun(0)) + "\n" + visit(ctx.fun(1)) + "\n";
    }

    @Override
    public String visitFun(GrammarParser.FunContext ctx) {
        // translate a function in the grammar to Java
        String functionName = ctx.PHRASE().getText();
        String args = "";
        if (ctx.args() != null) {

            for(int i=0;i<ctx.getChildCount();i++ ){
                for(int j = 0; j < ctx.getChild(i).getChildCount(); j++){
                    if(!Objects.equals(ctx.getChild(i).getChild(j).getText(), ",")){
                        args += "int " + ctx.getChild(i).getChild(j).getText();
                    }
                    else {
                        args += ", ";
                    }
                }
            }
        }
        return "public void "+ functionName + "(" + args + "){\n}";
    }

    private String translateOperator(String op) {
        // translate an operator in the pseudo language to Java
        switch (op) {
            case "+":
                return " + ";
            case "-":
                return " - ";
            case "*":
                return " * ";
            case "/":
                return " / ";
            default:
                return "";
        }
    }
}
