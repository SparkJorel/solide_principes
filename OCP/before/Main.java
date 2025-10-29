package OCP.before;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        Rectangle r = new Rectangle(4, 3);
        Circle c = new Circle(2);
        System.out.println("Aire = " + calc.calculateArea(r));
        System.out.println("Aire = " + calc.calculateArea(c));
    }
}