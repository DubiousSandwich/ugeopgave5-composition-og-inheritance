package opgave1;

public class Main1 {

    public static void main(String[] args) {

        //opgave 1

        Window small = new Window(40, 40);
        Window medium = new Window(60, 60);
        Window large = new Window(100, 150);

        Lamp smallLamp = new Lamp(60);
        smallLamp.turnOn();
        Lamp largeLamp = new Lamp(120);

        Room r1 = new Room("Bedroom");
        Room r2 = new Room("Kitchenette");

        r1.addLamp(smallLamp);
        r1.addLamp(smallLamp);
        r1.addLamp(largeLamp);

        r2.addLamp(largeLamp);
        r2.addLamp(smallLamp);

        r1.addWindow(large);
        r1.addWindow(large);

        r2.addWindow(medium);
        r2.addWindow(small);

        Building hutt = new Building("Wooden hutt");

        hutt.addRoom(r1);
        hutt.addRoom(r2);

        hutt.printBuilding();

    }
}
