public class Star extends Decorator{

    public Star(Tree tree)
    {
        cost = 4;
        description = " with a Star";
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
