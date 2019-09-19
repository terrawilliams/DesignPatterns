public class RedBalls extends Decorator {

    public RedBalls(Tree tree)
    {
        cost = 1;
        description = " with Red Balls";
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
