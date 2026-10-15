class Addition {
    int a = 10;
    int b = 20;

    void calculate() {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.calculate();
    }
}
