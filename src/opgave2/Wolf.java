package opgave2;

public class Wolf extends Animal{

    Wolf(String name){
        super(name);
        setEnergy(55);
    }

    @Override
    public int damage(){
        return 25;
    }

}
