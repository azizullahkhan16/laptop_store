package types;

import java.math.BigInteger;

public abstract class AddOnDecorator extends Laptop{
    protected Laptop laptop;
    protected BigInteger additionalCost;

    public BigInteger getAdditionalCost() {
        return additionalCost;
    }

    @Override
    public int getHDD() {
        return this.hddStorage;
    }

    public abstract int getUpgrade();

}
