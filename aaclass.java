

class A {
   protected int roll,marks;
    String name;
    protected void input(){
        System.out.println("Enter roll name & marks:");
    }
     void display(){
        roll=1; name="fulbabu"; marks=98;
        System.out.println(roll+" "+name+" "+marks);
    }
   
}
class fulbabu extends A 
{
    public static void main(String[] args){
     fulbabu r=new fulbabu();
     r.input(); r.display();
    }
    
}
