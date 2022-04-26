public class Car implements Drivable{

    Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car being driven by " + driver.name);
        if (driver.alcoholLevel >= 50)
            System.out.println(driver.name + " is dead!");
    }
}
