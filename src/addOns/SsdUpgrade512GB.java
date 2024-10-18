package addOns;

import types.Laptop;
import types.SsdUpgrade;

import java.math.BigInteger;

public class SsdUpgrade512GB extends SsdUpgrade {

    public SsdUpgrade512GB(Laptop laptop) {
        super(laptop);
        this.upgradeSsd = 512;
        this.additionalCost = new BigInteger("90");
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(this.additionalCost);
    };
}
