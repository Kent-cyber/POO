package Functions;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Quentin", 29);
        Person person2 = new Person("Johan", 26);

        System.out.println(person1.getName() + " a " + person1.getAge() + " ans.");
        System.out.println(person2.getName() + " a " + person2.getAge() + " ans.");

        person1.setAge(30);

        person2.setName("Bob");
        person2.setAge(36);

        System.out.println("Entrez le nouveau nom et l'âge");
        System.out.println(person1.getName() + " a maintenant " + person1.getAge() + " ans.");
        System.out.println(person2.getName() + " a maintenant " + person2.getAge() + " ans.");
    }
}