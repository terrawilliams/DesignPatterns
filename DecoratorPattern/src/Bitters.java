public class Bitters extends IngredientsDecorator {

    public Bitters(Liquor lq)
    {
        calories = 20;
        liquor = lq;
        description = " with Bitters";
    }

    @Override
    public int getCalories() {
        return liquor.getCalories() + calories;
    }

    @Override
    public String getDescription() {
        return liquor.getDescription() + description;
    }
}
