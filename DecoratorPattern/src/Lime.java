public class Lime extends IngredientsDecorator {

    public Lime(Liquor lq)
    {
        calories = 2;
        liquor = lq;
        description = " with Lime";
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
