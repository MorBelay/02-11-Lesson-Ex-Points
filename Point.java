// מגישים: בלייב מור וחיים אשרף 50/5

public class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "X: " + this.x + ", Y: " + this.y;
    }

    // Calculate distance between two points
    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Check if two points are equal
    public boolean equals(Point other) {
        return this.x == other.x && this.y == other.y;
    }
}
