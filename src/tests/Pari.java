package tests;

import football.*;
import football.exceptions.*;
import tools.*;

import java.util.Scanner;

public class Pari {
    public static void main(String[] args) {
        //init Partie
        Joueur albert = new Joueur("Albert", "Florian", 26, "Knysna Syndrome Club", 80);
        Equipe galactique = new Equipe("Knysna Syndrome Club");
        for (int i = 0; i < 11; i++) {
            try {
                galactique.add(albert);
            } catch (EquipePleineException e) {
                System.out.println(e.getMessage());
            } catch (JoueurHorsClubEquipeException e) {
                System.out.println(e.getMessage());
            }
        }
        Joueur albertBis = new Joueur("Albert", "Florian", 26, "Knysna Syndrome Club Bis", 80);
        Equipe galactiqueBis = new Equipe("Knysna Syndrome Club Bis");
        for (int i = 0; i < 11; i++) {
            try {
                galactiqueBis.add(albertBis);
            } catch (EquipePleineException e) {
                System.out.println(e.getMessage());
            } catch (JoueurHorsClubEquipeException e) {
                System.out.println(e.getMessage());
            }
        }
        Arbitre kivoitou = new Arbitre("Kivoitou", "Kantantou", 45, DegreExperience.EXPERT);
        Partie finalCup = new Partie(galactique, galactiqueBis, kivoitou);

        //Partier
        Scanner scanner = new Scanner(System.in);
        int scoreA = 0;
        int scoreB = 0;
        System.out.println("The rule is (Team A's score + Team B's score) < 9");
        System.out.print("Please input Team A's score: ");
        if (scanner.hasNextInt()) {
            scoreA = scanner.nextInt();
        }
        System.out.print("Please input Team B's score: ");
        if (scanner.hasNextInt()) {
            scoreB = scanner.nextInt();
        }
        scanner.close();
        System.out.println("You predict " + scoreA + " : " + scoreB);
        System.out.println("Game start!");
        double seed1, seed2, seed3;
        for (int i = 0; i < 9; ++i) {
            seed1 = Math.random();  //have one shot or not
            seed2 = Math.random();  //A team shot or B team shot
            seed3 = Math.random();  //shot is valid or not
            if (seed1 < 0.5) {
                if (seed2 < 0.5) {
                    albert.marquerUnBut(finalCup);
                    System.out.println("Team A shot!");
                    if (seed3 < 0.5) {
                        kivoitou.validerUnBut(albert);
                        System.out.println("Team A get 1 score!");
                    } else {
                        System.out.println("Ineffective shot.");
                    }
                } else {
                    albertBis.marquerUnBut(finalCup);
                    System.out.println("Team B shot!");
                    if (seed3 < 0.5) {
                        kivoitou.validerUnBut(albertBis);
                        System.out.println("Team B get 1 score!");
                    } else {
                        System.out.println("Ineffective shot.");
                    }
                }
            }
        }
        if (scoreA == finalCup.getScore()[0] && scoreB == finalCup.getScore()[1]) {
            System.out.println("You win! The score is " + scoreA + " : " + scoreB);
        } else {
            System.out.println("You are wrong! The score is " + finalCup.getScore()[0] + " : " + finalCup.getScore()[1]);
        }
    }

}
