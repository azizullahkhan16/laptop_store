package types;

public class SddUpgrade extends AddOnDecorator{
    protected int upgradeSdd;

    public SddUpgrade(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public int getUpgrade() {
        return this.upgradeSdd;
    }

    @Override
    public String toString() {
        return this.laptop +
                "============ SDD UPGRADE =============\n" +
                "Requested Sdd: " + this.getUpgrade() + "GB\n" +
                "Upgraded Sdd: " + this.getSSD() + "GB\n" +
                "Final Cost: $" + this.getCost() +
                "\n--------------------------------------\n";
    }
}
