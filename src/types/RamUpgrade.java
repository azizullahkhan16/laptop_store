package types;

public abstract class RamUpgrade extends AddOnDecorator {
    protected int upgradeRam;

    public RamUpgrade(Laptop laptop) {
        super(laptop);
    }

    @Override
    public int getUpgrade() {
        return this.upgradeRam;
    }

    @Override
    public int getRAM() {
        return this.laptop.getRAM() + this.upgradeRam;
    }

    @Override
    public String toString() {
        return this.laptop +
                "============ RAM UPGRADE =============\n" +
                "Requested Ram: " + this.getUpgrade() + "GB\n" +
                "Additional Cost: $" + this.getAdditionalCost() + "\n" +
                "Upgraded Ram: " + this.getRAM() + "GB\n" +
                "Final Cost: $" + this.getCost() +
                "\n--------------------------------------\n";
    }
}
