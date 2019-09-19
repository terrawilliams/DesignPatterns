public class Ruffles extends Decorator {

    public Ruffles(Tree tree)
    {
        cost = 1;
        description = " with Ruffles";
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
