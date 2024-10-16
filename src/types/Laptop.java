package types;

import java.math.BigInteger;

public abstract class Laptop {
    protected int ramMemory;
    protected int ssdStorage;


    public abstract BigInteger getCost();

    public int getRAM() {
        return this.ramMemory;
    }

    public int getSSD() {
        return this.ssdStorage;
    }

}
