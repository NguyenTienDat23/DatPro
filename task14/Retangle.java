public class Retangle extends Shape{
    private int length,width;
    public Retangle(String color, int length ,int width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    public String toString(){
        return "Rectangle[length=" + ",width=" + width + "," + super.toString() + "]";
    }
    @Override
    public double getArea() {
        return length*width;
    }
}
