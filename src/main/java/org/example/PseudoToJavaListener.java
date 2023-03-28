package org.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.GrammarBaseListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PseudoToJavaListener extends GrammarBaseListener {

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if(ctx.isEmpty()){
            System.out.println(run);
            System.out.println(declaration);
        }
    }

    private StringBuilder run = new StringBuilder("");
    private StringBuilder declaration = new StringBuilder("");

    @Override
    public void enterFun(GrammarParser.FunContext ctx) {

        StringBuilder args = new StringBuilder("");
        StringBuilder args2 = new StringBuilder("");

        String functionName = ctx.PHRASE().getText();

//        System.out.println(ctx.getText());
//        ParseTree parent = ctx.getParent();
//        while (parent != null && !(parent instanceof GrammarParser.FunContext)) {
//            parent = parent.getParent();
//        }
//        if (parent instanceof GrammarParser.FunContext) {
//            System.out.println("The closest parent is a fun.");
//        } else {
//            System.out.println("The closest parent is not a fun.");
//        }

        ParseTree parent = ctx.getParent();
        while (parent != null && !(parent instanceof GrammarParser.FunContext)) {
            parent = parent.getParent();
        }

        run.append(functionName).append("(");

        if (parent != null) {
            declaration.append(functionName).append("(");
        } else {
            declaration.append("public void ").append(functionName).append("(");
        }
    }

    @Override
    public void exitFun(GrammarParser.FunContext ctx) {

//        System.out.println(ctx.getText());
        ParseTree parent = ctx.getParent();
        while (parent != null && !(parent instanceof GrammarParser.FunContext)) {
            parent = parent.getParent();
        }

        if (parent != null) {
            run.append(")");
            declaration.append(")");
        } else {
            run.append(");\n");
            declaration.append("){\n}\n");
        }
    }

//    @Override
//    public void visitTerminal(TerminalNode node) {
//        if (node.getSymbol().getType() == GrammarParser.PHRASE) {
//            System.out.print(node.getText());
//        } else if (node.getText().equals(",")) {
//            System.out.print(",");
//        }
//    }

    @Override
    public void enterArgs(GrammarParser.ArgsContext ctx) {

        ParseTree parent = ctx.getParent();
        while (parent != null && !(parent instanceof GrammarParser.FunContext)) {
            parent = parent.getParent();
        }

        if (ctx.fun() == null) {
            if (!ctx.getText().contains(",")) {
                run.append(ctx.getText());
                declaration.append(("int ")).append(ctx.getText());
            } else {
                run.append(", ");
                declaration.append(", ");
            }
        }
    }

    @Override
    public void exitArgs(GrammarParser.ArgsContext ctx) {

    }
}
