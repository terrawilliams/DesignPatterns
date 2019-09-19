public class LEDs extends Decorator {

    public LEDs(Tree tree)
    {
        cost = 10;
        description = " with LEDs";
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
