package com.company3;

import com.company3.ArDecoKit.preparedArDecoFurniture;
import com.company3.ModernKit.preparedModernFurniture;

public class ArDecoFurnitureOrder {
    public static void main(String[] args) {
        FurnitureKit furnitureKit = new preparedArDecoFurniture();
        Chair chair = furnitureKit.getChair();
        Table table = furnitureKit.getTable();
        Sofa sofa = furnitureKit.getSofa();

        System.out.println("Creating Ar-Deco furniture kit...");
        chair.createChair();
        table.createTable();
        sofa.createSofa();
    }
}
