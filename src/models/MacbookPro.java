package models;

import brands.Apple;
import enums.RamEnum;
import enums.SsdEnum;

import java.math.BigInteger;

public class MacbookPro extends Apple {

    public MacbookPro() {
        super();
        this.model = "Macbook Pro";
        this.ramMemory = RamEnum.SIXTEEN_GB.getSize();
        this.ssdStorage = SsdEnum.FIVE_TWELVE_GB.getSize();
        this.cost = new BigInteger("1600");
    }

}
