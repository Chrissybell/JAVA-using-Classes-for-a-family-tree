package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.animals.Animal;

public class Turtle extends Animal {

    private enum State{DOWN, LEFT, UP, RIGHT};
    private State state = State.DOWN;
    public Position getMove() {
        switch (state)
        {
            case DOWN:
                state = State.LEFT;
                return new Position(0, 5);
            case LEFT:
                state = State.UP;
                return new Position(-5, 0);
            case UP:
                state = State.RIGHT;
                return new Position(0, -5);

            default:
                state = State.UP;
                return new Position(5,0);
        }
    }
    public String toString() {
        return "T";
    }
}

