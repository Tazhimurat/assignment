package com.company2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the way you want to deliver: ");
        String delivery = sc.next();
        Factory factory = deliverGoodsByFactory(delivery);
        Logistics logistics = factory.factoryLogistics();

        logistics.deliver();
    }

    static Factory deliverGoodsByFactory(String goods){
        if(goods.equalsIgnoreCase("sea")){
            return new SeaLogisticsFactory();
        }
        else if(goods.equalsIgnoreCase("road")){
            return new RoadLogisticsFactory();
        }
        else{
            throw new RuntimeException("Goods are not delivered in this factory by - " + goods);
        }
    }
}
