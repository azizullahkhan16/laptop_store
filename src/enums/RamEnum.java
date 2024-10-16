package enums;

public enum RamEnum {
    EIGHT_GB(8),
    SIXTEEN_GB(16),
    THIRTY_TWO_GB(32),
    SIXTY_FOUR_GB(64);

    private final int size;

    RamEnum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}