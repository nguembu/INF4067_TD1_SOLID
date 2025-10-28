
public class MainLsp {
    public static void main(String[] args) {
        // Test avec Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du Rectangle = " + rectangle.getArea()); // Attend 20

        // Test avec Square substitué à Rectangle
        Rectangle squareAsRectangle = new Square();
        squareAsRectangle.setWidth(5);
        squareAsRectangle.setHeight(4); // Problème: obtient 16 au lieu de 20
        System.out.println("Aire du Carre (comme Rectangle) = " + squareAsRectangle.getArea());
        
        // Le comportement n'est pas coherent: violation du LSP
        System.out.println("→ Violation LSP: 20 attendu, mais " + squareAsRectangle.getArea() + " obtenu");
        
        // Debug: afficher les dimensions
        System.out.println("Dimensions Rectangle: " + rectangle.getWidth() + "x" + rectangle.getHeight());
        System.out.println("Dimensions Carre: " + squareAsRectangle.getWidth() + "x" + squareAsRectangle.getHeight());
    }
}