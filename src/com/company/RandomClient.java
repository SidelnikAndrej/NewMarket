package com.company;

/**
 * Created by Андрей on 18.06.2017.
 */
public class RandomClient extends RandomHuman implements Client {
    @Override
    public int layOutGoods() {
        return returnRandTime();
    }

    @Override
    public int giveMoney() {
        return returnRandTime();
    }
}
