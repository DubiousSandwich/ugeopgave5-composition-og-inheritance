package opgave2;

public class Animal {

    private String name;
    private int energy;

    public Animal(String name){
        this.name = name;
        this.energy = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isActive(){
        if (energy <= 0){
            return false;
        }
        return true;
    }

    public int damage(){
        return 10;
    }

    @Override
    public String toString(){
        return "Animal: " + name + " (Energy: " + energy + ")";
    }
}
