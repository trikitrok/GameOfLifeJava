import static org.junit.Assert.*;
import game.Cells;

import org.junit.Test;

import cell.types.ConwaysCell;

public class LivingCellsTest {
    @Test
    public void empty() {
        Cells cells = new Cells();

        assertTrue(cells.empty());
    }

    @Test
    public void add() {
        Cells cells = new Cells();

        cells.add(new ConwaysCell(1, 1));

        assertFalse(cells.empty());
    }
}
