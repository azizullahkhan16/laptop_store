package addOns;

import enums.RamEnum;
import types.Laptop;
import types.RamUpgrade;

import java.math.BigInteger;

public class RamUpgrade8GB extends RamUpgrade {public RamUpgrade8GB(Laptop laptop) {
    super(laptop);
    this.upgradeRam = 8;
    this.ramMemory = laptop.getRAM()+this.upgradeRam;
}

    @Override
    public BigInteger getCost() {
        return this.laptop.getCost().add(new BigInteger("30"));
    };


}
