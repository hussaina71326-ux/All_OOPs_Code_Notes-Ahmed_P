 class A {
     void add() {
    int a=10, b=20;
    int c=a+b;
    System.out.println(c);

    } 
 
  void add(int x, int y) {
    int c;
     c=x+y;
    System.out.println(c);
     } 
      void add(int x, double y  ) {
    double c;
     c=x+y;
    System.out.println(c);
    } 
}
 void main(String[] args) {
        A r=new A();
        r.add();
        r.add(76, 40);
        r.add(50, 60.5);
     }
