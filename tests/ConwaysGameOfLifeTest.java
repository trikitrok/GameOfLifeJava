import static org.junit.Assert.assertEquals;
import game.GameOfLife;
import game.Generation;
import game.LivingCells;

import org.junit.Test;

import rules.types.ConwaysRules;
import cell.types.ConwaysCell;

public class ConwaysGameOfLifeTest {

    @Test
    public void aBlockIsStillLife() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(1, 1));
        cells.add(new ConwaysCell(1, 0));
        Generation initialGeneration = new Generation(cells, new ConwaysRules());
        GameOfLife game = new GameOfLife(initialGeneration);

        game.run(5);

        assertEquals("[(0, 0), (0, 1), (1, 1), (1, 0)]", game.toString());
    }

    @Test
    public void aBeehiveIsStillLife() throws Exception {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 3));
        cells.add(new ConwaysCell(2, 1));
        cells.add(new ConwaysCell(2, 2));
        Generation initialGeneration = new Generation(cells, new ConwaysRules());
        GameOfLife game = new GameOfLife(initialGeneration);

        game.run(5);

        assertEquals("[(0, 1), (0, 2), (1, 0), (1, 3), (2, 1), (2, 2)]",
                game.toString());
    }

    @Test
    public void aLoafIsStillLife() throws Exception {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 3));
        cells.add(new ConwaysCell(2, 1));
        cells.add(new ConwaysCell(2, 3));
        cells.add(new ConwaysCell(3, 2));
        Generation initialGeneration = new Generation(cells, new ConwaysRules());
        GameOfLife game = new GameOfLife(initialGeneration);

        game.run(5);

        assertEquals(
                "[(0, 1), (0, 2), (1, 0), (1, 3), (2, 1), (2, 3), (3, 2)]",
                game.toString());
    }

    @Test
    public void aBoatIsStillLife() throws Exception {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 2));
        cells.add(new ConwaysCell(2, 1));
        Generation initialGeneration = new Generation(cells, new ConwaysRules());
        GameOfLife game = new GameOfLife(initialGeneration);

        game.run(5);

        assertEquals("[(0, 0), (0, 1), (1, 0), (1, 2), (2, 1)]",
                game.toString());
    }

    @Test
    public void aBlinkerOscillatesWithPeriodTwo() throws Exception {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        Generation initialGeneration = new Generation(cells, new ConwaysRules());
        GameOfLife game = new GameOfLife(initialGeneration);

        game.run(1);
        assertEquals("[(0, 1), (1, 1), (-1, 1)]", game.toString());

        game.run(1);
        assertEquals("[(0, 1), (0, 2), (0, 0)]", game.toString());
    }

    @Test
    public void aToadOscillatesWithPeriodTwo() throws Exception {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(0, 3));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 1));
        cells.add(new ConwaysCell(1, 2));
        Generation initialGeneration = new Generation(cells, new ConwaysRules());
        GameOfLife game = new GameOfLife(initialGeneration);

        game.run(1);
        assertEquals("[(0, 3), (1, 0), (0, 0), (-1, 2), (1, 3), (2, 1)]",
                game.toString());

        game.run(1);
        assertEquals("[(0, 3), (1, 0), (1, 2), (0, 2), (1, 1), (0, 1)]",
                game.toString());
    }

    @Test
    public void aGliderMovesDiagonallyWithPeriod4() throws Exception {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(2, 1));
        Generation initialGeneration = new Generation(cells, new ConwaysRules());
        GameOfLife game = new GameOfLife(initialGeneration);

        game.run(1);
        assertEquals("[(0, 0), (0, 1), (1, 0), (-1, 1), (1, 2)]",
                game.toString());

        game.run(1);
        assertEquals("[(0, 0), (1, 0), (-1, 1), (-1, 0), (0, 2)]",
                game.toString());

        game.run(1);
        assertEquals("[(0, 0), (-1, 1), (-1, 0), (1, 1), (0, -1)]",
                game.toString());

        game.run(1);
        assertEquals("[(-1, 1), (-1, 0), (0, -1), (1, 0), (-1, -1)]",
                game.toString());
    }
}
