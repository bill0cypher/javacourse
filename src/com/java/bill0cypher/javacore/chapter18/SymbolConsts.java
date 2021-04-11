package com.java.bill0cypher.javacore.chapter18;

import java.util.List;

public class SymbolConsts {
    public static final String QUOTE = "{";
    public static final String BRACKET = "(";
    public static final String SQUARE_BRACKET = "[";
    public static final String QUOTE_R = "}";
    public static final String BRACKET_R = ")";
    public static final String SQUARE_BRACKET_R = "]";

    public static List<String> getConstants() {
        return List.of(QUOTE, BRACKET, SQUARE_BRACKET, QUOTE_R, BRACKET_R, SQUARE_BRACKET_R);
    }

    public static String getOppositeChar(String character) {
        return switch (character) {
            case SQUARE_BRACKET -> SQUARE_BRACKET_R;
            case SQUARE_BRACKET_R -> SQUARE_BRACKET;
            case BRACKET -> BRACKET_R;
            case BRACKET_R -> BRACKET;
            case QUOTE -> QUOTE_R;
            case QUOTE_R -> QUOTE;
            default -> null;
        };
    }
}
