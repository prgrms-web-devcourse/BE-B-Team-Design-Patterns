package patterns.structural.bridge;

public class LGTV implements TV {
    private int volume = 0;

    @Override
    public void powerOn() {
        System.out.println("POWER ON LG TV");
    }

    @Override
    public void powerOff() {
        System.out.println("POWER OFF LG TV");
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
