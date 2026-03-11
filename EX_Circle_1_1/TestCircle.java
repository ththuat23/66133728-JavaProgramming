package EX_Circle_1_1;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println(c2.toString());
        System.out.println("Area: " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println(c3.toString());
        System.out.println("Area: " + c3.getArea());

        c3.setColor("green");
        c3.setRadius(5.0);

        System.out.println("Sau khi thay đổi:");
        System.out.println(c3.toString());
    }
}