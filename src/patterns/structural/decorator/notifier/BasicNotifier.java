package patterns.structural.decorator.notifier;

public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.printf("[ NOTIFY ] : %s%n", message);
    }
}
