import static org.junit.Assert.*;
import game.Generation;
import game.LivingCells;

import org.junit.Test;

import rules.types.ConwaysRules;
import cell.types.ConwaysCell;

public class GenerationTest {

    @Test
    public void extintGenerationsProducesExtintGeneration() {
        LivingCells cells = new LivingCells();
        Generation current = new Generation(cells, new ConwaysRules());

        assertTrue(current.isExtinct());

        Generation next = current.produceNextGeneration();

        assertTrue(next.isExtinct());
    }

    @Test
    public void squareRemainsTheSame() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(1, 1));
        cells.add(new ConwaysCell(1, 0));
        Generation current = new Generation(cells, new ConwaysRules());

        Generation next = current.produceNextGeneration();

        assertFalse(next.isExtinct());
        assertEquals("[(0, 0), (0, 1), (1, 1), (1, 0)]", next.toString());
    }

    @Test
    public void aCellIsBornAndOnlyItRemains() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(-1, -1));
        cells.add(new ConwaysCell(1, 1));
        cells.add(new ConwaysCell(-1, 1));
        Generation current = new Generation(cells, new ConwaysRules());

        Generation next = current.produceNextGeneration();

        assertFalse(next.isExtinct());
        assertEquals("[(0, 0)]", next.toString());
    }

    @Test
    public void OnlyOneCellRemainsAndTwoAreBorn() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(-1, -1));
        cells.add(new ConwaysCell(1, 1));
        cells.add(new ConwaysCell(-1, 1));
        Generation current = new Generation(cells, new ConwaysRules());

        Generation next = current.produceNextGeneration();

        assertFalse(next.isExtinct());
        assertEquals("[(0, 0), (0, 1), (-1, 0)]", next.toString());
    }
}
