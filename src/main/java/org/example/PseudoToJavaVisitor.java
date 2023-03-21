package org.example;

import java.util.Objects;

class PseudoToJavaVisitor extends GrammarBaseVisitor<String> {
    @Override
    public String visitSeq(GrammarParser.SeqContext ctx) {
        // translate the seq rule of the grammar to Java
        return visit(ctx.fun(0)) + "\n" + visit(ctx.fun(1)) + "\n";
    }

    //    Wersja do Javy
    @Override
    public String visitFun(GrammarParser.FunContext ctx) {
        // translate a function in the grammar to Java
        String functionName = ctx.PHRASE().getText();
        String args = "";
        if (ctx.args() != null) {

            for (int i = 0; i < ctx.getChildCount(); i++) {
                for (int j = 0; j < ctx.getChild(i).getChildCount(); j++) {
                    if (!Objects.equals(ctx.getChild(i).getChild(j).getText(), ",")) {
                        args += "int " + ctx.getChild(i).getChild(j).getText();
                    } else {
                        args += ", ";
                    }
                }
            }
        }
        return "public void " + functionName + "(" + args + "){\n}";
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
