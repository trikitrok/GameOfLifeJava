package game;

public interface Rules {
    public boolean shouldStayAlive(int numberOfNeighbors);

    public boolean shouldBeBorn(int numberOfNeighbors);
}
