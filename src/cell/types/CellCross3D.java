package cell.types;

import game.Cells;

public class CellCross3D extends Cell3D {
    public CellCross3D(int i, int j, int k) {
        super(i, j, k);
    }

    @Override
    public Cells getNeighbors() {
        Cells neighborCells = new Cells();

        neighborCells.add(new CellCross3D(i - 1, j, k));
        neighborCells.add(new CellCross3D(i + 1, j, k));
        neighborCells.add(new CellCross3D(i, j - 1, k));
        neighborCells.add(new CellCross3D(i, j + 1, k));
        neighborCells.add(new CellCross3D(i, j, k - 1));
        neighborCells.add(new CellCross3D(i, j, k + 1));

        return neighborCells;
    }
}
