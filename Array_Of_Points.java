// מגישים: בלייב מור וחיים אשרף 50/5


public class Array_Of_Points {

    private Point[] points;
    private int count;
    private final int MAX = 100;

    // Const
    public Array_Of_Points() {
        this.count = 0;
        this.points = new Point[MAX];
    }

    // CopyConst
    public Array_Of_Points(Array_Of_Points other) {
        this.count = other.count;
        this.points = new Point[MAX];

        for (int i = 0; i < count; i++) {
            this.points[i] = new Point(other.points[i]);
        }
    }

    // Add a point
    public boolean addPoint(Point one) {
        if (count < MAX) {
            points[count] = new Point(one);
            count++;
            return true;
        }

        return false;
    }

    public int getCount() {
        return this.count;
    }

    public int getMax() {
        return this.MAX;
    }

    public Point[] getPoints() {
        return this.points;
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += points[i].toString() + "\n";
        }

        return result;
    }

    // Remove point by index
    public void removePointByIndex(int num) {
        if (num >= 0 && num < count) {

            for (int i = num; i < count - 1; i++) {
                points[i] = points[i + 1];
            }

            points[count - 1] = null;
            count--;
        }
    }

    // Remove point by value
    public void removePoint(Point one) {
        for (int i = 0; i < count; i++) {

            if (points[i].equals(one)) {

                for (int j = i; j < count - 1; j++) {
                    points[j] = points[j + 1];
                }

                points[count - 1] = null;
                count--;
                return;
            }
        }
    }
}
