package football;

import java.util.Objects;

public abstract class Acteur {
    private final String nom;
    private final String prenom;
    private int age;

    public Acteur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double getSalaire();

    @Override
    public String toString() {
        return "Acteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", salaire=" + getSalaire() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acteur acteur = (Acteur) o;
        return age == acteur.age &&
                Objects.equals(nom, acteur.nom) &&
                Objects.equals(prenom, acteur.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, age);
    }
}
