package masodik;

public class Test {
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println("Terület: " + triangle.getArea() + "\n" + "Kerület: " + triangle.getPerimeter() + "\nSzine: " + triangle.getColor() + "\nKitöltve:" + triangle.isFilled());
    }
    
}
