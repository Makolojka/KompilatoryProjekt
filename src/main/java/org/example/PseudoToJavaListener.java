package org.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.GrammarBaseListener;

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

    private String run = "";
    private String declaration = "";

    @Override
    public void enterFun(GrammarParser.FunContext ctx) {
        String functionName = ctx.PHRASE().getText();
        StringBuilder args = new StringBuilder();
        StringBuilder args2 = new StringBuilder();
        if (ctx.args() != null) {

            for (int i = 0; i < ctx.getChildCount(); i++) {
                for (int j = 0; j < ctx.getChild(i).getChildCount(); j++) {
                    if (!Objects.equals(ctx.getChild(i).getChild(j).getText(), ",")) {
                        args.append("int ").append(ctx.getChild(i).getChild(j).getText());
                        args2.append(ctx.getChild(i).getChild(j).getText());
                    } else {
                        args.append(", ");
                        args2.append(", ");
                    }
                }
            }
        }
        run += functionName + "(" + args2 + ");\n";
        declaration += "public void " + functionName + "(" + args + "){\n}\n";

//        System.out.println(functionName + "(" + args2 + ");\n" +  "public void " + functionName + "(" + args + "){\n}");
    }

    @Override
    public void exitFun(GrammarParser.FunContext ctx) {
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
//        System.out.println(ctx.args());
//        System.out.println(ctx.PHRASE());
    }
}
