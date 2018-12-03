package football;

import java.util.Objects;

public class Joueur extends Acteur {

    String club;
    double euroMillons;

    public Joueur(String nom, String prenom, int age, double euroMillons) {
        super(nom, prenom, age);
        this.euroMillons = euroMillons;
        this.club = "Football Syndrome Club";
    }

    public Joueur(String nom, String prenom, int age, String club, double euroMillons) {
        this(nom, prenom, age, euroMillons);
        this.club = club;
    }

    @Override
    public double getSalaire() {
        return Math.random() * euroMillons;
    }

    public String getClub() {
        return club;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", age=" + getAge() + '\'' +
                ", club='" + club + '\'' +
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
    public int hashCode() {
        return Objects.hash(super.hashCode(), club, euroMillons);
    }
}
