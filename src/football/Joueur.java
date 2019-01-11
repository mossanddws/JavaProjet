package football;

import java.util.Objects;

public class Joueur extends Acteur {

    String club;
    double euroMillons;
    private Equipe equipe;
    private final double salaire;

    public Joueur(String nom, String prenom, int age, double euroMillons) {
        super(nom, prenom, age);
        this.euroMillons = euroMillons;
        this.club = "Football Syndrome Club";
        salaire = Math.random() * euroMillons * 1000000;
    }

    public Joueur(String nom, String prenom, int age, String club, double euroMillons) {
        this(nom, prenom, age, euroMillons);
        this.club = club;
    }

    @Override
    public double getSalaire() {
        return salaire;
    }

    public String getClub() {
        return club;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        if (equipe != null) {
            this.equipe = new Equipe(equipe.getClub());
        } else {
            this.equipe = new Equipe("");
        }
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", age=" + getAge() + '\'' +
                ", club='" + club + '\'' +
                ", equipe(club)='" + equipe.getClub() + '\'' +
                ", euroMillons=" + euroMillons + '\'' +
                ", salaire=" + getSalaire() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Joueur joueur = (Joueur) o;
        return Double.compare(joueur.euroMillons, euroMillons) == 0 &&
                Objects.equals(club, joueur.club);
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), club, euroMillons);
    }

    public void marquerUnBut(Partie partie) {
        /*if (this.equipe.getClub() == partie.equipes[0].getClub()) {
            partie.score[0]++;
        }
        if (this.equipe.getClub() == partie.equipes[1].getClub()) {
            partie.score[1]++;
        }*/
    }

}
