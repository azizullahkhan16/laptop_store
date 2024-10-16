package addOns;

import enums.RamEnum;
import types.AddOnDecorator;
import types.Laptop;

import java.math.BigInteger;

public class RAM extends AddOnDecorator {
    private Laptop laptop;
    private RamEnum capacity;

    public RAM(Laptop laptop, RamEnum ramEnum) {
        this.laptop = laptop;
        this.capacity = ramEnum;
    }

    @Override
    public String getSpecifications() {
        return laptop.getSpecifications() +
                "";
    }

    @Override
    public BigInteger getCost() {
        return null;
    }
}
