package com.taewon.algorithm.string.wordsInSentence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        findLongWords(input);
        return;
    }

    private static void findLongWords(String input) {

        String[] inputArray = input.split(" ");
        String currentInput = "";

        for (int index = 0; index < inputArray.length; index++) {
            if (index == 0) {
                currentInput = inputArray[index];
            } else {
                if (currentInput.length() < inputArray[index].length()) {
                    currentInput = inputArray[index];
                }
            }
        }
        System.out.println(currentInput);
    }
}
