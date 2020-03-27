final class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // state-based implementations of equals, hashCode, toString
    // nothing else
    }
============================================================================
now, we can easily use


record Point(int x, int y) {
}

to replace