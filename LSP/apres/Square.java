

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    @Override
    public double calculateArea() {
        return getArea();
    }

    public int getSide() { return side; }
}