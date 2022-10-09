package Zoo.Vogel;

public class Vogel extends Zoo.Tier {
    public Vogel(String name, String color) {
        super(name, color);
    }

    public void eat(int gramm) {
        System.out.println("Ich habe " + gramm + " gegessen!");
    }
    public void makeSound() {
        System.out.println("Piep!");
    }
    public void greet(Zoo.Tier t) {
        System.out.println("Hallo " + t + "!");
    }
}

