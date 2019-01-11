package football;

import java.util.Arrays;

public class Partie {

    Equipe[] equipes;
    Arbitre arbitre;
    int[] score;

    public Partie(Equipe equipe1, Equipe equipe2, Arbitre arbitre) {
        equipes = new Equipe[]{equipe1, equipe2};
        this.arbitre = arbitre;
        arbitre.setPartie(this);
        score = new int[]{0, 0};
    }

    public Equipe[] getEquipes() {
        return equipes;
    }

    public void setEquipes(Equipe[] equipes) {
        this.equipes = equipes;
    }

    public Arbitre getArbitre() {
        return arbitre;
    }

    public void setArbitre(Arbitre arbitre) {
        this.arbitre = arbitre;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Partie{" +
                "equipes=" + Arrays.toString(equipes) +
                ", arbitre=" + arbitre +
                ", score=" + Arrays.toString(score) +
                '}';
    }
}
