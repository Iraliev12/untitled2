public class Main {
    public static void main(String[] args) {
;
        Rectangle Rectangle = new Rectangle(5,8);
        System.out.println("периметр прямо угольника длиной 3 и шириной 8 составляет: >> "+Rectangle.getGirth());
        System.out.println("Площадь прямо угольника длиной 3 и шириной 8 составляет: >> "+Rectangle.getArea());
        System.out.println();
        Circle circle=new Circle(9) ;
        System.out.println("\n перииметр круга радиусом 9 равен"+circle.getArea());
        System.out.println("площадь круга радиусом 9 равно"+circle.getGirth());
        System.out.println();
        Triangle triangle;
        triangle = new Triangle(3,4,5);

        System.out.println("периметр треугольника со сторонами 3 4 5 равеен: >> "+triangle.getArea());
        System.out.println("площадь треуольника со сторонами 3 4 5 равен: >> "+triangle.getGirth());
    }
    }

