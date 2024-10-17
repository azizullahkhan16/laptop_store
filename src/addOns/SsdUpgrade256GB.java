package addOns;

import types.Laptop;
import types.SsdUpgrade;

import java.math.BigInteger;

public class SsdUpgrade256GB extends SsdUpgrade {

    public SsdUpgrade256GB(Laptop laptop) {
        super(laptop);
        this.upgradeSsd = 256;
        this.additionalCost = new BigInteger("50");
        this.ssdStorage = laptop.getSSD()+this.upgradeSsd;
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(this.additionalCost);
    };
}
