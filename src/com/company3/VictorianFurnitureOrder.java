package com.company3;

import com.company3.ArDecoKit.preparedArDecoFurniture;
import com.company3.VictorianKit.VictorianChair;
import com.company3.VictorianKit.preparedVictorianFurniture;

public class VictorianFurnitureOrder {
    public static void main(String[] args) {
        FurnitureKit furnitureKit = new preparedVictorianFurniture();
        Chair chair = furnitureKit.getChair();
        Table table = furnitureKit.getTable();
        Sofa sofa = furnitureKit.getSofa();

        System.out.println("Creating Victorian furniture kit...");
        chair.createChair();
        table.createTable();
        sofa.createSofa();
    }
}
