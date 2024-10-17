package types;

import enums.RamEnum;

public abstract class RamUpgrade extends AddOnDecorator {
    protected int upgradeRam;

    public RamUpgrade(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public int getUpgrade() {
        return this.upgradeRam;
    }

    @Override
    public String toString() {
        return this.laptop +
                "============ RAM UPGRADE =============\n" +
                "Requested Ram: " + this.getUpgrade() + "GB\n" +
                "Upgraded Ram: " + this.getRAM() + "GB\n" +
                "Final Cost: $" + this.getCost() +
                "\n--------------------------------------\n";
    }
}
