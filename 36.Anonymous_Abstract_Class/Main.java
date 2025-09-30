abstract class A {
    public abstract void show();
    public abstract void config();
}

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in a show");
            }

            @Override
            public void config() {
                System.out.println("during a config");
            }
        };

        obj.show();    // Output: in a show
        obj.config();  // Output: during a config
    }
}
//Need of Anonymous Class (One-Liner Answer):
// To provide a quick, one-time implementation of a class or interface without creating a separate named subclass.Inshort to avoid writting the whole inheritence concept.