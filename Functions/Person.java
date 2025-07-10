package Functions;

public class Person {
    
    private String name;
    private Integer age;

    public Person(String name, int age) { // Constructeur qui initialise les variables nom et âge
        this.name = name;
        this.age = age;
    }

    public String getName() { // Méthode pour retrouver le nom de la personne
        return name;
    }

    public int getAge() { // Méthode pour retrouver l'âge
        return age;
    }

    public void setName(String name) { // Méthode pour entrer le nom de la personne
        this.name = name;
    }

    public void setAge(int age) { // Méthode pour entrer l'âge de la personne
        this.age = age;
    }
}
