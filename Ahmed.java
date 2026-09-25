class A {

    int a;
    String b;

    A() {               // Constructor
        a = 100;
        b = "Ahmed";
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

public class Ahmed {

    public static void main(String[] args) {
        A r = new A();
        r.display();
    }
}