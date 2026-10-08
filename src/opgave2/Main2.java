package opgave2;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();

        Lion lion = new Lion("Mufasa");
        Wolf wolf = new Wolf("Omega");
        Rabbit rabbit = new Rabbit("Stampe");
        Wolf wolf1 = new Wolf("Alpha");

        animals.add(lion); animals.add(wolf); animals.add(rabbit); animals.add(wolf1);

        Contest contest1 = new Contest(lion, rabbit);
        Contest contest2 = new Contest(wolf, wolf1);


        contest1.playRound(lion,rabbit);
        contest1.playRound(lion,rabbit);
        contest1.playRound(lion,rabbit);
        contest1.playRound(lion,rabbit);

        contest2.playRound(wolf,wolf1);

        System.out.println("Winner: " + contest1.getWinner());

        System.out.println("=====================================");

        for (Animal animal : animals){
            System.out.println(animal);
        }


    }
}
