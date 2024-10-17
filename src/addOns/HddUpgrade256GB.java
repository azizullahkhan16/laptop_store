package addOns;

import types.HddUpgrade;
import types.Laptop;

import java.math.BigInteger;

public class HddUpgrade256GB extends HddUpgrade {

    public HddUpgrade256GB(Laptop laptop) {
        super(laptop);
        this.upgradeHdd = 256;
        this.additionalCost = new BigInteger("20");
        this.hddStorage = laptop.getHDD()+this.upgradeHdd;
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(this.additionalCost);
    };
}
