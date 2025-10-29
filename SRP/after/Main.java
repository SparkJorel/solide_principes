package SRP.after;

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");

        BookPrinter printer = new BookPrinter(book);
        printer.printToScreen();

        BookSaver saver = new BookSaver(book);
        saver.saveToDatabase();

        BookBusinessLogic logic = new BookBusinessLogic(book);
        logic.emprunter("Marcial");
    }
}