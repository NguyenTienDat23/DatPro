public class Ex1Circle {
    private double radius;
    private String color;
    public Ex1Circle() {
        radius = 1;
        color = "red";
    }
    public Ex1Circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public static void main(String[] args) {
        Ex1Circle c1 = new Ex1Circle();
        System.out.println("The Circle has radius of"+c1.getRadius() + "and area of "+ c1.getArea());

        Ex1Circle c2 = new Ex1Circle(2.0);
        System.out.println("The Circle has radius of"+c2.getRadius() + "and area of "+ c2.getArea());
    }
}
