package types;

import java.math.BigInteger;

public abstract class Laptop {
    protected int ramMemory;
    protected int ssdStorage;
    protected BigInteger cost;
    protected String brand;
    protected String model;
    protected int hddStorage;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public BigInteger getCost() {
        return this.cost;
    };

    public int getRAM() {
        return this.ramMemory;
    }

    public abstract int getHDD();

    public int getSSD() {
        return this.ssdStorage;
    }

}
