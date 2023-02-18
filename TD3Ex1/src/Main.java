import Forme.*;
public class Main {
    public static void main(String[] args) {
        Triangle tScalene = new Triangle(1, 2, 10, 20, 100, 200);
        Triangle tIsocele = new Triangle(1, 2, 1, 2, 10, 20);

        System.out.println("tScalene : " + tScalene.toString());
        System.out.println("Type : " + tScalene.getType());

        System.out.println("tIsocele : " + tIsocele.toString());
        System.out.println("Type : " + tIsocele.getType());
    }
}