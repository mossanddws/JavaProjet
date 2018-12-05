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

    public void add(Joueur joueur) throws EquipePleineException, JoueurHorsClubEquipeException {
        if (joueurs.size() < 11) {
            joueurs.add(joueur);
        } else {
            throw new EquipePleineException();
        }
        if (joueur.getClub() != this.club) {
            throw new JoueurHorsClubEquipeException(joueur.getClub(), this.club);
        }
    }
}
