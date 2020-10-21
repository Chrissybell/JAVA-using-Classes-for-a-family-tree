package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.animals.Animal;

public class Mouse extends Animal {
    private static enum State{LEFT, UP};
    private State state = State.LEFT;
    public Position getMove() {
        switch (state)
        {
            case LEFT:
                state = State.UP;
                return new Position(-1, 0);
            default:

                state = State.LEFT;
                return new Position(0,-1);
        }
    }
    public String toString() {
        return "M";
    }
}

