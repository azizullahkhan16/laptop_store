package brands;

import types.Laptop;

import java.math.BigInteger;

public abstract class Lenovo extends Laptop {

    public Lenovo() {
        this.brand = "Lenovo";
    }

    @Override
    public int getHDD() {
        return this.hddStorage;
    }

    @Override
    public String toString() {
        return "======= LAPTOP SPECIFICATIONS ========\n" +
                "Brand: " + this.brand +"\n" +
                "Model: " + this.model + "\n" +
                "RAM: " + this.ramMemory + "GB\n" +
                "SSD: " + this.ssdStorage + "GB\n" +
                "HDD: " + this.hddStorage + "GB\n" +
                "Cost: $" + this.getCost() +
                "\n--------------------------------------\n";
    };
}
