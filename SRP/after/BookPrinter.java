package SRP.after;

public class BookPrinter {
    private BookSRP book;

    public BookPrinter(BookSRP book) {
        this.book = book;
    }

    public void printToScreen() {
        System.out.println("Titre : " + book.getTitle());
        System.out.println("Auteur : " + book.getAuthor());
        System.out.println("Contenu : " + book.getContent());
    }

    public void printToHTML() {
        System.out.println("\n===Print to HTML===\n");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par : " + book.getAuthor() + "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}