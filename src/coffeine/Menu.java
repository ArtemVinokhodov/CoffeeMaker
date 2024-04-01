package coffeine;

import java.util.Scanner;

public class Menu {
    public void viewCoffeeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a drink: \n" +
                "1 - Espresso \n" +
                "2 - Cappuccino \n" +
                "3 - Latte \n");

        int getNumber = scanner.nextInt();
        switch (getNumber) {
            case 1: new Espresso().makeCoffee();
                break;
            case 2: new Cappuccino().makeCoffee();
                break;
            case 3: new Latte().makeCoffee();
                break;
        }
    }
}
