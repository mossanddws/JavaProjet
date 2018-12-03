//package football;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import tools.DegreExperience;
//import football.*;
//import football.exceptions.EquipePleineException;
//import football.exceptions.JoueurHorsClubEquipeException;
//import football.exceptions.JoueurHorsEquipeException;
//
//
//public class TestPartie {
//	public static void main(String [] args)
//	{
//		Joueur diStefano = new Joueur("Di Stefano", "Alfredo", 32, "Knysna Syndrome Club", 200);
//		Joueur puskas = new Joueur("Puskas", "Ferenc", 29, "Knysna Syndrome Club", 150);
//		Joueur albert = new Joueur("Albert", "Florian", 26, "Knysna Syndrome Club", 80);
//		Joueur judas = new Joueur("Judas", "Iscariote", 31, "Les 12 Ap�tres",0);
//
//		Equipe galactique = new Equipe("Knysna Syndrome Club");
//
//		try {
//			galactique.add(diStefano);
//			galactique.add(puskas);
//			galactique.add(albert);
//			galactique.add(judas);
//		} catch (EquipePleineException e) {
//			System.out.println(e.getMessage());
//		} catch (JoueurHorsClubEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//
//		Joueur diStefanoBis = new Joueur("Di Stefano Bis", "Alfredo", 32, "Knysna Bis Syndrome Club", 200);
//		Joueur puskasBis = new Joueur("Puskas Bis", "Ferenc", 29, "Knysna Bis Syndrome Club", 150);
//		Joueur albertBis = new Joueur("Albert Bis", "Florian", 26, "Knysna Bis Syndrome Club", 80);
//		Joueur judasBis = new Joueur("Judas Bis", "Iscariote", 31, "Les 12 Ap�tres",0);
//
//		Equipe galactiqueBis = new Equipe("Knysna Bis Syndrome Club");
//
//		try {
//			galactiqueBis.add(diStefano);
//		} catch (EquipePleineException e) {
//			System.out.println(e.getMessage());
//		} catch (JoueurHorsClubEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			galactiqueBis.add(diStefanoBis);
//		} catch (EquipePleineException e) {
//			System.out.println(e.getMessage());
//		} catch (JoueurHorsClubEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			galactiqueBis.add(puskasBis);
//		} catch (EquipePleineException e) {
//			System.out.println(e.getMessage());
//		} catch (JoueurHorsClubEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			galactiqueBis.add(albertBis);
//		} catch (EquipePleineException e) {
//			System.out.println(e.getMessage());
//		} catch (JoueurHorsClubEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//
//		Arbitre kivoitou = new Arbitre("Kivoitou", "Kantantou", 45, DegreExperience.EXPERT);
//
//		Partie finalCup = new Partie(galactique, galactiqueBis, kivoitou);
//
//		puskas.marquerUnBut(finalCup);
//		diStefano.marquerUnBut(finalCup);
//		albertBis.marquerUnBut(finalCup);
//
//		kivoitou.validerUnBut(puskas);
//
//		System.out.println(finalCup);
//
//		try {
//			kivoitou.expulsion(puskas);
//			System.out.println("Expulsion de " + puskas.getNom());
//		} catch (JoueurHorsEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			kivoitou.expulsion(puskas);
//		} catch (JoueurHorsEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//
//		Joueur tartempion = new Joueur("Tartempion", "Toto", 12, "Little Chicken Club", 2);
//		try {
//			kivoitou.expulsion(tartempion);
//		} catch (JoueurHorsEquipeException e) {
//			System.out.println(e.getMessage());
//		}
//
//		System.out.println(galactique);
//
//		puskas.marquerUnBut(finalCup);
//		tartempion.marquerUnBut(finalCup);
//		System.out.println(finalCup);
//
//	}
//}
