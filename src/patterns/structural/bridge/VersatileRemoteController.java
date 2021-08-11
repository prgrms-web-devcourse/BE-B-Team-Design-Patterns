package patterns.structural.bridge;

public class VersatileRemoteController implements RemoteController {
    TV tv;

    public VersatileRemoteController(TV tv) {
        this.tv = tv;
    }

    @Override
    public void registerTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void turnOn() {
        tv.powerOn();
    }

    @Override
    public void turnOff() {
        tv.powerOff();
    }

    @Override
    public void volumeUp() {
        int volume = tv.getVolume();
        tv.setVolume(volume + 1);
        System.out.println("Set volume " + (volume + 1));
    }

    @Override
    public void volumeDown() {
        int volume = tv.getVolume();
        tv.setVolume(volume - 1);
        System.out.println("Set volume " + (volume - 1));
    }
}
