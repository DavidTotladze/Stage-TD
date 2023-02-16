import Forme.Point;
public class Main {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point(10, 10);
        Point c = new Point(5, 20);

        System.out.println("a : " + a.toString());
        System.out.println("b : " + b.toString());
        System.out.println("c : " + c.toString());

        System.out.println("Distance entre a et b : " + a.distance(b));

        System.out.println("Distance entre a et (10, 0) : " + a.distance(10, 0));

    }
}