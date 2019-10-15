package elso;

import java.util.Date;

public class GeometricShape {
    
    public String color = "white";
    public boolean filled = false;
    public Date dateCreated = new Date();

    public GeometricShape() {
    }
      
    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + this.dateCreated + "\n" + "color: " + this.color + " and filled: " + this.filled;
    }
    
}
