package models;

import brands.Dell;
import enums.HddEnum;
import enums.RamEnum;
import enums.SsdEnum;

import java.math.BigInteger;

public class Latitude extends Dell {

    public Latitude() {
        super();
        this.model = "Latitude";
        this.ramMemory = RamEnum.EIGHT_GB.getSize();
        this.hddStorage = HddEnum.TWO_FIFTY_SIX_GB.getSize();
        this.ssdStorage = SsdEnum.TWO_FIFTY_SIX_GB.getSize();
        this.cost = new BigInteger("1200");
    }
}
