package brands;

import types.Laptop;

public abstract class Apple extends Laptop {

    @Override
    public String toString() {
        return "Brand: Apple\n" +
                "Model: ThinkPad\n" +
                "RAM: " + this.ramMemory + "GB\n" +
                "SSD: " + this.ssdStorage + "GB\n" +
                "Cost: $" + this.getCost();
    }
}
