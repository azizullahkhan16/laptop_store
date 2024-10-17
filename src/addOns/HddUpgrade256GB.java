package addOns;

import types.HddUpgrade;
import types.Laptop;

import java.math.BigInteger;

public class HddUpgrade256GB extends HddUpgrade {

    public HddUpgrade256GB(Laptop laptop) {
        super(laptop);
        this.upgradeHdd = 256;
        this.hddStorage = laptop.getHDD()+this.upgradeHdd;
    }

    @Override
    public int getHDD() {
        return laptop.getHDD();
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(new BigInteger("20"));
    };
}
