package Exercices.Quizz;

import java.time.*;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Quizz> quizzList = new ArrayList<>(); // Création de la liste quizz

        // Ajout de questions et réponses
        quizzList.add(new Quizz("Quelle est la capitale de la suisse ?", new String[]{"Zurich", "Berne", "Genève"}, 2));
        quizzList.add(new Quizz("Combien y a-t-il de continents sur Terre ?", new String[]{"5", "6", "7"}, 3));
        quizzList.add(new Quizz("Quelle est la plus grande ville du monde ?", new String[]{"Tokyo", "Shangai", "New Delhi"}, 1));
        quizzList.add(new Quizz("Combien y a-t-il de régions en France en comptant l'Outre-mer ?", new String[]{"8", "13", "18"}, 3));
        quizzList.add(new Quizz("Quel est le plus petit pays du monde ?", new String[]{"Vatican", "Monaco", "Saint-Marin"}, 1));

        Collections.shuffle(quizzList); // Mélange aléatoire des questions

        int score = 0; // Initialise le score à 0

        int tempsLimiteMinutes = 1; // Ajout du minuteur en 1 minute
        LocalDateTime start = LocalDateTime.now(); // Initialise le début
        LocalDateTime end = start.plusMinutes(tempsLimiteMinutes); // Initialise la fin
        
        System.out.println("Bienvenue au quizz sur la géographie, vous avez une minute pour répondre à cinq questions.\nPrêt c'est parti !");
        for (Quizz q : quizzList) {
            if (LocalDateTime.now().isAfter(end)) {
                System.out.println("\nTemps écoulé ! Le quizz est terminé");
                break;
            }

            q.afficherQuestion();
            System.out.print("Votre réponse (1-3) : ");

            int reponse = -1;
            try {
                reponse = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Réponse invalide. Compté comme faux");
            }

            q.repondre(reponse);
            score += q.verdict();
        }

        if (score == quizzList.size()) {
            System.out.println("\nChapeau bas ! Vous avez fait un sans faute");
        }
        System.out.println("\nVotre score final est : " + score + " sur " + quizzList.size() + ".");
    }
}
