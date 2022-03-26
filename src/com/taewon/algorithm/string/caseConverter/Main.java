package com.taewon.algorithm.string.caseConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        caseConverter();
        return;
    }

    private static void caseConverter() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = new char[input.length()];

        for (int index = 0; index < input.length(); index++) {
            char indexChar = input.charAt(index);
            if (Character.isUpperCase(indexChar)) {
                indexChar = Character.toLowerCase(indexChar);
            } else {
                indexChar = Character.toUpperCase(indexChar);
            }
            chars[index] = indexChar;
        }
        System.out.println(String.copyValueOf(chars));
    }
}
