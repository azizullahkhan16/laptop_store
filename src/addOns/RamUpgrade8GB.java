package addOns;

import enums.RamEnum;
import types.Laptop;
import types.RamUpgrade;

import java.math.BigInteger;

public class RamUpgrade8GB extends RamUpgrade {

    public RamUpgrade8GB(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public int getUpgrade() {
        return this.laptop.getRAM()+8;
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(new BigInteger("100"));
    };
}
