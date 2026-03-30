interface A {

    void sayHello();

    void sayBye();
}

interface C {
    void here();
}

class B implements A, C {
    public void sayHello() {
        System.out.println("Hello World");

    }

    public void sayBye() {
        System.out.println("Bye World");
    }

    public void here() {
        System.out.println("Here!");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        B b = new B();
        b.sayHello();
        b.sayBye();
        b.here();

        A a = new B();
        a.sayHello();
        a.sayBye();

        C c = new B();
        c.here();

    }
}
