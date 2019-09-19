public class AdvancedMonitor implements Monitor {

    private boolean crying;
    private int cryingLevel;
    private String name;

    @Override
    public void update(boolean crying, int cryingLevel, String babyName) {
        this.crying = crying;
        this.cryingLevel = cryingLevel;
        this.name = babyName;
    }

    @Override
    public void display() {
        System.out.println("Baby Crying: " + (crying?"yes":"no"));
        System.out.println("Crying Level: " + cryingLevel);
    }
}
