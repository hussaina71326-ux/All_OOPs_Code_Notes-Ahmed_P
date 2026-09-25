// class Demo {
//     int a = 10;  String b="Fulbabu";
//     void display() {
//         System.out.println(a+" "+b );
//     }
// }
//  class Test {
//     public static void main(String[] args) {
//         Demo r= new Demo();
//         r.display();
//     }
// }



// ---------------------------EXAMPLE 2---------------------------

class A {
    int a; String b;
    A() {               // Constructor
        a=100; b="Fulbabu";
    }
    void display() {
        System.out.println(a+" "+b );
    }
}
 class B {
    public static void main(String[] args) {
        A r= new A();
        r.display();
    }
}