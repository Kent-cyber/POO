package Functions;

import java.time.*;

public class Employee {
    
    private String nom;
    private String titre;
    private double salaire;
    private LocalDate date;

    public Employee(String nom, String titre, double salaire, LocalDate date) {
        this.nom = nom;
        this.titre = titre;
        this.salaire = salaire;
        this.date = date;
    }

    public String getName() {
        return nom;
    }

    public void setName(String nom) {
        this.nom = nom;
    }

    public String getJobTitle() {
        return titre;
    }

    public void setJobTitle(String titre) {
        this.titre = titre;
    }

    public double getSalary() {
        return salaire;
    }

    public void setSalary(double salaire) {
        this.salaire = salaire;
    }

    public LocalDate getHireDate() {
        return date;
    }

    public void setHireDate(LocalDate date) {
        this.date = date;
    }

    public void raiseSalary(double percentage) {
        salaire = salaire + salaire * percentage / 100;
    }

    public int getYearsOfService() {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public void printEmployeeDetail() {
        System.out.println("\nNom : " + nom);
        System.out.println("Job : " + titre);
        System.out.println("Salaire : " + salaire);
        System.out.println("Date d'embauche : " + date);
    }
}
