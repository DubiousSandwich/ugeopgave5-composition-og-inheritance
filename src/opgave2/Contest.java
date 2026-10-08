package opgave2;

public class Contest {

    private Animal first;
    private Animal second;
    private int count;

    public Contest(Animal first, Animal second){
        this.first = first;
        this.second = second;
        this.count = 1;
    }

    public Animal getWinner(){
        if (first.isActive() && !second.isActive()){
            return first;
        } else if (!first.isActive() && second.isActive()){
            return second;
        }
        return null;
    }

    public void playRound(Animal one, Animal two){
        if (one.isActive() && two.isActive()){
            int firstDamage = two.getEnergy() - one.damage();
            int secondDamage = one.getEnergy() - two.damage();

            two.setEnergy(firstDamage);
            one.setEnergy(secondDamage);
            if (one.getEnergy() < 0){
                one.setEnergy(0);
            } else if (two.getEnergy() < 0){
                two.setEnergy(0);
            }

            System.out.println("-- ROUND " +count+ " --");
            System.out.println(one.getName() + " attacks " + two.getName() + " for " + one.damage() +
                    " (" + two.getName() + " har " + two.getEnergy() + " tilbage)");
            System.out.println(two.getName() + " attacks " + one.getName() + " for " + two.damage() +
                    " (" + one.getName() + " har " + one.getEnergy() + " tilbage)");
            System.out.println();
            count ++;
        }
    }


}
