package addOns;

import types.Laptop;
import types.SsdUpgrade;

import java.math.BigInteger;

public class SsdUpgrade1TB extends SsdUpgrade {
    public SsdUpgrade1TB(Laptop laptop) {
        super(laptop);
        this.upgradeSsd = 1024;
        this.additionalCost = new BigInteger("140");
        this.ssdStorage = laptop.getSSD()+this.upgradeSsd;
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(this.additionalCost);
    };
}
