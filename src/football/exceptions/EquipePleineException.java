package football.exceptions;

public class EquipePleineException extends Exception {
    public EquipePleineException() {
    }

    @Override
    public String getMessage() {
        return "Les 12 ap�tres ne jouaient pas au football!";
    }
}
