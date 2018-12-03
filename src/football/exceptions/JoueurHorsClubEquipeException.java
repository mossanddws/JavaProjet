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
        return "Judas that do you come to our team? You are not part of our club! Your club is " + club1 + " and ours is " + club2 + ", go to Knysna if you want but not at we, dirty traitor! ";
    }
}
