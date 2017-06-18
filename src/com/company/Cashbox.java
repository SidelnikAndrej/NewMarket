package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Андрей on 18.06.2017.
 */
public class Cashbox implements Runnable{

    private final Paymaster seller;
    private final Queue<Client> queueClient= new LinkedList<>();

    public Cashbox(Paymaster seller){
        this.seller = seller;
    }

    public void newClient(Client customer){
        queueClient.add(customer);
    }

    public void run(){
        int numberClient = 0;
        int resaltTime = 0;
        Client customer;
        while ((customer = queueClient.poll()) != null){
            resaltTime += customer.purchaseOfGoods();
            resaltTime += seller.saleOfGoods();
            numberClient++;
        }
        System.out.println(
                "Количество клиентов: "+numberClient+" обслужилось за: "+resaltTime+" секунд."
        );
    }
}
