package addOns;

import types.HddUpgrade;
import types.Laptop;

import java.math.BigInteger;

public class HddUpgrade512GB extends HddUpgrade {

    public HddUpgrade512GB(Laptop laptop) {
        super(laptop);
        this.upgradeHdd = 512;
        this.additionalCost = new BigInteger("50");
        this.hddStorage = laptop.getHDD()+this.upgradeHdd;
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(this.additionalCost);
    };
}
