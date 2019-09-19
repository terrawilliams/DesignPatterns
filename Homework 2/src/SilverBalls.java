public class SilverBalls extends Decorator {

    public SilverBalls(Tree tree)
    {
        cost = 3;
        description = " with Silver Balls";
        this.tree = tree;
    }

    @Override
    public int getCost() {
        return tree.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + description;
    }
}
