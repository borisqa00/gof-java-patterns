package ru.haxor.structural.bridge;

import ru.haxor.structural.bridge.devices.Device;
import ru.haxor.structural.bridge.devices.Tv;
import ru.haxor.structural.bridge.remotes.AdvancedRemote;
import ru.haxor.structural.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
