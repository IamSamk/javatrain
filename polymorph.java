class A {
    void display() {
        System.out.println("This is class A");
    }
}
class B extends A {
    void display() {
        System.out.println("This is class B");
    }
}
class polymorph {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ref;

        ref = a;
        ref.display(); // This will call display() of class A

        ref = b;
        ref.display(); // This will call display() of class B due to polymorphism
    }
}