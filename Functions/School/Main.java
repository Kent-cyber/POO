package Functions.School;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        School school = new School();

        System.out.println("Bienvenue à l'école Fabien Bonarien, veuillez renseigné les informations demandées :");

        Student student1 = new Student("Jean-Claude Pastèque", 17);
        Student student2 = new Student("Virginie Aucoin", 16);
        Student student3 = new Student("Samuel Malofois", 16);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        Teacher teacher1 = new Teacher("Jean-Eudes Escroc", "Mathématiques");
        Teacher teacher2 = new Teacher("Aurélie Gros", "Anglais");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
    }
}
