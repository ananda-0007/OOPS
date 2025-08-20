class A {
    int a;
    String name, s;

    void set(int a) {
        this.a = a;
        System.out.println("The Value of a is " + a);
    }

    void set(int a, String name) {
        this.a = a;
        this.name = name;
        System.out.println("The value of a is " + a + " and name is " + name);
    }

    void set(String name, String s) {
        this.name = name;
        this.s = s;
        System.out.println("The value of name is " + name + " and s is " + s);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.set("Same", "Vel");
        obj.set(9, "Vel");
        obj.set(8);
    }
}