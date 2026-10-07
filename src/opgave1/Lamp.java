package opgave1;

public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp(int watt){
        this.watt = watt;
        this.isOn = false;
    }

    public int getWatt(){
        return watt;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    @Override
    public String toString(){
        return watt + "W, Is on: " + isOn + ", ";
    }

}
