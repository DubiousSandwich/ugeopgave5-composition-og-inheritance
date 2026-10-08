package opgave2;

public class Lion extends Animal{

    Lion(String name){
        super(name);
        setEnergy(70);
    }

    @Override
    public int damage(){
        return 30;
    }


}
