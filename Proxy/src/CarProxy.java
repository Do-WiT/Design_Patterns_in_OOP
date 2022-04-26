public class CarProxy extends Car{

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.age < 16){
            System.out.println(driver.name + " is too young!");
            return;
        }
        if (driver.alcoholLevel < 50)
            super.drive();
        else
            System.out.println(driver.name + " is too drunk!");
    }
}
