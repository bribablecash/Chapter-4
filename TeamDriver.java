
/**
 * Write a description of class TeamDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeamDriver
{
    public static void main(String [] args) {
        Team ahsSoccer = new Team("Acalanes", 23);
        Athlete joe = new Athlete("Joe", 16);
        Athlete jill = new Athlete("Jill", 16);
        System.out.println(joe.equals(jill));
        //testing if Joe is equals jill 
        System.out.println(jill.equals(jill));
        //Should return true as jill and jill are identical
        ahsSoccer.addAthlete(0, joe);
        ahsSoccer.addAthlete(1, jill);
        System.out.println(ahsSoccer);
        //Goes to toString since java encrypts it that way
    }
}
