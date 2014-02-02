package cell.types;

import game.Cells;

public class CellX2D extends Cell2D {

    public CellX2D(int i, int j) {
        super(i, j);
    }

    public Cells getNeighbors() {
        Cells neighborCells = new Cells();

        neighborCells.add(new CellCross2D(i - 1, j - 1));
        neighborCells.add(new CellCross2D(i - 1, j + 1));
        neighborCells.add(new CellCross2D(i + 1, j + 1));
        neighborCells.add(new CellCross2D(i + 1, j - 1));

        return neighborCells;
    }
}
