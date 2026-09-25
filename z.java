
// -----------------------------------------11.Simple Inheritance------------------------------------

public class z {

    public static void main(String[] args) {

        class A {
            void display() {
                System.out.println("Ahmed");
            }
        }

        class B extends A {
            void show() {
                System.out.println("Hussain");
            }
        }

        class C extends A {
            void print() {
                System.out.println("Ahmed Hussain");
            }
        }

        B r1 = new B();
        r1.display();
        r1.show();

        C r2 = new C();
        r2.display();
        r2.print();
    }
}