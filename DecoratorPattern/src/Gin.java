public class Gin extends Liquor {

    public Gin()
    {
        calories = 70;
        description = "Gin";
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
