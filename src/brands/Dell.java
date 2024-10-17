package brands;

import types.Laptop;

public abstract class Dell extends Laptop {

    public Dell() {
        this.brand = "Dell";
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
                "Cost: $" + this.getCost()  +
                "\n--------------------------------------\n";
    };
}
