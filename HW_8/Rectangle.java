package HW_8;

public class Rectangle extends Figure implements IScalable {
    protected double _a, _b;
    public Rectangle(Point center, double a, double b) {
        super(center);
        this._a = a;
        this._b = b;
    }
    public Rectangle(double x, double y, double a, double b) {
        super(x, y);
        this._a = a;
        this._b = b;
    }

    @Override
    public double square()
    {
        return _a * _b;
    }
    @Override
    public double length()
    {
        return 2 * (_a + _b);
    }

    @Override
    public String toString() {
        return "Ghyamougolnik s tsentrom v (" + _location.X + "; " + _location.Y + "); storonyi = " + _a + " i " + _b + "\r\n"
                + "PloLLIad = " + square() + "; Perimetr = " + length();
    }

    @Override
    public void Scale(double scale) {
        this._a *= scale;
        this._b *= scale;
    }
}
