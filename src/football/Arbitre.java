package football;

import football.exceptions.JoueurHorsEquipeException;
import tools.DegreExperience;

public class Arbitre extends Acteur {

    DegreExperience degreExperience;
    Partie partie;

    public Arbitre(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public Arbitre(String nom, String prenom, int age, DegreExperience degreExperience) {
        super(nom, prenom, age);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public double getSalaire() {
        switch (degreExperience) {
            case EXPERT:
                return 1;
            case CONFIRME:
                return 2;
            case DEBUTANT:
                return 3;
            default:
                return 0;
        }
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public void validerUnBut(Joueur joueur) {

    }

    public void expulsion(Joueur joueur) throws JoueurHorsEquipeException {
        if (joueur.getEquipe()==null) {
            throw new JoueurHorsEquipeException(joueur.getNom());
        }
    }
}
