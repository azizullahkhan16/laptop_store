package types;

import java.math.BigInteger;

public abstract class Laptop {
    protected int ramMemory;
    protected int ssdStorage;
    protected BigInteger cost;

    public BigInteger getCost() {
        return this.cost;
    };

    public int getRAM() {
        return this.ramMemory;
    }

    public int getSSD() {
        return this.ssdStorage;
    }

}
