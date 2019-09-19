public class BalsamFir extends Tree {

    public BalsamFir()
    {
        cost = 5;
        description = "Balsam Fir";
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
