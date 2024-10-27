package lab5;

public class Circle {
    double radius;
    Point center;

    public Circle(double radius, Point center){
        this.radius = radius;
        this.center = center;
    }

    public double computeCircumference() {
        return 2*Math.PI*radius;
    }

    public double computeArea() {
        return Math.PI*radius*radius;
    }
    
    @Override
    public int hashCode() {
        int hash = 31;
        long rad = Double.doubleToLongBits(radius);
        hash = hash * 31 + (int)(rad ^ (rad >>> 32));
        hash = hash * 31 + center.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { 
            return true; 
        }
        if (obj == null) { 
            return false; 
        }
        if (getClass() != obj.getClass()) { 
            return false; 
        }
        Circle other = (Circle) obj;
        if (Double.compare(radius, other.radius) != 0) {
            return false;
        }
       return center.equals(other.center);
    }
}