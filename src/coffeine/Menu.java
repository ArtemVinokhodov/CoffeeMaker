package coffeine;

import java.util.Scanner;

public class Menu {
    public void viewCoffeeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose a drink:\s
                1 - Espresso\s
                2 - Cappuccino\s
                3 - Latte\s
                """);

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
