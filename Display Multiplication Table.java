class MultiplicationTable {
    int number = 5;

    void display() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.display();
    }
}
