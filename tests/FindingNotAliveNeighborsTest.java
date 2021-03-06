import static org.junit.Assert.*;

import game.Cells;
import game.LivingCells;

import org.junit.Before;
import org.junit.Test;

import cell.types.ConwaysCell;

public class FindingNotAliveNeighborsTest {

    private LivingCells livingCells;

    @Before
    public void setUp() {
        livingCells = new LivingCells();
    }

    @Test
    public void noNotAliveNeighbors() {
        assertTrue(livingCells.getNotAliveNeighbors().empty());
    }

    @Test
    public void someNotAliveNeighbors() {
        livingCells.add(new ConwaysCell(1, 1));

        assertEquals(expectedNotAliveNeighbors(), livingCells.getNotAliveNeighbors());
    }

    private Cells expectedNotAliveNeighbors() {
        Cells expectedNotAliveNeighbors = new Cells();
        expectedNotAliveNeighbors.add(new ConwaysCell(0, 0));
        expectedNotAliveNeighbors.add(new ConwaysCell(0, 1));
        expectedNotAliveNeighbors.add(new ConwaysCell(0, 2));
        expectedNotAliveNeighbors.add(new ConwaysCell(1, 0));
        expectedNotAliveNeighbors.add(new ConwaysCell(1, 2));
        expectedNotAliveNeighbors.add(new ConwaysCell(2, 0));
        expectedNotAliveNeighbors.add(new ConwaysCell(2, 1));
        expectedNotAliveNeighbors.add(new ConwaysCell(2, 2));
        return expectedNotAliveNeighbors;
    }
}
