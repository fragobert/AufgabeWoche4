import Zoo.Fisch.Hai;
import Zoo.Fisch.Lachs;

public class Main {
    public static void main(String[] args) {
        Lachs test = new Lachs("Lachs");
        Hai test2 = new Hai("Hai");

        test.greet(test2);
        test2.hunt(test);

    }
}