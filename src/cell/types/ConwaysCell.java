package cell.types;

import game.Cells;

public class ConwaysCell extends Cell2D {

    public ConwaysCell(int i, int j) {
        super(i, j);
    }

    public Cells getNeighbors() {
        Cells neighborCells = new Cells();

        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                if (k == 0 && l == 0)
                    continue;
                neighborCells.add(new ConwaysCell(i - k, j - l));
            }
        }
        return neighborCells;
    }
}
