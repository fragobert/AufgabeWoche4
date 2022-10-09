package Zoo;

public abstract class Tier {
    final private String name, color;

    protected Tier(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound();

    public abstract void greet(Tier t);

    public abstract void eat(int gramm);

    final void sleep(int hours) {
        System.out.println(this + ": Ich schlafe jetzt " + hours + " Stunden");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getName() + " - " + this.getColor();
    }
}
