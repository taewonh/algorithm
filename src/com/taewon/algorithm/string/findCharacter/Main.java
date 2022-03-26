package com.taewon.algorithm.string.findCharacter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        findCharacter();
    }

    private static void findCharacter() {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String character = scanner.nextLine();

        int count = getEqualsCount(input, character.toLowerCase().toCharArray()[0]);
        System.out.println(count);
        return;
    }

    private static int getEqualsCount(String input, char character) {

        int equalsCount = 0;
        char[] chars = input.toLowerCase().toCharArray();

        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == character) {
                equalsCount++;
            }
        }
        return equalsCount;
    }
}
