
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String carBrand;
    private int carYear;
    public Car(String brand, int year){
        this.carBrand = brand;
        this.carYear = year;
    }
    public String getBrand() {
        return this.carBrand;
    }
    public String toString() {
        return "The Cars brand is:" + this.carBrand;
    }
    public boolean equals(Car other) {
        if(this.carBrand.equals(other.carBrand) && this.carYear == other.carYear){
            return true; 
        }
        else{
            return false;
        }
    }
   
}
