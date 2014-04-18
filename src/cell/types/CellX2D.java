package cell.types;

import game.Cells;

public class CellX2D extends Cell2D {

    public CellX2D(int i, int j) {
        super(i, j);
    }

    public Cells neighbors() {
        Cells neighbors = new Cells();

        neighbors.add(new CellCross2D(i - 1, j - 1));
        neighbors.add(new CellCross2D(i - 1, j + 1));
        neighbors.add(new CellCross2D(i + 1, j + 1));
        neighbors.add(new CellCross2D(i + 1, j - 1));

        return neighbors;
    }
}
