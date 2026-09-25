class A {
    int a; String b; boolean c;
    // Default Constructor
    A() {
        a=708656; b="Fulbabu"; c=true;
    }
    void display() {
        System.out.println(a+" "+b+" "+c );
    }
}
public class Aclass {
    public static void main(String[] args) {
        A r= new A();
        r.display();
    }
}

