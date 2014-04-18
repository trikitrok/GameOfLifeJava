package game;

public class GameOfLife {
    private Generation currentGeneration;

    public GameOfLife(Generation initialGeneration) {
        this.currentGeneration = initialGeneration;
    }

    public void run(int steps) {
        for (int i = 0; i < steps; ++i) {
            if (currentGeneration.isExtinct())
                return;
            currentGeneration = currentGeneration.produceNext();
        }
    }

    @Override
    public String toString() {
        return currentGeneration.toString();
    }
}
