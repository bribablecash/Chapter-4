
/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    public static void main(String[] args) {
        Car myCar = new Car("Jeep" , 2015);
        Car yourCar = new Car("Jeep", 2017);
        System.out.println(myCar);
        System.out.println(yourCar);
        System.out.println(myCar.equals(yourCar));
}
}
