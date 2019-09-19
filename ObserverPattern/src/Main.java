public class Main {

    public static void main(String[] args) {
	    BabyData baby1 = new BabyData("Baby1");
	    BabyData baby2 = new BabyData("Baby2");

	    Monitor simpleMonitor = new SimpleMonitor(baby1);
	    Monitor advancedMonitor = new AdvancedMonitor(baby1);

	    baby1.setCrying(true);
	    baby1.setCryingLevel(2);

	    simpleMonitor.display();
	    advancedMonitor.display();
    }
}
