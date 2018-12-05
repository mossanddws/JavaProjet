package football.exceptions;

public class JoueurHorsClubEquipeException extends Exception {
    private String club1;
    private String club2;

    public JoueurHorsClubEquipeException(String club1, String club2) {
        this.club1 = club1;
        this.club2 = club2;
    }

    @Override
    public String getMessage() {
        return "JJudas que viens tu faire dans notre équipe? Tu ne fais pas partie de notre club! Ton club est " + club1 + " et le nôtre est " + club2 + ", va à Knysna si tu veux mais pas chez nous, sale traître!";
    }
}
