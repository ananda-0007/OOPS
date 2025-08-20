class B {
    public void get() {
        System.out.println("This is super class");
    }
}

class C extends B {
    @Override
    public void get() {
        System.out.println("This is subclass");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        C ob = new C();
        ob.get();
    }
}