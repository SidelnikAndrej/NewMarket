package com.company;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Андрей on 18.06.2017.
 */
public class RandomHuman {
    private final Random randTime = new SecureRandom();

    protected int returnRandTime(){
        return randTime.nextInt(120);
    }
}
