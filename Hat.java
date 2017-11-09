
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    private int HatSize;
    private String HatColor;
    public Hat(int Size, String nm) {
        this.HatSize = Size;
        this.HatColor = nm;
    }
    public String getSize() {
     return this.HatColor;   
    }
      public String toString() {
        return "The Hat color is:" + this.HatColor;
}
}
