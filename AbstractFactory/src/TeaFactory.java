public class TeaFactory implements HotDrinkFactory{
    @Override
    public HotDrink prepareBlackDrink(int amount) {
        System.out.println("Amount " + amount + "ml");
        return new Tea();
    }
}
