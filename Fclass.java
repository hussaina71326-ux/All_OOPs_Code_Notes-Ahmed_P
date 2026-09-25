class A {
    int id;
    String name;

    // Parameterized Constructor
    A() {
        id = 75;
        name = "Fulbabu";
        System.out.println(id+" "+name);
    }

    // Copy Constructor
    A(A obj) {
        id = obj.id;
        name = obj.name;
        System.out.println(id+" "+name);
    }
    void display() {
        System.out.println(id + " " + name);
    }
}

 public class Fclass {
    public static void main(String[] args) {
        A obj1 = new A(); // Creating first object
        A obj2 = new A(obj1); // Creating second object using copy constructor
    }
}
