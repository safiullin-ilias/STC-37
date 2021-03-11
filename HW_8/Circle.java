package HW_8;

public class Circle extends Ellipse {
    public Circle(Point center, double r) {
        super(center, r, r);
    }
    public Circle(double x, double y, double r) {
        super(x, y, r, r);
    }

    @Override
    public String toString() {
        return "Krug s tsentrom v (" + _location.X + "; " + _location.Y + "); radius = " + _a + "\r\n"
                + "PloLLIad = " + square() + "; Dlina okru}|{nosti = " + length();
    }
}
