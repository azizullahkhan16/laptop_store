package brands;

import types.Laptop;

public abstract class HP extends Laptop {
    protected int hddStorage;

    public int getHdd() {
        return this.hddStorage;
    }

    @Override
    public String toString() {
        return "Brand: HP\n" +
                "Model: ThinkPad\n" +
                "RAM: " + this.ramMemory + "GB\n" +
                "SSD: " + this.ssdStorage + "GB\n" +
                "HDD: " + this.hddStorage + "GB\n" +
                "Cost: $" + this.getCost();
    };
}
