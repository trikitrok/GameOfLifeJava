package game;

public class LivingCells extends Cells {

    public Cells getNotAliveNeighbors() {
        Cells candidates = new Cells();

        for (Cell cell : cells) {
            Cells neighbors = cell.getNeighbors();

            for (Cell neighbor : neighbors) {
                if (!isAlive(neighbor))
                    candidates.add(neighbor);
            }
        }

        return candidates;
    }

    public int getAliveNeighborsNumberFor(Cell cell) {
        Cells neighbors = cell.getNeighbors();

        int numberOfNeighbors = 0;

        for (Cell neighbor : neighbors) {
            if (isAlive(neighbor))
                numberOfNeighbors++;
        }

        return numberOfNeighbors;
    }

    private boolean isAlive(Cell neighBorCell) {
        return cells.contains(neighBorCell);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < cells.size() - 1; ++i) {
            res += cells.get(i).toString() + ", ";
        }
        res += cells.get(cells.size() - 1).toString();
        return res;
    }
}
