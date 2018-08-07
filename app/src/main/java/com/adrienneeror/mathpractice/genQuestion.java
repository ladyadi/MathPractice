package com.adrienneeror.mathpractice;

public class genQuestion {

    public static String genQuestion (int subject, int num1, int num2)
    {
        if (subject == 1) {
            String problem = "What is " + num1 + " + " + num2 + ":";
            return problem;
        }
        else if (subject == 2) {
            String problem = "What is " + num1 + " - " + num2 + ":";
            return problem;
        }
        else if (subject == 3) {
            String problem = "What is " + num1 + " x " + num2 + ": ";
            return problem;
        }
        else {
            String problem = "What is " + num1 + " / " + num2 + ":";
            return problem;
        }
    }
}