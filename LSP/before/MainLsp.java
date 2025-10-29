package LSP.before;

public class MainLsp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du Rectangle = " + rectangle.getArea());

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(4);  // Erreur logique : Square ignore la hauteur
        System.out.println("Aire du Carré = " + square.getArea());
    }
}