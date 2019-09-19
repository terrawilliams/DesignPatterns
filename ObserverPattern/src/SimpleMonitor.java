public class SimpleMonitor implements Monitor {

    private Baby babyData;
    private boolean crying;

    public SimpleMonitor(Baby babyData)
    {
        crying = false;
        this.babyData = babyData;
        this.babyData.RegisterMonitor(this);
    }

    @Override
    public void update(boolean crying, int cryingLevel, String babyName) {
        this.crying = crying;
    }

    @Override
    public void display() {
        System.out.println("Baby Crying: " + (crying?"yes":"no"));
    }
}
