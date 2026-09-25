class aaclass {

    protected int roll, marks;
    String name;

    protected void input() {
        System.out.println("Enter roll name & marks:");
    }

    void display() {
        roll = 1;
        name = "Ahmed";
        marks = 98;

        System.out.println(roll + " " + name + " " + marks);
    }

    public static void main(String[] args) {

        aaclass r = new aaclass();

        r.input();
        r.display();
    }
}