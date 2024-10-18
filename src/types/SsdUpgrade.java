package types;

public abstract class SsdUpgrade extends AddOnDecorator{
    protected int upgradeSsd;

    public SsdUpgrade(Laptop laptop) {
        super(laptop);
    }

    @Override
    public int getSSD() {
        return this.laptop.getSSD() + this.upgradeSsd;
    }

    @Override
    public int getUpgrade() {
        return this.upgradeSsd;
    }

    @Override
    public String toString() {
        return this.laptop +
                "============ SSD UPGRADE =============\n" +
                "Requested Ssd: " + this.getUpgrade() + "GB\n" +
                "Additional Cost: $" + this.getAdditionalCost() + "\n" +
                "Upgraded Ssd: " + this.getSSD() + "GB\n" +
                "Final Cost: $" + this.getCost() +
                "\n--------------------------------------\n";
    }
}
