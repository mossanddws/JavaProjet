package football;

import java.util.Arrays;

public class Partie {

    Equipe[] equipes;
    Arbitre arbitre;
    int[] score;

    public Partie(Equipe equipe1, Equipe equipe2, Arbitre arbitre) {
        equipes = new Equipe[]{equipe1, equipe2};
        this.arbitre = arbitre;
        score = new int[]{0, 0};
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
