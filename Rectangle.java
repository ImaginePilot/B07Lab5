package lab4;

public class Rectangle {
    Point a, b, c, d;

    /**
     * Create a new rectangle with 4 given points
     * Precondition: 4 points can form a rectangle
     * @param a Left top point
     * @param b Right top point
     * @param c Left bottom point
     * @param d Right bottom point
     */
    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Get the perimeter of the rectangle
     * @return the perimeter of the rectangle
     */
    public double perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
    }

    /**
     * Get the area of the rectangle
     * @return the area of the rectangle
     */
    public double area() {
        return a.distance(b) * a.distance(c);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle o = (Rectangle) obj;
            return a.equals(o.a) && b.equals(o.b) && c.equals(o.c) && d.equals(o.d);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode();
    }
}

