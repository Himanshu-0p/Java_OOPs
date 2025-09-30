class A {
    public void show() {
        System.out.println("A in the show");
    }
}

public class Main {
    public static void main(String[] args) {
        // Anonymous inner class overriding show()
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in new show");
            }
        };

        obj.show();  // Output: in new show
    }
}
