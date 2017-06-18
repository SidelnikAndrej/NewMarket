package com.company;

import java.util.Random;

/**
 * Created by Андрей on 18.06.2017.
 */
public class RandomPaymaster extends RandomHuman implements Paymaster{
    @Override
    public int saleOfGoods() {
        return returnRandTime();
    }
}