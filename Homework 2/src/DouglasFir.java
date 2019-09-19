public class DouglasFir extends Tree {

    public DouglasFir()
    {
        cost = 15;
        description = "Douglas Fir";
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
