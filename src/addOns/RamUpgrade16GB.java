package addOns;

import types.Laptop;
import types.RamUpgrade;

import java.math.BigInteger;

public class RamUpgrade16GB extends RamUpgrade {

    public RamUpgrade16GB(Laptop laptop) {
        super(laptop);
        this.upgradeRam = 16;
        this.ramMemory = laptop.getRAM()+this.upgradeRam;
    }

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(new BigInteger("60"));
    };
}
