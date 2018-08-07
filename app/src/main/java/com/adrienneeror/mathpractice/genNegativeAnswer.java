package com.adrienneeror.mathpractice;

import java.util.Random;

public class genNegativeAnswer {

    //string method for random responses to reduce fatigue (incorrect answer)
    public static String genNegativeAnswer()
    {
        int rand = new Random().nextInt(4);

        switch(rand)
        {
            case 0:
                return "No. Please try again.";
            case 1:
                return "Wrong. Try once more.";
            case 2:
                return "Don't give up!";
            case 3:
                return "No. Keep trying.";
            default:
                return "Wrong. I believe in you!";
        }
    }
}
