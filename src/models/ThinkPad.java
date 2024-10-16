package models;

import brands.Lenovo;
import enums.HddEnum;
import enums.RamEnum;
import enums.SsdEnum;

import java.math.BigInteger;

public class ThinkPad extends Lenovo {

    public ThinkPad() {
        this.ramMemory = RamEnum.SIXTEEN_GB.getSize();
        this.hddStorage = HddEnum.FIVE_TWELVE_GB.getSize();
        this.ssdStorage = SsdEnum.FIVE_TWELVE_GB.getSize();
    }

    @Override
    public BigInteger getCost() {
        return new BigInteger("1700");
    }
}
