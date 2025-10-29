package SRP.after;

public class BookBusinessLogic {
    private BookSRP book;

    public BookBusinessLogic(BookSRP book) {
        this.book = book;
    }

    public void emprunter(String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }

    public void autreService() {
        System.out.println("Autre logique metier sur le livre '" + book.getTitle() + "'");
    }
}