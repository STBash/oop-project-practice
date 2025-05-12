package pl.stbash.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
