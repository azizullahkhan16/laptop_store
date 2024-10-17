
import addOns.HddUpgrade256GB;
import addOns.RamUpgrade16GB;
import addOns.RamUpgrade32GB;
import addOns.RamUpgrade8GB;
import enums.RamEnum;
import models.MacbookPro;
import models.ThinkPad;
import types.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new ThinkPad();

//        System.out.println(laptop);

        laptop = new HddUpgrade256GB(laptop);
        laptop = new HddUpgrade256GB(laptop);
        System.out.println(laptop);

    }
}
