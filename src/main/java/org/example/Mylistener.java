package org.example;

import org.antlr.v4.runtime.ParserRuleContext;

public class Mylistener extends GrammarBaseListener {
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule entered: " + ctx.getText());      //code that executes per rule
    }
}
