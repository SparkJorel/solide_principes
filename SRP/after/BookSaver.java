package SRP.after;

public class BookSaver {
    private BookSRP book;

    public BookSaver(BookSRP book) {
        this.book = book;
    }

    public void saveToDatabase() {
        System.out.println("\nSauvegarde du livre '" + book.getTitle() + "' en base de données...");
    }

    public void saveToFile(String filename) {
        System.out.println("\nSauvegarde du livre '" + book.getTitle() + "' dans " + filename);
    }
}