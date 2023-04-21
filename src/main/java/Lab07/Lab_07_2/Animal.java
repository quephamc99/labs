package Lab07.Lab_07_2;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int maxSpeed;
    private int randomSpeed;

    public Animal(String name, int maxSpeed) {
        this.name = name;

        this.randomSpeed= new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = randomSpeed;
    }
}
