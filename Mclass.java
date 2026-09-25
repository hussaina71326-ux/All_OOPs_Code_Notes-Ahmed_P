class A {
    int id;
    String name;

    // Parameterized Constructor
    A(int x, String y) {
        id = x;
        name = y;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Mclass {
    public static void main(String[] args) {
        // Creating object using parameterized constructor
        A obj = new A(  75, "Fulbabu");

        obj.display();
    }
}
