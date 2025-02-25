package arithmetik;

public class MonitorDistributor {

    public int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
    public static void main(String[] args) {
        MonitorDistributor distributor = new MonitorDistributor();
        int monitors = 10;
        int programmers = 3;
        int unuseMonitors = distributor.drawisMonitorsCounter(monitors, programmers);
        System.out.println(unuseMonitors);
    }
}