package patterns.structural.decorator.notifier;

import patterns.structural.decorator.notifier.factory.DatabaseLoggerNotifierFactory;
import patterns.structural.decorator.notifier.factory.FullNotifierFactory;
import patterns.structural.decorator.notifier.factory.ManagerAlertNotifierFactory;

public class NotifyingApplication {
    public static void test() {
        Notifier basic = new BasicNotifier();
        basic.send("Basic Notifier Message.");

        System.out.println();

        Notifier dbDecorated = new DatabaseLoggerNotifierFactory().build();
        dbDecorated.send("Database Decorated Notifier Message.");

        System.out.println();

        Notifier managerDecorated = new ManagerAlertNotifierFactory().build();
        managerDecorated.send("Manager Decorated Notifier Message.");

        System.out.println();

        Notifier fullDecorated = new FullNotifierFactory().build();
        fullDecorated.send("Full Decorated Notifier Message.");
    }
}
