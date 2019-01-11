package football;

import football.exceptions.JoueurHorsEquipeException;
import tools.DegreExperience;

public class Arbitre extends Acteur {

    DegreExperience degreExperience;
    Partie partie;
    private final double salaire;

    public Arbitre(String nom, String prenom, int age, DegreExperience degreExperience) {
        super(nom, prenom, age);
        this.degreExperience = degreExperience;
        double result;
        switch (this.degreExperience) {
            case EXPERT:
                result = Math.random() * 0.1 * 100000 * 1;
                break;
            case CONFIRME:
                result = Math.random() * 0.1 * 100000 * 2;
                break;
            case DEBUTANT:
                result = Math.random() * 0.1 * 100000 * 3;
                break;
            default:
                result = 0;
                break;
        }
        salaire = result;
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }

    @Override
    public double getSalaire() {
        return salaire;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public void validerUnBut(Joueur joueur) {
        if (joueur.getEquipe().getClub() == this.partie.equipes[0].getClub()) {
            partie.score[0]++;
        }
        if (joueur.getEquipe().getClub() == this.partie.equipes[1].getClub()) {
            partie.score[1]++;
        }
    }

    public void expulsion(Joueur joueur) throws JoueurHorsEquipeException {
        if (joueur.getEquipe() == null || joueur.getEquipe().getClub() == "") {
            throw new JoueurHorsEquipeException(joueur.getNom());
        } else {
            joueur.setEquipe(null);
        }
    }
}
