package com.company2;

public class RoadLogisticsFactory implements Factory{
    @Override
    public Logistics factoryLogistics(){
        return new RoadLogistics();
    }
}
