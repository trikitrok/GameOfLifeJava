package cell.types;

import game.Cell;

public abstract class Cell3D implements Cell {
    protected int i;
    protected int j;
    protected int k;

    public Cell3D(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cell3D other = (Cell3D) obj;
        if (i != other.i)
            return false;
        if (j != other.j)
            return false;
        if (k != other.k)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "(" + i + ", " + j + ", " + k + ")";
    }
}
