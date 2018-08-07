package com.adrienneeror.mathpractice;

public class isAnswerCorrect {

    public static boolean isAnswerCorrect(int subject, int num1, int num2, int answer) {
        if (subject == 1) {
            return num1 + num2 == answer;
        } else if (subject == 2) {
            return num1 - num2 == answer;
        } else if (subject == 3) {
            return num1 * num2 == answer;
        } else {
            return num1 / num2 == answer;
        }

    }
}