package addOns;

import types.HddUpgrade;
import types.Laptop;

import java.math.BigInteger;

public class HddUpgrade1TB extends HddUpgrade {

    public HddUpgrade1TB(Laptop laptop) {
        super(laptop);
        this.upgradeHdd = 1024;
        this.additionalCost = new BigInteger("70");
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(this.additionalCost);
    };

}
