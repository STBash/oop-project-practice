package pl.stbash.usbdevice;

public class MemoryStick implements USBDevice{

    private final String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }


    @Override
    public boolean connect() {
        System.out.println("Memory stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(ejected){
            System.out.println("Memory Stick disconnected");
            return true;
        }else  {
            System.out.println("Please eject Memory Stick first!");
            return false;
        }
    }

    public void eject(){
        System.out.println("Ejected Memory stick");
        ejected = true;
    }

    @Override
    public String getName() {
        return name;
    }
}
