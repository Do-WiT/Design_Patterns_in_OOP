public class HotDrinkMachine {
    public HotDrinkMachine() {
    }

    public HotDrink makeBlackDrink(AvailableDrink drink, int amount ){

        switch (drink){
            case TEA:
                return new TeaFactory().prepareBlackDrink(amount);
            case COFFEE:
                return new CoffeeFactory().prepareBlackDrink(amount);
        }

        return null;
    }


}
