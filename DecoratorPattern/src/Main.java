public class Main {

    public static void main(String[] args) {
        Liquor oldFashioned = new Bourbon();
	    oldFashioned = new Bitters(oldFashioned);
	    oldFashioned = new Bitters(oldFashioned);
	    oldFashioned = new Cherry(oldFashioned);
	    oldFashioned = new Lime(oldFashioned);
	    System.out.println("Old Fashioned: " + oldFashioned.getDescription() + "\nCalories: " + oldFashioned.getCalories());

	    Liquor gimlet = new Vodka();
	    gimlet = new Lime(gimlet);
	    gimlet = new Lime(gimlet);
        System.out.println("Vodka Gimlet: " + gimlet.getDescription() + "\nCalories: " + gimlet.getCalories());
    }
}
