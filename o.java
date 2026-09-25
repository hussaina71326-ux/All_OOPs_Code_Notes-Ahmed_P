// ================16.Ppiymorphism ,(1)Runtime, Example: Method Overloading ==========================

class shape {
    void area() {
        System.out.println("Area of Shape");
    }
}
class square extends shape {
    @Override
    void area() {
        System.out.println("Area of Square");
    }
}
class o {
public static  void main(String[] args) {
        shape s;
        s = new shape();
        s.area();
        s = new square();
        s.area();
    }
}
