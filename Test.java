// מגישים: בלייב מור וחיים אשרף 50/5


public class Test {

    public static boolean checkPoint(Array_Of_Points arr, Point p) {

        for (int i = 0; i < arr.getCount(); i++) {
            if (arr.getPoints()[i].equals(p)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        Point p2 = new Point(6, 7);
        Point p3 = new Point(7, 8);
        Point p4 = new Point(5, 6);

        System.out.println("Point 1: " + p1);
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());

        p1.setX(10);
        p1.setY(20);

        System.out.println("After set: " + p1);

        System.out.println("Distance: " + p1.distance(p2));
        System.out.println("Equals: " + p1.equals(p4));

        Point p5 = new Point(p2);
        System.out.println("Copied point: " + p5);

        // Create array of points
        Array_Of_Points arr = new Array_Of_Points();

        arr.addPoint(p1);
        arr.addPoint(p2);
        arr.addPoint(p3);
        arr.addPoint(p4);

        System.out.println("\nAll points:");
        System.out.println(arr);

        System.out.println("Count: " + arr.getCount());
        System.out.println("Max: " + arr.getMax());

        // Test copyconst
        Array_Of_Points arr2 = new Array_Of_Points(arr);

        System.out.println("Copied array:");
        System.out.println(arr2);

        // Remove point by index
        arr.removePointByIndex(1);

        System.out.println("After removing index 1:");
        System.out.println(arr);

        // Remove point by value
        arr.removePoint(p4);

        System.out.println("After removing point:");
        System.out.println(arr);

        System.out.println("Count: " + arr.getCount());

        // Test external method
        System.out.println("Is p2 in array? " + checkPoint(arr, p2));
        System.out.println("Is p3 in array? " + checkPoint(arr, p3));
    }
}
