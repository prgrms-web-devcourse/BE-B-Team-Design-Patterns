package patterns.structural.bridge.kwonkyu;

public interface RemoteController {
    void turnOn();
    void turnOff();

    void volumeUp();
    void volumeDown();

    void registerTV(TV tv);
}
