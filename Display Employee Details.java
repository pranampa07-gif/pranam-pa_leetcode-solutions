class Employee {
    int empid = 101;
    String name = "Ramesh";
    double salary = 25000;

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.display();
    }
}
