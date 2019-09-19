public class Vodka extends Liquor {

    public Vodka()
    {
        calories = 30;
        description = "Vodka";
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
