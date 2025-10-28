

public class Square extends Rectangle {
    
    

    // Constructeur avec paramètre
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Violation LSP: change aussi la hauteur
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height); // Violation LSP: change aussi la largeur
        super.setHeight(height);
    }
}