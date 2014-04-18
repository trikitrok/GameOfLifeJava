package cell.types;

import game.Cells;

public class CellCross2D extends Cell2D {

    public CellCross2D(int i, int j) {
        super(i, j);
    }

    @Override
    public Cells neighbors() {
        Cells neighbors = new Cells();

        neighbors.add(new CellCross2D(i - 1, j));
        neighbors.add(new CellCross2D(i, j + 1));
        neighbors.add(new CellCross2D(i + 1, j));
        neighbors.add(new CellCross2D(i, j - 1));

        return neighbors;
    }
}
