package harmadik;

public class Rectangle {
    
    double width;
    double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double h, double w) {
        this.width = w;
        this.height = h;
    }
    
    public double getArea(){
        return this.height * this.width;
    }
    
    public double getPerimeter(){
        return 2 * (this.height * this.width);
    }

    @Override
    public String toString() {
        return "Szelesseg: " + width + "\n" + "Magassag: " + height + "\n" + "Terulet: " + this.getArea() + "\n" + "Kerulet: " + this.getPerimeter();
    }
  
}