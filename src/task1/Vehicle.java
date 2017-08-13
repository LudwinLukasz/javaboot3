package task1;

/**
 * Created by arabk on 12.08.2017.
 */
public class Vehicle {
    protected  String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Object run() {
        return "Vehicle is running";
    }

}
