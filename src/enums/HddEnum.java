package enums;

public enum HddEnum {
    TWO_FIFTY_SIX_GB(256),
    FIVE_TWELVE_GB(512),
    ONE_TB(1024);

    private final int size;

    HddEnum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
