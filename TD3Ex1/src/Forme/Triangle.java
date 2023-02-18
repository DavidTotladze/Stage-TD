package Forme;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int xA, int yA, int xB, int yB, int xC, int yC){
        this.a = new Point(xA, yA);
        this.b = new Point(xB, yB);
        this.c = new Point(xC, yC);
    }

    public String toString(){
        return "Triangle [(" + a.getX() + ", " + a.getY() + ") , (" + b.getX() + ", " + b.getY()
                + ") , (" + c.getX() + ", " + c.getY() + " )]";
    }

    public double getPerimetre(){
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    public boolean estScalene(){
        if ((a.distance(b) != b.distance(c)) && (a.distance(b) != a.distance(c)) && (b.distance(c) != a.distance(c))){
            return true;
        } else{
            return false;
        }
    }

    public boolean estIsocele(){
        if ((a.distance(b) == b.distance(c)) || (a.distance(b) == a.distance(c)) || (b.distance(c) == a.distance(c))){
            return true;
        } else {
            return false;
        }
    }

    public boolean estEquilateral(){
        if ((a.distance(b) == a.distance(c)) && (a.distance(b) == b.distance(c))){
            return true;
        } else {
            return false;
        }
    }

    public TypeDeTriangle getType(){
        if (estEquilateral() == true){
            return TypeDeTriangle.EQUILATERAL;
        } else if (estIsocele() == true) {
            return TypeDeTriangle.ISOCELE;
        } else {
            return TypeDeTriangle.SCALENE;
        }
    }
}
