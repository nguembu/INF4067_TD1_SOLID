
public class Rectangle {
    protected int width;
    protected int height;

    // Constructeur par défaut nécessaire
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    // Constructeur avec paramètres
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    // Getters pour debug
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}