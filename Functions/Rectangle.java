package Functions;

public class Rectangle {
    
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getWidth() {
        return largeur;
    }

    public void setWidth(double largeur) {
        this.largeur = largeur;
    }

    public double getHeight() {
        return hauteur;
    }

    public void setHeight(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getArea() {
        return largeur * hauteur;
    }

    public double getPerimeter() {
        return 2 * (largeur + hauteur);
    }
}
