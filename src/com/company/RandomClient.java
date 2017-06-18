package com.company;

/**
 * Created by Андрей on 18.06.2017.
 */
public class RandomClient extends RandomHuman implements Client {
    @Override
    public int purchaseOfGoods() {
        return returnRandTime();
    }
}
