class Square {
    int number = 5;

    void calculate() {
        System.out.println("Square = " + (number * number));
    }

    public static void main(String[] args) {
        Square obj = new Square();
        obj.calculate();
    }
}
