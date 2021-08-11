package patterns.structural.bridge;

public interface RemoteController {
    void turnOn();
    void turnOff();

    void volumeUp();
    void volumeDown();

    void registerTV(TV tv);
}
