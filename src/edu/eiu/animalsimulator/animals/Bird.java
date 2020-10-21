package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.RandomGenerator;
import edu.eiu.animalsimulator.animals.Animal;

import java.util.Random;

public class Bird extends Animal {
    int x, y;
    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Position getMove() {
        switch (RandomGenerator.getRandomGenerator().nextInt(1,4)){
            case 1: return new Position(0,-1); // N
            case 2: return new Position(0,1); //S
            case 3: return new Position(-1,0); //W
            default: return new Position(1,0); //E
        }
    }
    public String toString() {
        return "B";
    }
}
