package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
//        // create a CharStream from your pseudo code string
//        CharStream input = CharStreams.fromString("seq(fun1(sda,sds),fun2(sd,ds,test,asd))");
//
//        // create a lexer that will tokenize the input
//        GrammarLexer lexer = new GrammarLexer(input);
//
//        // create a buffer of tokens that the parser will use
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        // create a parser that will parse the tokens
//        GrammarParser parser = new GrammarParser(tokens);
//
//        // parse the input and get the parse tree
//        ParseTree tree = parser.seq();
//
//        // create a visitor that will translate the parse tree to Java
//        PseudoToJavaVisitor J_visitor = new PseudoToJavaVisitor();
//
//        // create a visitor that will translate the parse tree to Python
//        PseudoToPythonVisitor Py_Visitor = new PseudoToPythonVisitor();
//
//        // visit the parse tree and get the translated Java code
//        String javaCode = J_visitor.visit(tree);
//        String pythonCode = Py_Visitor.visit(tree);
//
//        // output the translated Java code
//        System.out.println(javaCode);
//        // output the translated Python code
//        System.out.println(pythonCode);

        String input = "seq(fun1(x),seq(seq(fun2(x),fun3(y,z)),fun4(y,z)))";
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(input));
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        GrammarParser.SeqContext seqContext = parser.seq();
        GrammarListener listener = new PseudoToJavaListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, seqContext);

    }
}

