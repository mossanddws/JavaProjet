package football;

import football.exceptions.EquipePleineException;
import football.exceptions.JoueurHorsClubEquipeException;

import java.util.Set;
import java.util.TreeSet;

public class Equipe {
    public final int NOMBREJOUEURS = 11;
    private String club;
    Set<Joueur> joueurs;

    public Equipe(String club) {
        this.club = club;
        joueurs = new TreeSet<>();
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClub() {
        return club;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "club='" + club + '\'' +
                ", joueurs=" + joueurs +
                '}';
    }

    public Set<Joueur> getJoueurs() {
        return joueurs;
    }

    public void add(Joueur joueur) throws EquipePleineException, JoueurHorsClubEquipeException {
        if (joueur.getClub() != this.club) {
            throw new JoueurHorsClubEquipeException(joueur, this.club);
        }
        if (joueurs.size() < 11) {
            joueurs.add(joueur);
            joueur.setEquipe(this);
        } else {
            throw new EquipePleineException();
        }
    }
}
