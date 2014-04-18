package game;

public class GameOfLife {
    private Generation currentGeneration;

    public GameOfLife(Generation initialGeneration) {
        this.currentGeneration = initialGeneration;
    }

    public void run(int steps) {
        for (int step = 0; gameIsNotOver(steps, step); ++step) {
            currentGeneration = currentGeneration.produceNext();
        }
    }

    private boolean gameIsNotOver(int steps, int step) {
        return step < steps && !currentGeneration.isExtinct();
    }

    @Override
    public String toString() {
        return currentGeneration.toString();
    }
}
