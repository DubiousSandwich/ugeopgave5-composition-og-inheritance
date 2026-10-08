package opgave2;

public class Rabbit extends Animal {

    Rabbit(String name){
        super(name);
        setEnergy(100);
    }

    @Override
    public int damage(){
        return 15;
    }

}
