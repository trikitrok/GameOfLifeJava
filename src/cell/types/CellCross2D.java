package cell.types;

import game.Cells;

public class CellCross2D extends Cell2D {

    public CellCross2D(int i, int j) {
        super(i, j);
    }

    @Override
    public Cells getNeighbors() {
        Cells neighborCells = new Cells();

        neighborCells.add(new CellCross2D(i - 1, j));
        neighborCells.add(new CellCross2D(i, j + 1));
        neighborCells.add(new CellCross2D(i + 1, j));
        neighborCells.add(new CellCross2D(i, j - 1));

        return neighborCells;
    }
}
