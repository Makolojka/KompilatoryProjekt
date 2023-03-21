package org.example;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseCancellationException {

        CharStream charStream = CharStreams.fromString("seq(fun1(a,b),fun2())");
        GrammarLexer grammarLexerLexer = new GrammarLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexerLexer);
        GrammarParser grammarParser = new GrammarParser(commonTokenStream);
        grammarParser.addErrorListener(ThrowingErrorListener.INSTANCE);

        grammarParser.seq();

//        CharStream charStream = CharStreams.fromString("class test{" +
//                "    int a;" +
//                "    int b;" +
//                "}");
//        gLexer gLexer = new gLexer(charStream);
//        CommonTokenStream commonTokenStream = new CommonTokenStream(gLexer);
//        gParser gParser = new gParser(commonTokenStream);
//        gParser.addErrorListener(ThrowingErrorListener.INSTANCE);

//        gParser.classDeclaration();

//        System.out.println(gParser.classDeclaration().PHRASE().getSymbol().getText());
//        System.out.println(gParser.classDeclaration().classBody(0).getChildCount());
//        System.out.println(gParser.classDeclaration().classBody(0).getChild(0).getChild(0).getText());

//        System.out.println(gParser.classDeclaration().getClass().getName());

//        org.example.gParser.ClassDeclarationContext classDeclarationContext = gParser.classDeclaration();
//
//        for(int i = 0; i < classDeclarationContext.classBody(0).getChildCount(); i++){
//            System.out.println(classDeclarationContext.classBody(0).getChild(i).getChild(0).getText());
//            System.out.println(classDeclarationContext.classBody(0).getChild(i).getChild(1).getText());
//        }

        System.out.println("Działa");
    }
}
