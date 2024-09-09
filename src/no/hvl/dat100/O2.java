/*
 * Innlevering h679172
 * 
 * Oppgave O2 - Karakterskala
 * 
 */

package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {
	static int studenter = 10; // Hvor mange studenter er det?
	static char[] array = new char[studenter];
	static int teller = 0;
	public static void main(String[] args) {
		while (teller < studenter) {
			String prisTxt = showInputDialog("Skriv inn poengsummen på " + studenter + " elever. Elev nr. " + (teller+1));
			int poeng = parseInt(prisTxt);
			regnUtKarakter(poeng); // Omgjør poengsummen til karakter.
		}
		System.out.println(makeString()); // Skriver ut alle karakterene.
	}
	private static void regnUtKarakter(int poeng) {
		char karakter = 0;
		int A = 100;
		int B = 89;
		int C = 79;
		int D = 59;
		int E = 49;
		int F = 39;
		if (poeng > A || poeng <= 0) {
			System.out.println("Ugyldig verdi!\nLes inn verdi på nytt.");
		} else {
			if (poeng > F) {
				karakter = 'E';
				if (poeng > E) {
					karakter = 'D';
					if (poeng > D) {
						karakter = 'C';
						if (poeng > C) {
							karakter = 'B';
							if (poeng > B) {
								karakter = 'A';
							}
						}
					}
				}
			} else { karakter = 'F'; }
			array[teller] = karakter;
			teller++;
		}
	}
	private static String makeString() {
		String karakterer = "";	
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				karakterer = array[i] + ", ";
			} else if (i == (studenter - 1)) {
				karakterer = karakterer + array[i];
			} else {
				karakterer = karakterer + array[i] + ", ";
			}
		}
		return ("Karakterene er: " + karakterer);
	}
}
