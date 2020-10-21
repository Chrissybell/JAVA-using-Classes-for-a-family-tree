package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.animals.Animal;

public class Rabbit extends Animal {
    private enum State{UP, RIGHT, DOWN};
    private State state = State.UP;
    public Position getMove() {
        switch (state)
        {

            case UP:
                state = State.RIGHT;
                return new Position(0, -1);
            case RIGHT:
                state = State.DOWN;
                return new Position(1, 0);
            default:
                state = State.UP;
                return new Position(0,1);
        }
    }
    public String toString() {
        return "V";
    }
}

