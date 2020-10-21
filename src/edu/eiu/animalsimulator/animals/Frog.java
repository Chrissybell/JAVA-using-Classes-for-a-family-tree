package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.animals.Animal;

import java.util.Random;

public class Frog extends Animal {
    int x, y;
    public Frog(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Position getMove() {
        Random step = new Random();
        int rand = step.nextInt(4);
        //for this random walk a random number chooses the direction where the bird goes
        switch (rand)
        {
            case 0:
                return new Position(0, 3);

            case 1:
                return new Position(-3, 0);

            case 2:
                return new Position(0, -3);

            default:
                return new Position(3,0);
        }
    }
    public String toString() {
        return "F";
    }
}

