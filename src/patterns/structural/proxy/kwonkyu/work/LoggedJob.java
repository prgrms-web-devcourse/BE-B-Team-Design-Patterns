package patterns.structural.proxy.kwonkyu.work;

public class LoggedJob implements Job {

    Job notLoggedJob;

    public LoggedJob(Job notLoggedJob) {
        this.notLoggedJob = notLoggedJob;
    }

    @Override
    public void run() {
        System.out.println("[LOG] JOB STARTED...");
        notLoggedJob.run();
        System.out.println("[LOG] JOB FINISHED.");
    }
}
