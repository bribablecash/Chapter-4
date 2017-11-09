
/**
 * Write a description of class PetDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetDriver
{
    public static void main() {
        Pet Oscar = new Pet(16, "Oscar", true);
        System.out.println(Oscar.getName());
        Pet mike = new Pet( 13,"mike", true);
        System.out.println(Oscar.equals(mike));
        Pet.example();
}
}
