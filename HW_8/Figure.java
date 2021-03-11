package HW_8;

public class Figure implements IMovable {
    protected Point _location;
    public Point location(){
        return _location;
    }

    public Figure(Point location) {
        _location = location;
    }

    public Figure(double x, double y) {
        _location = new Point(x, y);
    }

    public double square() throws Exception {
        throw new Exception("Ne realizovano v bazovom klasse");
    }
    public double length() throws Exception {
        throw new Exception("Ne realizovano v bazovom klasse");
    }

    @Override
    public String toString() {
        return "Kakaya-to Figura s tsentrom v (" + _location.X + "; " + _location.Y + ")";
    }


    @Override
    public void MoveTo(Point location) {
        _location = location;
    }

    @Override
    public void MoveTo(double x, double y) {
        _location = new Point(x, y);
    }

    @Override
    public void MoveDirection(double dx, double dy) {
        _location = new Point(_location.X + dx, _location.Y + dy);
    }
}
