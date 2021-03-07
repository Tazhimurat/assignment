package com.company3.VictorianKit;

import com.company3.Chair;
import com.company3.FurnitureKit;
import com.company3.Sofa;
import com.company3.Table;

public class preparedVictorianFurniture implements FurnitureKit {
    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table getTable() {
        return new VictorianTable();
    }

    @Override
    public Chair getChair() {
        return new VictorianChair();
    }
}
