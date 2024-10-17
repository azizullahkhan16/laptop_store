package types;

public abstract class HddUpgrade extends AddOnDecorator{
    protected Laptop laptop;
    protected int upgradeHdd;

    public HddUpgrade(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public int getUpgrade() {
        return this.upgradeHdd;
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
