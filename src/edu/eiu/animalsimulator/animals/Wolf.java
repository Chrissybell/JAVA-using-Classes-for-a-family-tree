package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.animals.Animal;

public class Wolf extends Animal {
    private enum State{DOWN, LEFT, UP, RIGHT};
    private State state = State.DOWN;
    public Position getMove() {
        switch (state)
        {
            case DOWN:
                state = State.LEFT;
                return new Position(0, 4);
            case LEFT:
                state = State.UP;
                return new Position(-3, 0);
            case UP:
                state = State.RIGHT;
                return new Position(0, -2);

            default:
                state = State.UP;
                return new Position(1,0);
        }
    }
    public String toString() {
        return "W";
    }
}

