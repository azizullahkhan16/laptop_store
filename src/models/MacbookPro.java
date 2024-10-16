package models;

import brands.Apple;
import enums.RamEnum;
import enums.SsdEnum;

import java.math.BigInteger;

public class MacbookPro extends Apple {

    public MacbookPro() {
        this.ramMemory = RamEnum.SIXTEEN_GB.getSize();
        this.ssdStorage = SsdEnum.FIVE_TWELVE_GB.getSize();
    }


    @Override
    public BigInteger getCost() {
        return new BigInteger("1600");
    }
}
