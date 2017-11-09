
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private Author bookAuthor;
    //Need Author not string since we made teh object already
    private String title;
    public Book(Author a, String tl) {
        this.bookAuthor = a;
        this.title = tl;
    }
    String thisString() {
        return "The title of the book is" + title + bookAuthor;
        //bookAuthor refers to author 
        //bookAuthor is a refrence variable 
}
}