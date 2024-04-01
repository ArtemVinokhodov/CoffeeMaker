package coffeine;

public class Espresso implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Your Espresso is making. Enjoy :)");
    }
}
