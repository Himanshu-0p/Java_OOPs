class A {
    private int p = 1;
    int d = 2;          // default
    protected int pr = 3;
    public int pub = 4;
}

class B extends A {
    void show() {
        // System.out.println(p);   // ❌ private not accessible
        System.out.println(d);     // ✅ default
        System.out.println(pr);    // ✅ protected
        System.out.println(pub);   // ✅ public
    }
}
