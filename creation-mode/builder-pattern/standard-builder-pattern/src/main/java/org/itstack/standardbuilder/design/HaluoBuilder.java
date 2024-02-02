package org.itstack.standardbuilder.design;

public class HaluoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶皮座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
