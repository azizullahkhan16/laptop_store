package enums;

public enum SsdEnum {
    TWO_FIFTY_SIX_GB(256),
    FIVE_TWELVE_GB(512),
    ONE_TB(1024);

    private final int size;

    SsdEnum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
