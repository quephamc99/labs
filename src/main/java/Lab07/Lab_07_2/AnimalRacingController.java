package Lab07.Lab_07_2;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacingController {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Tiger",200);
        Animal horse = new Horse("Horse", 500);
        Animal dog = new Dog("Scooby", 300);

        AnimalRacingController animalRacingController = new AnimalRacingController();
        animalRacingController.racing(Arrays.asList(tiger, horse, dog));
    }

    public void racing(List<Animal> animalList){
        //declare a list of winners if there are multiple animals with same max speed.
        ArrayList<Animal> listWinners = new ArrayList<>();
        listWinners.add(animalList.get(0));
        Animal theWinner = animalList.get(0);
        for (int i=1; i<animalList.size(); i++) {
            if(theWinner.getRandomSpeed() < animalList.get(i).getRandomSpeed()){
                theWinner = animalList.get(i);
                listWinners.clear();
                listWinners.add(animalList.get(i));
            }else if(theWinner.getRandomSpeed() == animalList.get(i).getRandomSpeed()){
                listWinners.add(animalList.get(i));
            }
        }
        //print list winners
        for (Animal listWinner : listWinners) {
            System.out.println("The winner is: " + listWinner.getName() + ", with speed: " + listWinner.getRandomSpeed() + " km/h\n");
        }

    }
}
