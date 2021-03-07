package com.company3;

import com.company3.ModernKit.preparedModernFurniture;

public class ModernFurnitureOrder {
    public static void main(String[] args) {
        FurnitureKit furnitureKit = new preparedModernFurniture();
        Chair chair = furnitureKit.getChair();
        Table table = furnitureKit.getTable();
        Sofa sofa = furnitureKit.getSofa();

        System.out.println("Creating Modern furniture kit...");
        chair.createChair();
        table.createTable();
        sofa.createSofa();
    }
}
