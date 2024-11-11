package DZ.first;

public class Circle implements Comparable<Circle> {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle(){

    }
    public int getRadius() {
        return radius;
    }



    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(Circle anotherCircle) {
        return Integer.compare(anotherCircle.radius,this.radius);
    }
}
