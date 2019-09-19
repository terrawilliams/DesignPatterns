public class Sugar extends IngredientsDecorator {

    public Sugar(Liquor lq)
    {
        calories = 300;
        liquor = lq;
        description = " with Sugar";
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
