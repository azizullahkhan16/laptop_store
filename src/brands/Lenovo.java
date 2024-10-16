package brands;

import types.Laptop;

import java.math.BigInteger;

public abstract class Lenovo extends Laptop {
    protected int hddStorage;

    public int getHdd() {
        return this.hddStorage;
    }

    @Override
    public String toString() {
        return "Brand: Lenovo\n" +
                "Model: ThinkPad\n" +
                "RAM: " + this.ramMemory + "GB\n" +
                "SSD: " + this.ssdStorage + "GB\n" +
                "HDD: " + this.hddStorage + "GB\n" +
                "Cost: $" + this.getCost();
    };
}
