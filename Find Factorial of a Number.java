class Factorial {
    int number = 5;

    void calculate() {
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.calculate();
    }
}
