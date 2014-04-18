package game;

public class LivingCells extends Cells {

    public Cells getNotAliveNeighbors() {
        Cells notAliveNeighbors = new Cells();
        for (Cell cell : this.cells) {
            getNotAliveNeighborsOf(cell, notAliveNeighbors);
        }
        return notAliveNeighbors;
    }

    public int getAliveNeighborsNumberFor(Cell cell) {
        return countAlive(cell.neighbors());
    }

    private void getNotAliveNeighborsOf(Cell cell, Cells notAliveNeighbors) {
        Cells neighbors = cell.neighbors();
        for (Cell neighbor : neighbors) {
            if (!isAlive(neighbor))
                notAliveNeighbors.add(neighbor);
        }
    }

    private int countAlive(Cells neighbors) {
        int numberOfAliveNeighbors = 0;
        for (Cell neighbor : neighbors) {
            if (isAlive(neighbor))
                numberOfAliveNeighbors++;
        }
        return numberOfAliveNeighbors;
    }

    private boolean isAlive(Cell neighBorCell) {
        return this.cells.contains(neighBorCell);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.cells.size() - 1; ++i) {
            res += this.cells.get(i).toString() + ", ";
        }
        res += this.cells.get(this.cells.size() - 1).toString();
        return res;
    }
}
