package football.exceptions;

import football.Joueur;

public class JoueurHorsClubEquipeException extends Exception {
    private String nom;
    private String club1;
    private String club2;

    public JoueurHorsClubEquipeException(Joueur joueur, String club2) {
        this.nom = joueur.getNom();
        this.club1 = joueur.getClub();
        this.club2 = club2;
    }

    @Override
    public String getMessage() {
        return nom+" que viens tu faire dans notre �quipe? Tu ne fais pas partie de notre club! Ton club est " + club1 + " et le n�tre est " + club2 + ", va � Knysna si tu veux mais pas chez nous, sale tra�tre!";
    }
}
