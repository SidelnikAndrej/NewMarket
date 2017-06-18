package com.company;

import java.security.SecureRandom;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        RandomPaymaster tmpSeller = new RandomPaymaster();
        Cashbox kassa = new Cashbox(tmpSeller);
        Random rand = new SecureRandom();
        for(int i=0; i<rand.nextInt(200); i++){
            RandomClient tmpClient = new RandomClient();
            kassa.newClient(tmpClient);
        }
        kassa.run();
    }
}
