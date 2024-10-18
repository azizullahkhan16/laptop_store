
import addOns.*;
import models.MacbookPro;
import models.Pavilion;
import models.ThinkPad;
import types.Laptop;
import types.SsdUpgrade;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new MacbookPro();

        laptop = new RamUpgrade8GB(laptop);
        laptop = new SsdUpgrade256GB(laptop);
        laptop = new RamUpgrade8GB(laptop);
        laptop = new SsdUpgrade1TB(laptop);
//        laptop = new HddUpgrade512GB(laptop);
        System.out.println(laptop);

    }
}
