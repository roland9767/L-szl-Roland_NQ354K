package masodik;

public class Teszt {
    
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
                
        System.out.println(rp1.getPerimeter() + rp1.getArea());
        System.out.println(rp2.getPerimeter() + rp2.getArea());
        System.out.println(rp3.getPerimeter() + rp3.getArea());
    }
            
}
