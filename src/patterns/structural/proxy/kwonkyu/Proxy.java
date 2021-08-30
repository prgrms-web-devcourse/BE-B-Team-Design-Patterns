package patterns.structural.proxy.kwonkyu;

import patterns.structural.proxy.kwonkyu.ac.AccessControl;
import patterns.structural.proxy.kwonkyu.ac.OpenAccess;
import patterns.structural.proxy.kwonkyu.ac.RestrictedAccess;
import patterns.structural.proxy.kwonkyu.work.Job;
import patterns.structural.proxy.kwonkyu.work.LoggedJob;
import patterns.structural.proxy.kwonkyu.work.NotLoggedJob;

public class Proxy {
    public static void testAccessControl() {
        AccessControl openAccess = new OpenAccess();
        AccessControl restrictedAccess = new RestrictedAccess(openAccess);

        System.out.println("OpenAccess for id 'test' is " + openAccess.checkId("test"));
        System.out.println("RestrictedAccess for id 'test' is " + restrictedAccess.checkId("test"));

        System.out.println("OpenAccess for id 'admin' is " + openAccess.checkId("admin"));
        System.out.println("RestrictedAccess for id 'admin' is " + restrictedAccess.checkId("admin"));
    }

    public static void testAround() {
        Job notLoggedJob = new NotLoggedJob();
        LoggedJob loggedJob = new LoggedJob(notLoggedJob);

        notLoggedJob.run();
        loggedJob.run();
    }
}
