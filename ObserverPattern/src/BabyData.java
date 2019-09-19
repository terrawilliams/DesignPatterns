import java.util.LinkedList;

public class BabyData implements Baby {

    private boolean crying;
    private int cryingLevel;
    private String name;

    public BabyData(String BabyName)
    {
        crying = false;
        cryingLevel = 0;
        name = BabyName;
    }

    @Override
    public void RegisterMonitor(Monitor newMonitor) {
        observers.add(newMonitor);
    }

    @Override
    public void RemoveMonitor(Monitor removedMonitor) {
        observers.remove(removedMonitor);
    }

    @Override
    public void NotifyMonitors() {
        for (Monitor monitor: observers) {
            monitor.update(crying, cryingLevel, name);
        }
    }

    public void setCrying(boolean crying) {
        this.crying = crying;
        NotifyMonitors();
    }

    public void setCryingLevel(int cryingLevel) {
        this.cryingLevel = cryingLevel;
        NotifyMonitors();
    }
}
