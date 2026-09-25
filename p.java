// ========================= 17.Abstraction  ================================

abstract class A {
    abstract void display();
}
class B extends A {
    void display() {
        System.out.println("Ahmed");
    }
}
class p {
    public static void main(String[] args) {
        B r = new B();
        r.display();
    }
}
 ========================= 18.Interface  ================================

// import java.util.Scanner;

// interface client {
//     void input();
//     void output();
// }

// class server implements client {
//     String name;
//     double sal;

//     public void input() {
//         Scanner r = new Scanner(System.in);
//         System.out.println("Enter name & salary:");
//         name = r.nextLine();
//         sal = r.nextDouble();
//     }

//     public void output() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + sal);
//     }
// }

// public class  OOPs {
//     public static void main(String[] args) {
//         server r = new server();
//         r.input();
//         r.output();
//     }
// }
