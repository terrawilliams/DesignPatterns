public class Vermouth extends IngredientsDecorator {

    public Vermouth(Liquor lq)
    {
        calories = 40;
        liquor = lq;
        description = " with Vermouth";
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
