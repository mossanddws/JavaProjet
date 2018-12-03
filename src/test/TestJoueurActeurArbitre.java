package test;

import java.util.List;
import java.util.ArrayList;

import tools.DegreExperience;
import football.*;

public class TestJoueurActeurArbitre {
    public static void main(String[] args) {
        Joueur diStefano = new Joueur("Di Stefano", "Alfredo", 32, "Knysna Syndrome Club", 200);
        Joueur puskas = new Joueur("Puskas", "Ferenc", 29, "Knysna Syndrome Club", 150);
        Joueur albert = new Joueur("Albert", "Florian", 26, "Knysna Syndrome Club", 80);

        List<Acteur> acteurs = new ArrayList<Acteur>();

        acteurs.add(diStefano);
        acteurs.add(puskas);
        acteurs.add(albert);

        Arbitre kivoitou = new Arbitre("Kivoitou", "Kantantou", 45, DegreExperience.EXPERT);

        acteurs.add(kivoitou);

        for (Acteur acteur : acteurs)
            System.out.println(acteur);
    }
}

