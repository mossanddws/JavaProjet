package tests;

import football.*;
import football.exceptions.*;
import tools.*;

import java.util.Set;
import java.util.TreeSet;

public class TestComparaisonSalaires {
    public static void main(String[] args) {
        Joueur diStefano = new Joueur("Di Stefano", "Alfredo", 32, "Knysna Syndrome Club", 200);
        Joueur puskas = new Joueur("Puskas", "Ferenc", 29, "Knysna Syndrome Club", 150);
        Joueur albert = new Joueur("Albert", "Florian", 26, "Knysna Syndrome Club", 80);

        Equipe galactique = new Equipe("Knysna Syndrome Club");

        try {
            galactique.add(diStefano);
            galactique.add(puskas);
            galactique.add(albert);
        } catch (EquipePleineException e) {
            System.out.println(e.getMessage());
        } catch (JoueurHorsClubEquipeException e) {
            System.out.println(e.getMessage());
        }

        Joueur diStefanoBis = new Joueur("Di Stefano Bis", "Alfredo", 32, "Knysna Bis Syndrome Club", 200);
        Joueur puskasBis = new Joueur("Puskas Bis", "Ferenc", 29, "Knysna Bis Syndrome Club", 150);
        Joueur albertBis = new Joueur("Albert Bis", "Florian", 26, "Knysna Bis Syndrome Club", 80);

        Equipe galactiqueBis = new Equipe("Knysna Bis Syndrome Club");

        try {
            galactiqueBis.add(diStefanoBis);
            galactiqueBis.add(puskasBis);
            galactiqueBis.add(albertBis);
        } catch (EquipePleineException e) {
            System.out.println(e.getMessage());
        } catch (JoueurHorsClubEquipeException e) {
            System.out.println(e.getMessage());
        }

        Arbitre kivoitou = new Arbitre("Kivoitou", "Kantantou", 45, DegreExperience.EXPERT);

        Partie finalCup = new Partie(galactique, galactiqueBis, kivoitou);

        Set<Acteur> tous = new TreeSet<>();
        for (Joueur joueur : finalCup.getEquipes()[0].getJoueurs()) {
            tous.add(joueur);
        }
        for (Joueur joueur : finalCup.getEquipes()[1].getJoueurs()) {
            tous.add(joueur);
        }
        tous.add(finalCup.getArbitre());

        for (Acteur acteur : tous) {
            System.out.println(acteur.getPrenom()+" "+acteur.getNom()+" "+acteur.getSalaire());
        }

    }
}
