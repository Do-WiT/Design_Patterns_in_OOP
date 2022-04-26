public class Main {

    public static void main(String[] args) {
        Driver driver1 = new Driver("A", 30);
        Car car1 = new Car(driver1);
        car1.drive();
        driver1.drinkBeer();
        car1.drive();
        driver1.drinkBeer();
        car1.drive();

        Driver driver2 = new Driver("B", 40);
        Car car2 = new CarProxy(driver2);
        car2.drive();
        driver2.drinkBeer();
        car2.drive();
        driver2.drinkBeer();
        car2.drive();

        Driver driver3 = new Driver("C", 8);
        Car car3 = new CarProxy(driver3);
        car3.drive();

    }
}
