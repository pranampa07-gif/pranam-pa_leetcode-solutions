class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.name = "Rahul";
        obj1.rollNo = 101;

        obj2.name = "Priya";
        obj2.rollNo = 102;

        System.out.println("First Student Details:");
        obj1.display();

        System.out.println("Second Student Details:");
        obj2.display();
    }
}
