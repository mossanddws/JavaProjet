package tests;

import java.util.ArrayList;
import java.util.List;

import tools.DegreExperience;
import football.*;
import football.exceptions.EquipePleineException;
import football.exceptions.JoueurHorsClubEquipeException;


public class TestEquipe {
    public static void main(String[] args) {
        Joueur diStefano = new Joueur("Di Stefano", "Alfredo", 32, "Knysna Syndrome Club", 200);
        Joueur puskas = new Joueur("Puskas", "Ferenc", 29, "Knysna Syndrome Club", 150);
        Joueur albert = new Joueur("Albert", "Florian", 26, "Knysna Syndrome Club", 80);
        Joueur judas = new Joueur("Judas", "Iscariote", 31, "Les 12 Apôtres", 0);

        Equipe galactique = new Equipe("Knysna Syndrome Club");
        try {
            galactique.add(diStefano);
            galactique.add(puskas);
            galactique.add(albert);
            galactique.add(judas);
        } catch (EquipePleineException e) {
            System.out.println(e.getMessage());
        } catch (JoueurHorsClubEquipeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(galactique);

        for (int i = 0; i < 11; i++)
            try {
                galactique.add(albert);
            } catch (EquipePleineException e) {
                System.out.println(e.getMessage());
            } catch (JoueurHorsClubEquipeException e) {
                System.out.println(e.getMessage());
            }

        if (diStefano.getEquipe() != null)
            System.out.println(diStefano.getNom() + " appartient à l'équipe " + diStefano.getEquipe().getClub());
        else
            System.out.println(diStefano.getNom() + " n'appartient à aucune équipe!");

        if (judas.getEquipe() != null)
            System.out.println(judas.getNom() + " appartient à l'équipe " + judas.getEquipe().getClub());
        else
            System.out.println(judas.getNom() + " n'appartient à aucune équipe!");
    }
}
