package com.company;

import java.util.Random;

/**
 * Created by Андрей on 18.06.2017.
 */
public class RandomPaymaster extends RandomHuman implements Paymaster{

    @Override
    public int scanProduct() {
        return returnRandTime();
    }

    @Override
    public int sayAmount() {
        return returnRandTime();
    }

    @Override
    public int calculateMoney() {
        return returnRandTime();
    }

    @Override
    public int giveChange() {
        return returnRandTime();
    }
}