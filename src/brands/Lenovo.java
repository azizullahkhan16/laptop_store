package brands;

import types.Laptop;

import java.math.BigInteger;

public abstract class Lenovo extends Laptop {
    protected int hddStorage;

    public int getHddStorage() {
        return this.hddStorage;
    }

    @Override
    public String toString() {
        return "Brand: Lenovo\n" +
                "Model: ThinkPad\n" +
                "RAM: " + this.ramMemory + "\n" +
                "SSD: " + this.ssdStorage + "\n" +
                "HDD: " + this.hddStorage + "\n";
    };
}
