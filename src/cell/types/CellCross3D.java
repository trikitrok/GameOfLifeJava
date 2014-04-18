package cell.types;

import game.Cells;

public class CellCross3D extends Cell3D {
    public CellCross3D(int i, int j, int k) {
        super(i, j, k);
    }

    @Override
    public Cells neighbors() {
        Cells neighbors = new Cells();

        neighbors.add(new CellCross3D(i - 1, j, k));
        neighbors.add(new CellCross3D(i + 1, j, k));
        neighbors.add(new CellCross3D(i, j - 1, k));
        neighbors.add(new CellCross3D(i, j + 1, k));
        neighbors.add(new CellCross3D(i, j, k - 1));
        neighbors.add(new CellCross3D(i, j, k + 1));

        return neighbors;
    }
}
