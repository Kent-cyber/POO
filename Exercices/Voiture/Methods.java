package Exercices.Voiture;

import java.util.*;

public class Methods {

    private static Scanner sc = new Scanner(System.in);
    private static int limitationActuelle = 50;

    public static void verifierNotification(String instruction) { // Met à jour la limitation actuelle si une notification le demande
        if (instruction.contains("Notification")) {
            String[] parts = instruction.split("limitée à ");
            if (parts.length > 1) {
                String kmPart = parts[1].split(" ")[0];
                try {
                    limitationActuelle = Integer.parseInt(kmPart);
                    System.out.println(">> Limitation mise à jour : " + limitationActuelle + " km/h");
                } catch (NumberFormatException e) {
                    System.out.println("Erreur de parsing limitation");
                }
            }
        }
    }

    public static int getLimiteActuelle() {
        return limitationActuelle;
    }

    // Met une majuscule au début de chaque mot (gère les noms composés avec tiret)
    public static String capitalize(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return inputString; // Retourne le string par défault si aucune valeur n'est entré
        }
        String[] words = inputString.split("-");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1));
                }
            }
            if (i < words.length - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    public static boolean questionYesNo(String question) { // Pose une question fermée (oui/non) et retourne un booléen
        while (true) {
            System.out.print(question);
            List<String> positive = List.of("o", "oui", "y", "yes", "t", "true" );
            List<String> negative = List.of("n", "non", "no", "f", "false");

            try {
                String response = sc.nextLine().trim().toLowerCase();

                if (positive.contains(response)) {
                    return true;
                } else if (negative.contains(response)) {
                    return false;
                } else {
                    System.out.println("Répondez par oui ou non");
                }
            } catch (Exception e) {
                System.out.println("Répondez par oui ou non");
            }
        }
    }
}
