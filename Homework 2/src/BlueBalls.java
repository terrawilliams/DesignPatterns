public class BlueBalls extends Decorator {

    public BlueBalls(Tree tree)
    {
        cost = 2;
        description = " with Blue Balls";
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
