package types;

public abstract class AddOnDecorator extends Laptop{
    protected Laptop laptop;

    @Override
    public int getHDD() {
        return this.hddStorage;
    }

    public abstract int getUpgrade();

}
