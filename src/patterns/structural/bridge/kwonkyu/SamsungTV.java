package patterns.structural.bridge.kwonkyu;

public class SamsungTV implements TV {
    private int volume = 0;

    @Override
    public void powerOn() {
        System.out.println("POWER ON SAMSUNG TV");
    }

    @Override
    public void powerOff() {
        System.out.println("POWER OFF SAMSUNG TV");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
