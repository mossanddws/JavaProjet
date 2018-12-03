package football;

import tools.DegreExperience;

public class Arbitre extends Acteur {

    DegreExperience degreExperience;

    public Arbitre(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public Arbitre(String nom, String prenom, int age, DegreExperience degreExperience) {
        super(nom, prenom, age);
    }

    @Override
    public double getSalaire() {
        degreExperience = DegreExperience.CONFIRME;
        return 0;
    }
}
