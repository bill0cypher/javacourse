package com.java.bill0cypher.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TextAnalyzer {
    public static void main(String ...args) {
        String strToCheck = "public static void main(String ...args){}";
        System.out.println("Is the next string correct: " + strToCheck + " Result: " + isStringCorrect(strToCheck));
    }

    public static boolean isStringCorrect(String string) {
        char[] strSymbols = string.toCharArray();
        Map<String, Integer> symbolsCount = new HashMap<>();
        for (char symbol : strSymbols) {
            String sym = String.valueOf(symbol);
            if (SymbolConsts.getConstants().contains(sym)) {
                if (symbolsCount.containsKey(sym))
                    symbolsCount.put(sym, symbolsCount.get(sym) + 1);
                else
                    symbolsCount.put(sym, 1);
            }
        }
        return symbolsCount.entrySet().stream().allMatch(entry -> Objects.equals(entry.getValue(), symbolsCount.get(SymbolConsts.getOppositeChar(entry.getKey()))));
    }
}
