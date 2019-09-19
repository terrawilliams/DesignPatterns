public class FraserFir extends Tree {

    public FraserFir()
    {
        cost = 12;
        description = "Fraser Fir";
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
