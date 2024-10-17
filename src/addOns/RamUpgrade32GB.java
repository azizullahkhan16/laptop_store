package addOns;

import types.Laptop;
import types.RamUpgrade;

import java.math.BigInteger;

public class RamUpgrade32GB extends RamUpgrade {


    public RamUpgrade32GB(Laptop laptop) {
        super(laptop);
        this.upgradeRam = 32;
        this.ramMemory = laptop.getRAM()+this.upgradeRam;
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(new BigInteger("120"));
    };
}
