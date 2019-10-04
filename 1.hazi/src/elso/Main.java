package elso;

public class Main {
    
    public static void main(String[] args) {
        Pont p1 = new Pont(3,7);
        Pont p2 = new Pont(5,2);
        Pont p3 = new Pont(1,9);
        Pont p4 = new Pont(4,4);
        
        p1.setY(5 + p1.getY());
        p2.setY(5 + p2.getY());
        p3.setX(p3.getX() - 3.4);
        p4.setX(p4.getX() - 3.4);
        
        System.out.println(p1.getY() + "\n" + p2.getY() + "\n" + p3.getX() + "\n" + p4.getX());
    }
    
}
