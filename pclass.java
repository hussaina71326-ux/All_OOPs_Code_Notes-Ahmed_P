class pclass {
    int id;
    String name;

    // No-Argument Constructor
    pclass() {
        id = 90;
        name = "Ahmed";
        System.out.println(id + " " + name);
    }

    // Copy Constructor
    pclass(pclass obj) {
        id = obj.id;
        name = obj.name;
        System.out.println(id + " " + name);
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // Creating first object
        pclass obj1 = new pclass();

        // Creating second object using copy constructor
        pclass obj2 = new pclass(obj1);

        obj1.display();
        obj2.display();
    }
}