package edu.eiu.animalsimulator.animals;

import edu.eiu.animalsimulator.Position;
import edu.eiu.animalsimulator.animals.Animal;

public class Snake extends Animal {
    int x, y;
    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Position getMove() {
        int i = 1;
        int j = 2;
        while(true) {
            y = y+1;
            x = x + i;
            y = y + 1;
            x = x - j;
            i = i + 2;
            j = j + 2;
        }
    }
    public String toString() {
        return "S";
    }
}
