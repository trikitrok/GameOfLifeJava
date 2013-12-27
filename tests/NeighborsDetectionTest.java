import static org.junit.Assert.*;
import game.LivingCells;

import org.junit.Before;
import org.junit.Test;

import cell.types.ConwaysCell;

public class NeighborsDetectionTest {

    private LivingCells livingCells;

    @Before
    public void setUp() {
        livingCells = new LivingCells();
    }

    @Test
    public void noAliveNeighbors() {
        livingCells.add(new ConwaysCell(1, 1));

        assertEquals(0,
                livingCells.getAliveNeighborsNumberFor(new ConwaysCell(1, 1)));
    }

    @Test
    public void oneAliveNeighbor() {
        livingCells.add(new ConwaysCell(0, 0));

        assertEquals(1,
                livingCells.getAliveNeighborsNumberFor(new ConwaysCell(1, 1)));
    }

    @Test
    public void eightAliveNeighbors() {
        livingCells.add(new ConwaysCell(0, 0));
        livingCells.add(new ConwaysCell(0, 1));
        livingCells.add(new ConwaysCell(0, 2));
        livingCells.add(new ConwaysCell(1, 0));
        livingCells.add(new ConwaysCell(1, 1));
        livingCells.add(new ConwaysCell(1, 2));
        livingCells.add(new ConwaysCell(2, 0));
        livingCells.add(new ConwaysCell(2, 1));
        livingCells.add(new ConwaysCell(2, 2));

        assertEquals(8,
                livingCells.getAliveNeighborsNumberFor(new ConwaysCell(1, 1)));
    }
}
