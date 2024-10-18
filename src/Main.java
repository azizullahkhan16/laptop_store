
import addOns.*;
import models.*;
import types.Laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop selectedLaptop = null;
        boolean validChoice = false;

        // Display heading
        System.out.println("====== Welcome to the Laptop Store ======");

        // Choose laptop
        while (!validChoice) {
            System.out.println("\nSelect a laptop:");
            System.out.println("1. Apple Macbook Pro Max");
            System.out.println("2. Apple Macbook Pro");
            System.out.println("3. Lenovo ThinkPad");
            System.out.println("4. HP Pavilion");
            System.out.println("5. Dell Latitude");
            System.out.print("Enter your choice (1 - 5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    selectedLaptop = new MacbookProMax();
                    validChoice = true;
                    break;
                case "2":
                    selectedLaptop = new MacbookPro();
                    validChoice = true;
                    break;
                case "3":
                    selectedLaptop = new ThinkPad();
                    validChoice = true;
                    break;
                case "4":
                    selectedLaptop = new Pavilion();
                    validChoice = true;
                    break;
                case "5":
                    selectedLaptop = new Latitude();
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("\n" + selectedLaptop);
        }

        boolean upgradeChoice = true;
        while (upgradeChoice) {
            System.out.println("\nWould you like to upgrade your laptop?");
            System.out.println("1. RAM Upgrade (8GB)");
            System.out.println("2. RAM Upgrade (16GB)");
            System.out.println("3. RAM Upgrade (32GB)");
            System.out.println("4. SSD Upgrade (256GB)");
            System.out.println("5. SSD Upgrade (512GB)");
            System.out.println("6. SSD Upgrade (1TB)");

            // Show HDD upgrade options only for laptops that are not Apple (Macbook Pro or Macbook Pro Max)
            if (!(selectedLaptop.getBrand().equals("Apple"))) {
                System.out.println("7. HDD Upgrade (256GB)");
                System.out.println("8. HDD Upgrade (512GB)");
                System.out.println("9. HDD Upgrade (1TB)");
            }

            System.out.println("0. No, show laptop specs and exit.");
            System.out.print("Enter your choice: ");

            String upgrade = scanner.nextLine();

            switch (upgrade) {
                case "1":
                    selectedLaptop = new RamUpgrade8GB(selectedLaptop);
                    System.out.println(selectedLaptop);
                    break;
                case "2":
                    selectedLaptop = new RamUpgrade16GB(selectedLaptop);
                    System.out.println(selectedLaptop);
                    break;
                case "3":
                    selectedLaptop = new RamUpgrade32GB(selectedLaptop);
                    System.out.println(selectedLaptop);
                    break;
                case "4":
                    selectedLaptop = new SsdUpgrade256GB(selectedLaptop);
                    System.out.println(selectedLaptop);
                    break;
                case "5":
                    selectedLaptop = new SsdUpgrade512GB(selectedLaptop);
                    System.out.println(selectedLaptop);
                    break;
                case "6":
                    selectedLaptop = new SsdUpgrade1TB(selectedLaptop);
                    System.out.println(selectedLaptop);
                    break;
                case "7":
                case "8":
                case "9":
                    if (!(selectedLaptop.getBrand().equals("Apple"))) {
                        if (upgrade.equals("7")) {
                            selectedLaptop = new HddUpgrade256GB(selectedLaptop);
                            System.out.println(selectedLaptop);
                        } else if (upgrade.equals("8")) {
                            selectedLaptop = new HddUpgrade512GB(selectedLaptop);
                            System.out.println(selectedLaptop);
                        } else {
                            selectedLaptop = new HddUpgrade1TB(selectedLaptop);
                            System.out.println(selectedLaptop);
                        }
                    } else {
                        System.out.println("Invalid choice. HDD is not available for Apple laptops.");
                    }
                    break;
                case "0":
                    upgradeChoice = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            if (!upgradeChoice) {
                System.out.println("\n" + selectedLaptop);
                System.out.println("\nThank you for visiting the Laptop Store!");
                break;
            }
        }
        scanner.close();
    }

}
