public class  Rectangle extends Shape{
  private double a;
  private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getGirth() {
        return 0;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
