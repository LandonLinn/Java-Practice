class A {

    public void location() {
        System.out.println("Outside");
    }

    class B {
        public void location() {
            System.out.println("Inside");
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        A a = new A();
        a.location();
        A.B b = a.new B();
        b.location();
    }
}
