public class Lights extends Decorator {

    public Lights(Tree tree)
    {
        cost = 5;
        description = " with Lights";
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
