package Lab07.Lab_07_2;

import java.util.Arrays;
import java.util.List;

public class AnimalRacingController {
    public static void main(String[] args) {
        Animal tiger = new Animal("Tiger", 300);
        Animal horse = new Animal("Horse", 300);
        Animal dog = new Animal("Scooby", 250);
        Animal lion = new Animal("quantri321", 1000);
        Animal cat = new Animal("cat", 1500);
        AnimalRacingController animalRacingController = new AnimalRacingController();
        animalRacingController.racing(Arrays.asList(tiger, horse, dog, lion,cat));
    }

    public void racing(List<Animal> animalList){
        Animal theWinner = new Animal("The winner", 1);
        for (Animal animal : animalList) {
            if(theWinner.getRandomSpeed() <= animal.getRandomSpeed()){
                theWinner.setName(animal.getName());
                theWinner.setRandomSpeed(animal.getRandomSpeed());
            }
        }

        System.out.println("The winner is: " + theWinner.getName() + ", with speed: " + theWinner.getRandomSpeed() + " km/h");
    }
}
