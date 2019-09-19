public class Ribbons extends Decorator {

    public Ribbons(Tree tree)
    {
        cost = 2;
        description = " with Ribbons";
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
