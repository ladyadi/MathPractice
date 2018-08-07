package com.adrienneeror.mathpractice;

import java.util.Random;

public class genNum {

    public static int genNum(int level)
    {
        if (level == 1) {
            return new Random().nextInt(10);
        }
        else if (level == 2) {
            return new Random().nextInt(99 + 1 - 10) + 10;
        }
        else if (level == 3) {
            return new Random().nextInt(999 + 1 - 100) + 100;
        }
        else {
            return new Random().nextInt(9999 + 1 - 1000) + 1000;
        }

    }
}
