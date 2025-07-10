package Functions;

public class Circle {
    
    private double radius; // Déclare une variable en privée pour stocker le radiant du cercle

    public Circle(double radius) { // Constructeur qui initialise la variable radiant
        this.radius = radius;
    }

    public double getRadius() { // Méthode pour retrouver le radiant
        return radius;
    }

    public void setRadius(double radius) { // Méthode pour entrer le radiant
        this.radius = radius;
    }

    public double getArea() { // Méthode pour calculer l'aire du cercle
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() { // Méthode pour calculer la circonférence du cercle
        return 2 * Math.PI * radius;
    }
}