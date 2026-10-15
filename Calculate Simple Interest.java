class SimpleInterest {
    double principal = 10000;
    double rate = 5;
    double time = 2;

    void calculate() {
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();
        obj.calculate();
    }
}
