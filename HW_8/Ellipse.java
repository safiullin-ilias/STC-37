package HW_8;

public class Ellipse extends Figure implements IScalable {
    protected double _a, _b;
    public Ellipse(Point center, double a, double b) {
        super(center);
        this._a = a;
        this._b = b;
    }
    public Ellipse(double x, double y, double a, double b) {
        super(x, y);
        this._a = a;
        this._b = b;
    }

    @Override
    public double square()
    {
        return Math.PI * _a * _b;
    }
    @Override
    public double length()
    {
        return Math.PI * (_a + _b);
    }

    @Override
    public String toString() {
        return "Ellips s tsentrom v (" + _location.X + "; " + _location.Y + "); osi = " + _a + " i " + _b + "\r\n"
                + "PloLLIad = " + square() + "; Perimetr = " + length();
    }
    
    @Override
    public void Scale(double scale) {
        this._a *= scale;
        this._b *= scale;
    }
}
