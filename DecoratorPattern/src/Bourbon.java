public class Bourbon extends Liquor {

    public Bourbon(){
        calories = 80;
        description = "Bourbon";
    }

    public int getCalories()
    {
        return calories;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
