package models;

import brands.HP;
import enums.HddEnum;
import enums.RamEnum;
import enums.SsdEnum;

import java.math.BigInteger;

public class Pavilion extends HP {

    public Pavilion() {
        super();
        this.model = "Pavilion";
        this.ramMemory = RamEnum.EIGHT_GB.getSize();
        this.hddStorage = HddEnum.FIVE_TWELVE_GB.getSize();
        this.ssdStorage = SsdEnum.TWO_FIFTY_SIX_GB.getSize();
        this.cost = new BigInteger("1400");
    }

}
