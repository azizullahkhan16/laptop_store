package types;

import java.math.BigInteger;

public abstract class AddOnDecorator extends Laptop{
    protected Laptop laptop;
    protected BigInteger additionalCost;

    public AddOnDecorator(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getBrand() {
        return this.laptop.getBrand();
    }

    @Override
    public String getModel() {
        return this.laptop.getModel();
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost();
    };

    @Override
    public int getRAM() {
        return this.laptop.getRAM();
    }

    @Override
    public int getSSD() {
        return this.laptop.getSSD();
    }

    public BigInteger getAdditionalCost() {
        return additionalCost;
    }

    @Override
    public int getHDD() {
        return this.hddStorage;
    }

    public abstract int getUpgrade();

}
