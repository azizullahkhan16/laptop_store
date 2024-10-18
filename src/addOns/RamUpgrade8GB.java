package addOns;

import enums.RamEnum;
import types.Laptop;
import types.RamUpgrade;

import java.math.BigInteger;

public class RamUpgrade8GB extends RamUpgrade {

    public RamUpgrade8GB(Laptop laptop) {
        super(laptop);
        this.upgradeRam = 8;
        this.additionalCost = new BigInteger("30");
}

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(this.additionalCost);
    };


}
