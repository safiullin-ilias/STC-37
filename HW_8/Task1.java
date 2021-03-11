package HW_8;

public class Task1 {
    public static void main(String[] args) {
        Circle c = new Circle(0, 5, 7);
        Ellipse e = new Ellipse(new Point(5, 8), 2, 14);

        Square s = new Square(10, 7, 9);
        Rectangle r = new Rectangle(new Point(9, -2), 0.9, 2);

        System.out.println(c);
        System.out.println(e);
        System.out.println(s);
        System.out.println(r);

        c.MoveTo(5, 12);
        c.Scale(2);
        System.out.println("Izmenen Krug");
        System.out.println(c);

        r.MoveDirection(-2, 7);
        r.Scale(7);
        System.out.println("Izmenen Pryamougolnik");
        System.out.println(r);
    }
}
