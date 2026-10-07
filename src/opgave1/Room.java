package opgave1;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name){
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp){
        lamps.add(lamp);
    }
    public void addWindow(Window window){
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }
    public int getTotalWatt(){
        int sum = 0;
        for (Lamp lamp : lamps){
            sum+= lamp.getWatt();
        }
        return sum;
    }
    public int getTotalWindowArea(){
        int sum = 0;
        for (Window window : windows){
            sum+= window.getAreaCm2();
        }
        return sum;
    }

    public void printRoom(){
        StringBuilder sb = new StringBuilder("Room: " + name + "\nLamps:\n");
        for (Lamp l : lamps){
            sb.append(l);
        }
        sb.append("\nTotal Wattage: " + getTotalWatt() + "W, Amount of lamps: " + getLampCount() +
                "\nWindows: ");
        for (Window w : windows){
            sb.append(w);
        }
        sb.append("\nTotal window area: " + getTotalWindowArea() + "cm");

        System.out.println(sb);
    }
}
