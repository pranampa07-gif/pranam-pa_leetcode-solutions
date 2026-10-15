class Largest {
    int a = 25;
    int b = 15;

    void findLargest() {
        if (a > b) {
            System.out.println(a + " is the Largest Number");
        } else if (b > a) {
            System.out.println(b + " is the Largest Number");
        } else {
            System.out.println("Both Numbers are Equal");
        }
    }

    public static void main(String[] args) {
        Largest obj = new Largest();
        obj.findLargest();
    }
}
