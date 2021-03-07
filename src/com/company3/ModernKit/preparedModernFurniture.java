package com.company3.ModernKit;

import com.company3.Chair;
import com.company3.FurnitureKit;
import com.company3.Sofa;
import com.company3.Table;

public class preparedModernFurniture implements FurnitureKit {
    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }

    @Override
    public Chair getChair() {
        return new ModernChair();
    }
}
