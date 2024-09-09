
/*
 * Innlevering h679172
 * 
 * Oppgave O3 - Fakultet
 * 
 */

package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	static int teller = 0;
	public static void main(String[] args) {
		String nTxt = showInputDialog("Les inn et heltall n > 0");
		int n = parseInt(nTxt);
		if (n <= 0) {
			System.out.println("Ugyldig verdi!\nn må være høyere enn 0.");
		} else {
			int svar = nFakultet(n);
			System.out.println(makeString(svar, n));
		}
	}
	public static int nFakultet(int n) {
		int svar = 1;
		for (int i = 1; i <= n; i++) {
			svar = svar * i;
			teller++;
		}
		return svar;
	}
	public static int utRekning(int svar, int n) {
		return svar * (n - 1) * n;
	}
	public static String makeString(int svar, int n) {
		String utTxt = null;
		for (int i = 0; i <= teller; i++ ) {
			if (i == 0) {
				utTxt = "";
			} else if (i == 1) {
				utTxt = "1";
			} else {
				utTxt = utTxt + "*" + i;
			}
		}
		return ("!n = (" + utTxt + ") = " + svar + "\n((" + utTxt +  ") * (n-1) * n) er: " + utRekning(svar, n));
	}
}
