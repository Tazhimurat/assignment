package com.company2;

public class SeaLogisticsFactory implements Factory{
    @Override
    public Logistics factoryLogistics(){
        return new SeaLogistics();
    }
}
