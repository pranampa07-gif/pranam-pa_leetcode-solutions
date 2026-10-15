class Rectangle {
    int length = 10;
    int breadth = 5;

    void calculateArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.calculateArea();
    }
}
