package game;

public class GameOfLife {
    private Generation currentGeneration;

    public GameOfLife(Generation initialGeneration) {
        this.currentGeneration = initialGeneration;
    }

    public void run(int steps) {
        currentGeneration = evolve(steps, currentGeneration);
    }

    private Generation evolve(int steps, Generation currentGeneration) {
        if (gameIsOver(steps))
            return currentGeneration;
        return evolve(steps - 1, currentGeneration.produceNext());
    }

    private boolean gameIsOver(int steps) {
        return steps == 0 || currentGeneration.isExtinct();
    }

    @Override
    public String toString() {
        return currentGeneration.toString();
    }
}
