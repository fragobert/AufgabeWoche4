package Zoo.Fisch;

public class Hai extends Fisch {
    public Hai(String name) {
        super(name, "grau");
    }

    public String toString() {
        return "Hai [" + super.toString() + "]";
    }

    public void hunt(Fisch f) {
        System.out.println(this + ": Ich jage jetzt " + f + "!");
        if (Math.random() > ((double)1 / 3)) {
            System.out.println(this + ": Ich habe " + f + " gefressen!");
        }else{
            System.out.println(this + ": Ich habe " + f + " nicht gefressen!");
        }
    }
}

