public class ColoradoBlueSpruce extends Tree {

    public ColoradoBlueSpruce()
    {
        cost = 20;
        description = "Colorado Blue Spruce";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
