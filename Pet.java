
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    private String name;
    private String type;
    private int age;
    boolean alive;
    public Pet (int age, String nm, boolean alv){
        this.name = nm;
        this.age = age;
        this.alive = alv;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "This pet's name is:" + this.name;
        
}
public boolean equals(Pet other) {
    if(this.name.equals(other.name)) {
        return true;
    }
    else {
        return false;
    }
}
public static void example() {
    System.out.print("this is in a static method!");
}
}

