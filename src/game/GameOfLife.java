package game;

public class GameOfLife {
    private Generation current;

    public GameOfLife(Generation initialGeneration) {
        this.current = initialGeneration;
    }

    public void run(int steps) {
        for (int i = 0; i < steps; ++i) {
            if (current.isExtinct())
                return;
            current = current.produceNextGeneration();
        }
    }
}
