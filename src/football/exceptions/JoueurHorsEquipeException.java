package football.exceptions;

public class JoueurHorsEquipeException extends Exception {

    private String nom;

    public JoueurHorsEquipeException(String nom) {
        this.nom = nom;
    }

    @Override
    public String getMessage() {
        return nom + "ne fait pas partie de l'équipe!";
    }
}
