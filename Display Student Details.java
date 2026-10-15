class Student {
    int rollNo = 101;
    String name = "Rahul";

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student myObj = new Student();
        myObj.display();
    }
}
