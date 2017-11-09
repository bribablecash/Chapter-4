
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    private String teamname;
    private Athlete [] players; 
    public Team(String tm, int size){
        this.teamname = tm;
        this.players = new Athlete[size];
    }
    public void addAthlete(int index, Athlete a) {
        players [index]  = a;
    }
    public String toString(){
        String output = "The members of this team are: \n";
        for(Athlete a : players) {
            output += a + "\n";
         }
        return output;
    }
}
