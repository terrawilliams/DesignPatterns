public class Cherry extends IngredientsDecorator {

    public Cherry(Liquor lq)
    {
        calories = 40;
        liquor = lq;
        description = " with Cherry";
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
