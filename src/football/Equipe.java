package football;


import football.exceptions.EquipePleineException;
import football.exceptions.JoueurHorsClubEquipeException;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    public final int NOMBREJOUEURS = 11;
    private String club;
    List<Acteur> acteurs;

    public Equipe(String club) {
        this.club = club;
        acteurs = new ArrayList<>();
    }

    public String getClub() {
        return club;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "club='" + club + '\'' +
                ", acteurs=" + acteurs +
                '}';
    }

    public void add(Joueur joueur) throws EquipePleineException, JoueurHorsClubEquipeException {
        if (acteurs.size() < 11) {
            acteurs.add(joueur);
        } else {
            throw new EquipePleineException();
        }
        if (joueur.getClub() != this.club) {
            throw new JoueurHorsClubEquipeException(joueur.getClub(), this.club);
        }
    }
}
