package types;

public abstract class HddUpgrade extends AddOnDecorator{
    protected int upgradeHdd;

    public HddUpgrade(Laptop laptop) {
        super(laptop);
    }

    @Override
    public int getUpgrade() {
        return this.upgradeHdd;
    }

    @Override
    public int getHDD() {
        return this.laptop.getHDD() + this.upgradeHdd;
    }


    @Override
    public String toString() {
        return this.laptop +
                "============ HDD UPGRADE =============\n" +
                "Requested Hdd: " + this.getUpgrade() + "GB\n" +
                "Additional Cost: $" + this.getAdditionalCost() + "\n" +
                "Upgraded Hdd: " + this.getHDD() + "GB\n" +
                "Final Cost: $" + this.getCost() +
                "\n--------------------------------------\n";
    }
}
