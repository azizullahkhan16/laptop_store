package brands;

import types.Laptop;

public abstract class Apple extends Laptop {

    @Override
    public String toString() {
        return "Brand: Lenovo\n" +
                "Model: ThinkPad\n" +
                "RAM: " + this.ramMemory + "\n" +
                "SSD: " + this.ssdStorage + "\n";
    }
}
