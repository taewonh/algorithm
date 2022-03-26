package com.taewon.algorithm.string.reverseWords;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        reverseWords();
        return;
    }

    private static void reverseWords() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = new String[count];

        for (int index = 0; index < count; index++) {
            String input = scanner.nextLine();
            inputArray[index] = input;
        }

        for (int index = 0; index < count; index++) {
            char[] charArray = inputArray[index].toCharArray();
            int inputLength = charArray.length;

            for (int inputIndex = inputLength - 1; inputIndex >= 0; inputIndex--) {
                System.out.print(charArray[inputIndex]);
            }
            System.out.println();
        }
    }
}
