package types;

import enums.RamEnum;

public abstract class RamUpgrade extends AddOnDecorator {
    protected Laptop laptop;
    protected int upgradedRam;

    @Override
    public String toString() {
        String info = super.toString();
        return info + "\nUpgraded Ram: " + this.getUpgrade() + "GB" +
                "\nFinal Cost: $" + this.getCost();
    }
}
