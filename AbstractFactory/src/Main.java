public class Main {

    public static void main(String[] args) {

        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink tea = machine.makeBlackDrink(AvailableDrink.TEA,150);
        tea.consume();

    }
}
