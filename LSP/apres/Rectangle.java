

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public double calculateArea() {
        return getArea();
    }

    // Getters pour d'éventuelles autres utilisations
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}