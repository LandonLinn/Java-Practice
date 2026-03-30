abstract class A {
    public abstract void sayHello();

    public void sayBye() {
        System.out.println("Bye");
    }
}

class B extends A {
    public void sayHello() {
        System.out.println("Hello World");
    }
}

public class Abstract {

    public static void main(String[] args) {
        A b1 = new B();
        B b2 = new B();
        b1.sayHello();
        b1.sayBye();
        b2.sayHello();
        b2.sayBye();
    }
}
