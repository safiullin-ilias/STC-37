package HW_8;

public class Square extends Rectangle {
    public Square(Point center, double a) {
        super(center, a, a);
    }
    public Square(double x, double y, double a) {
        super(x, y, a, a);
    }

    @Override
    public String toString() {
        return "Kvadrat s tsentrom v (" + _location.X + "; " + _location.Y + "); storona = " + _a + "\r\n"
                + "PloLLIad = " + square() + "; Perimetr = " + length();
    }
}
