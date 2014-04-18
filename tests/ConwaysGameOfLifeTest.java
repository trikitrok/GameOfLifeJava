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
        GameOfLife game = new GameOfLife(new Generation(aBlock(), new ConwaysRules()));

        game.run(5);

        assertEquals("[(0, 0), (0, 1), (1, 1), (1, 0)]", game.toString());
    }

    @Test
    public void aBeehiveIsStillLife() throws Exception {
        GameOfLife game = new GameOfLife(new Generation(aBeehive(), new ConwaysRules()));

        game.run(5);

        assertEquals("[(0, 1), (0, 2), (1, 0), (1, 3), (2, 1), (2, 2)]", game.toString());
    }

    @Test
    public void aLoafIsStillLife() throws Exception {
        GameOfLife game = new GameOfLife(new Generation(aLoaf(), new ConwaysRules()));

        game.run(5);

        assertEquals("[(0, 1), (0, 2), (1, 0), (1, 3), (2, 1), (2, 3), (3, 2)]", game.toString());
    }

    @Test
    public void aBoatIsStillLife() throws Exception {
        GameOfLife game = new GameOfLife(new Generation(aBoat(), new ConwaysRules()));

        game.run(5);

        assertEquals("[(0, 0), (0, 1), (1, 0), (1, 2), (2, 1)]", game.toString());
    }

    @Test
    public void aBlinkerOscillatesWithPeriodTwo() throws Exception {
        GameOfLife game = new GameOfLife(new Generation(aBlinker(), new ConwaysRules()));

        game.run(1);
        assertEquals("[(0, 1), (1, 1), (-1, 1)]", game.toString());

        game.run(1);
        assertEquals("[(0, 1), (0, 2), (0, 0)]", game.toString());
    }

    @Test
    public void aToadOscillatesWithPeriodTwo() throws Exception {
        GameOfLife game = new GameOfLife(new Generation(aToad(), new ConwaysRules()));

        game.run(1);
        assertEquals("[(0, 3), (1, 0), (0, 0), (-1, 2), (1, 3), (2, 1)]", game.toString());

        game.run(1);
        assertEquals("[(0, 3), (1, 0), (1, 2), (0, 2), (1, 1), (0, 1)]", game.toString());
    }

    @Test
    public void aGliderMovesDiagonallyWithPeriod4() throws Exception {
        GameOfLife game = new GameOfLife(new Generation(aGlider(), new ConwaysRules()));

        game.run(1);
        assertEquals("[(0, 0), (0, 1), (1, 0), (-1, 1), (1, 2)]", game.toString());

        game.run(1);
        assertEquals("[(0, 0), (1, 0), (-1, 1), (-1, 0), (0, 2)]", game.toString());

        game.run(1);
        assertEquals("[(0, 0), (-1, 1), (-1, 0), (1, 1), (0, -1)]", game.toString());

        game.run(1);
        assertEquals("[(-1, 1), (-1, 0), (0, -1), (1, 0), (-1, -1)]", game.toString());
    }

    // http://www.conwaylife.com/wiki/Beehive
    private LivingCells aBeehive() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 3));
        cells.add(new ConwaysCell(2, 1));
        cells.add(new ConwaysCell(2, 2));
        return cells;
    }

    // http://en.wikipedia.org/wiki/Still_life_%28cellular_automaton%29#Loaves
    private LivingCells aLoaf() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 3));
        cells.add(new ConwaysCell(2, 1));
        cells.add(new ConwaysCell(2, 3));
        cells.add(new ConwaysCell(3, 2));
        return cells;
    }

    // http://en.wikipedia.org/wiki/Still_life_%28cellular_automaton%29#Blocks
    private LivingCells aBlock() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(1, 1));
        cells.add(new ConwaysCell(1, 0));
        return cells;
    }

    // http://commons.wikimedia.org/wiki/File:Game_of_life_boat.svg
    private LivingCells aBoat() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 2));
        cells.add(new ConwaysCell(2, 1));
        return cells;
    }

    // http://en.wikipedia.org/wiki/File:Game_of_life_blinker.gif
    private LivingCells aBlinker() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        return cells;
    }

    // http://en.wikipedia.org/wiki/File:Game_of_life_toad.gif
    private LivingCells aToad() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(0, 3));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(1, 1));
        cells.add(new ConwaysCell(1, 2));
        return cells;
    }

    // http://en.wikipedia.org/wiki/File:Game_of_life_animated_glider.gif
    private LivingCells aGlider() {
        LivingCells cells = new LivingCells();
        cells.add(new ConwaysCell(0, 0));
        cells.add(new ConwaysCell(0, 1));
        cells.add(new ConwaysCell(0, 2));
        cells.add(new ConwaysCell(1, 0));
        cells.add(new ConwaysCell(2, 1));
        return cells;
    }
}
