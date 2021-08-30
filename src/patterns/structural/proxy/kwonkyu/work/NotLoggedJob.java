package patterns.structural.proxy.kwonkyu.work;

public class NotLoggedJob implements Job {
    @Override
    public void run() {
        System.out.println("=== DOING SOME JOBS ... ===");
    }
}
