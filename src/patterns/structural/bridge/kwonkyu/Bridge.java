package patterns.structural.bridge.kwonkyu;

public class Bridge {
    public static void test () {
        TV samsung = new SamsungTV();
        TV lg = new LGTV();

        RemoteController remoteCon = new VersatileRemoteController(samsung);
        remoteCon.turnOn();
        remoteCon.volumeUp();
        remoteCon.volumeUp();
        remoteCon.volumeUp();
        remoteCon.volumeDown();
        remoteCon.volumeDown();
        remoteCon.volumeDown();
        remoteCon.turnOff();

        remoteCon.registerTV(lg);
        remoteCon.turnOn();
        remoteCon.volumeUp();
        remoteCon.volumeUp();
        remoteCon.volumeUp();
        remoteCon.volumeDown();
        remoteCon.volumeDown();
        remoteCon.volumeDown();
        remoteCon.turnOff();
    }
}
