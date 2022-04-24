public class Ex2Circle {
    private double radius;
    public Ex2Circle() {
        radius = 1;
    }
    public Ex2Circle(double r){
        radius=r;
    }
    public double getAre() {
        return radius*radius*Math.PI;
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Ex2Circle[" + "radius=" + radius + ']';
    }
    public static void main(String[] args) {
        Ex2Circle c1 = new Ex2Circle();
        System.out.println(c1);
        Ex2Circle c2 = new Ex2Circle();
        System.out.println("The Circle has radius of \t" + c2.toString() + "\tand area of "+ c2.getAre() + "and Circumference of" + c2.getCircumference());
    }
}
