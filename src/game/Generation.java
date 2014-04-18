package game;

public class Generation {

    private LivingCells livingCells;
    private Rules rules;

    public Generation(LivingCells cells, Rules rules) {
        this.livingCells = cells;
        this.rules = rules;
    }

    public boolean isExtinct() {
        return livingCells.empty();
    }

    public Generation produceNext() {
        LivingCells next = new LivingCells();

        addSurvivors(next);

        addNewCells(next);

        return new Generation(next, rules);
    }

    private void addSurvivors(LivingCells next) {
        for (Cell cell : livingCells) {
            if (willSurvive(cell))
                next.add(cell);
        }
    }

    private void addNewCells(LivingCells next) {
        Cells notAliveNeighbors = livingCells.getNotAliveNeighbors();

        for (Cell cell : notAliveNeighbors) {
            if (willBeBorn(cell))
                next.add(cell);
        }
    }

    private boolean willSurvive(Cell cell) {
        return rules.shouldStayAlive(livingCells.getAliveNeighborsNumberFor(cell));
    }

    private boolean willBeBorn(Cell cell) {
        return rules.shouldBeBorn(livingCells.getAliveNeighborsNumberFor(cell));
    }

    @Override
    public String toString() {
        return "[" + livingCells.toString() + "]";
    }
}
