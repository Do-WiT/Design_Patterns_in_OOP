public class Driver {
    public String name;
    public int age;
    public int alcoholLevel;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void drinkBeer(){
        alcoholLevel += 25;
    }


}
