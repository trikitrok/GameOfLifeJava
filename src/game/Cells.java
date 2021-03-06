package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cells implements Iterable<Cell> {
    List<Cell> cells;

    public Cells(List<Cell> cells) {
        this.cells = cells;
    }

    public Cells() {
        this.cells = new ArrayList<Cell>();
    }

    public boolean empty() {
        return cells.isEmpty();
    }

    public void add(Cell cell) {
        if (cells.contains(cell))
            return;
        cells.add(cell);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cells other = (Cells) obj;
        if (other.cells.size() != cells.size())
            return false;
        for (Cell cell : cells) {
            if (!other.cells.contains(cell))
                return false;
        }
        return true;
    }

    @Override
    public Iterator<Cell> iterator() {
        return cells.iterator();
    }
}
