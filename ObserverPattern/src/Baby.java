import java.util.LinkedList;

public interface Baby {
    public LinkedList<Monitor> observers = new LinkedList<Monitor>();

    public void RegisterMonitor(Monitor newMonitor);
    public void RemoveMonitor(Monitor removedMonitor);
    public void NotifyMonitors();

}
