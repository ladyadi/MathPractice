package com.adrienneeror.mathpractice;

import java.util.Random;

public class genPositiveAnswer {
    //string method for random responses to reduce fatigue (correct answer)
    public static String genPositiveAnswer()
    {
        int rand = new Random().nextInt(4);

        switch(rand)
        {
            case 0:
                return "Very Good!";
            case 1:
                return "Excellent!";
            case 2:
                return "Nice Work!";
            case 3:
                return "Keep up the good work!";
            default:
                return "Way to go!";
        }
    }
}
