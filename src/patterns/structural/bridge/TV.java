package patterns.structural.bridge;

public interface TV {
    void powerOn();
    void powerOff();

    int getVolume();
    void setVolume(int volume);
}
