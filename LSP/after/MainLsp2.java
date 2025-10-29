package LSP.after;

public class MainLsp2 {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(5, 4);

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
