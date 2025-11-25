public class LibraryBook {
    private static int totalBooks = 0;
    private String title;
    private String author;
    private int bookID;

    public LibraryBook(String title, String author){
        this.title = title;
        this.author = author;
        this.bookID = totalBooks++;
    }
    public String getInfo(){
        return "Book #" + bookID + ":" + title + "by:" + author;
    }
    public static int getTotalBooks(){
        return totalBooks;
    }
    public static void main(String[] args){
        LibraryBook b1 = new LibraryBook("The Hobbit", "J.R.R. Tolkien");
        LibraryBook b2 = new LibraryBook("1984", "George Orwell");
        LibraryBook b3 = new LibraryBook("To Kill a mocking bird", "Harper Lee");

        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println(b3.getInfo());

        System.out.println("Total Books:" + LibraryBook.getTotalBooks());
    }
}