package Exercices;

public class Quizz {
    
    private String question; // Création des attributs
    private String[] reponses;
    private Integer bonneReponse;
    private Integer reponseDonnee;

    public Quizz(String question, String[] reponses, int bonneReponse) {
        this.question = question;
        this.reponses = reponses;
        this.bonneReponse = bonneReponse;
        this.reponseDonnee = -1;
    }

    public void afficherQuestion() { // Méthode pour afficher les questions et réponses
        System.out.println("\n" + question);
        for (int i = 0; i < reponses.length; i++) {
            System.out.println((i + 1) + ". " + reponses[i]);
        }
    }

    public void repondre(int reponse) { // Méthode pour répondre de la part de l'utilisateur
        this.reponseDonnee = reponse;
    }

    public int verdict() { // Méthode pour vérifier la réponse à la question
        if (reponseDonnee == bonneReponse) {
            System.out.println("Bonne réponse !");
            return 1;
        } else {
            System.out.println("Mauvaise réponse !");
            afficherBonneReponse();
            return 0;
        }
    }

    public void afficherBonneReponse() {
        System.out.println("La bonne réponse était " + reponses[bonneReponse - 1]);
    }

/******************** Code à mettre dans le main *******************************************/
}
