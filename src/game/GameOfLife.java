package game;

public class GameOfLife {
    private Generation currentGeneration;

    public GameOfLife(Generation initialGeneration) {
        this.currentGeneration = initialGeneration;
    }

    public void run(int steps) {
        for (int i = 0; i < steps && !currentGeneration.isExtinct(); ++i) {
            currentGeneration = currentGeneration.produceNext();
        }
    }

    @Override
    public String toString() {
        return currentGeneration.toString();
    }
}
