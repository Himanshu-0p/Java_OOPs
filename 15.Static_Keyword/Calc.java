class Calc {
    static int stA = 100;  // static variable
    int inB = 100;         // instance variable

    public static void main(String[] args) {
        Calc obj1 = new Calc();
        Calc obj2 = new Calc();

        // Access static variable
        System.out.println(Calc.stA);  // 100
        System.out.println(obj1.stA);  // 100 (not recommended way, but works)

        // Access instance variable
        System.out.println(obj1.inB);  // 100

        // Change values
        obj1.stA = 2000;
        obj1.inB = 1000;

        // Static variable is shared
        System.out.println(obj1.stA); // 2000
        System.out.println(obj2.stA); // 2000

        // Instance variable is separate
        System.out.println(obj1.inB); // 1000
        System.out.println(obj2.inB); // 100
    }
}
