
import addOns.RamUpgrade8GB;
import enums.RamEnum;
import models.ThinkPad;
import types.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new ThinkPad();

//        System.out.println(laptop);

        laptop = new RamUpgrade8GB(laptop);
        laptop = new RamUpgrade8GB(laptop);
        System.out.println(laptop);

    }
}
