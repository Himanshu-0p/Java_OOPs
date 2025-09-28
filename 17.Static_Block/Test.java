class Test {
    static {
        System.out.println("1. Static Block -> runs once when class loads");
    }

    {
        System.out.println("2. Non-Static Block -> runs before constructor");
    }

    Test() {
        System.out.println("3. Constructor -> runs after non-static block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Test t1 = new Test();
        Test t2 = new Test();
    }
}
