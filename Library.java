
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private Book[] books;
    private String name;
    public Library(Book[] b, String nm){
        this.books = new Book[size];
        //returns a bunch of nulls since has nothing
        this.name = nm;
    }
    public String toString(){
        return "The library " + name + "has the following: \n";
        for(Book b : books) {
            output += b + "\n";
            
        }
            
        return output; 
        //returns all of the books 
        //2 Ways to do so either for loop
    }
}
