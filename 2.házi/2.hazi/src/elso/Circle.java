package elso;

import static java.lang.Math.PI;

public class Circle extends GeometricShape{
    
    public double radius;
    
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
        
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.pow(this.radius, 2) * PI;
    }
    
    public double getPerimeter(){
        return 2 * this.radius * PI;
    }
    
    public double getDiameter(){
        return 2 * this.radius;
    }
    
}
