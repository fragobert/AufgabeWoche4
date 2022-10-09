package Zoo.Fisch;

import Zoo.Tier;

public class Lachs extends Fisch {
    public Lachs(String name) {
        super(name, "orange");
    }

    public String toString() {
        return "Lachs [" + super.toString() + "]";
    }

    public void greet(Tier t) {
        if (t.getClass() != Hai.class) {
            super.greet(t);
        } else {
            System.out.println(this + ": schwimmt um sein Leben!");
        }
        System.out.println(this + ": Hallo " + t + "!");
    }
}

