package brands;

import types.Laptop;

public abstract class Apple extends Laptop {

    public Apple() {
        this.brand = "Apple";
    }
    @Override
    public int getHDD() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public String toString() {
        return "======= LAPTOP SPECIFICATIONS ========\n" +
                "Brand: " + this.brand +"\n" +
                "Model: " + this.model + "\n" +
                "RAM: " + this.ramMemory + "GB\n" +
                "SSD: " + this.ssdStorage + "GB\n" +
                "Cost: $" + this.getCost() +
                "\n--------------------------------------\n";
    }
}
