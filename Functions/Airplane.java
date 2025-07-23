package Functions;

import java.time.LocalTime;

public class Airplane {
    
    private String flightNumber; // Création des attributs
    private String destination;
    private LocalTime scheduleDeparture;
    private int delayTime;

    public Airplane(String flightNumber, String destination, LocalTime scheduleDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduleDeparture = scheduleDeparture;
        this.delayTime = 0; // Initialise le délai à 0
    }

    public String getFlightNumber() { // Méthode pour retourner les numéros de vol
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) { // Méthode pour entrer la valeur des numéros de vol
        this.flightNumber = flightNumber;
    }

    public String getDestination() { // Méthode pour retourner les destinations
        return destination;
    }

    public void setDestination(String destination) { // Méthode pour entrer la valeur des destinations
        this.destination = destination;
    }

    public LocalTime getScheduleDeparture() { // Méthode pour retourner les heures de départ
        return scheduleDeparture;
    }

    public void setScheduleDeparture(LocalTime scheduleDeparture) { // Méthode pour entrer la valeur des heures
        this.scheduleDeparture = scheduleDeparture;
    }

    public int getDelayTime() { // Méthode pour retourner le délai
        return delayTime;
    }

    public void delay(int minutes) { // Méthode pour entrer le délai en minutes
        this.delayTime = minutes; // Assigne les minutes dans l'attribut
        this.scheduleDeparture = this.scheduleDeparture.plusMinutes(minutes); // Remplace l'attribut avec l'ajout des minutes
    }

    public void checkStatus() {
        if (delayTime == 0) {
            System.out.println("Le vol " + flightNumber + " est à l'heure.");
        } else {
            System.out.println("Le vol " + flightNumber + " est en retard de " + delayTime + " minutes.");
        }
    }
}
