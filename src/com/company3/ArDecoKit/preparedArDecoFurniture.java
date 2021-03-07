package com.company3.ArDecoKit;

import com.company3.Chair;
import com.company3.FurnitureKit;
import com.company3.Sofa;
import com.company3.Table;

public class preparedArDecoFurniture implements FurnitureKit {
    @Override
    public Sofa getSofa() {
        return new ArDecoSofa();
    }

    @Override
    public Table getTable() {
        return new ArDecoTable();
    }

    @Override
    public Chair getChair() {
        return new ArDecoChair();
    }
}
