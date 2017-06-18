package com.company;

/**
 * Created by Андрей on 18.06.2017.
 */
public interface Paymaster {

    int scanProduct ();

    int sayAmount ();

    int calculateMoney();

    int giveChange();
}
