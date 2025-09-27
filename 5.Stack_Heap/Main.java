class Student {
    int instVariable; // instance variable → stored in heap (inside object)

    public static void main(String[] args) {
        int localVariable = 0;        // stored in stack (method's stack frame)
        Student st = new Student();   // 'st' is reference variable → in stack
                                      // new Student() → object in heap
    }

    public int add(int num1, int num2) {
        // num1, num2 → local variables (stack frame of add())
        return num1 + num2;
    }
}
