package Zoo.Fisch;

import Zoo.Tier;

public class Fisch extends Tier {

    protected Fisch(String name, String color) {
        super(name, color);
    }
    public final void makeSound() {
        System.out.println(this + ": Blub!");
    }
    public void eat(int gramm) {
        System.out.println(this + ": Ich esse jetzt" + gramm + "g Fischfutter");
    }
    public void greet(Tier t) {
        System.out.println(this + ": Hallo " + t + "!");
    }
    public void swim() {
        System.out.println(this + " schwimmt vor sich hin!");
    }
}
