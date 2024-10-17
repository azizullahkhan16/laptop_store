package models;

import brands.Apple;
import enums.HddEnum;
import enums.RamEnum;
import enums.SsdEnum;

import java.math.BigInteger;

public class MacbookProMax extends Apple {

    public MacbookProMax() {
        super();
        this.model = "Macbook Pro Max";
        this.ramMemory = RamEnum.THIRTY_TWO_GB.getSize();
        this.ssdStorage = SsdEnum.ONE_TB.getSize();
        this.cost = new BigInteger("1900");
    }

}
