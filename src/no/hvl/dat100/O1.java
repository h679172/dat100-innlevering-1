/*
 * Innlevering h679172
 * 
 * Oppgave O1 - Trinnskatt
 * 
 */

package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

		public static void main(String[] args) {	
			String belopTxt = showInputDialog("Skriv inn beløpet:");
			int i = parseInt(belopTxt);
			System.out.println(utRekningSkatt(i));
			
		}
		public static String utRekningSkatt(int i) {
			int trinn = 0;
			double trinnskatt = 0.0;
			
			int trinn1 = 208051;
			int trinn2 = 292851;
			int trinn3 = 670001;
			int trinn4 = 937901;
			int trinn5 = 1350001;
			
			if (i > trinn1 && i < trinn2) {
				trinn = 1;
				trinnskatt = 1.7;
			} else if (i > trinn2 && i < trinn3) {
				trinn = 2;
				trinnskatt = 4.0;
			} else if (i > trinn3 && i < trinn4) {
				trinn = 3;
				trinnskatt = 13.6;
			} else if (i > trinn4 && i < trinn5) {
				trinn = 4;
				trinnskatt = 16.6;
			} else if (i > trinn5) {
				trinn = 5;
				trinnskatt = 17.6;
			}
			double betBelop = (i / 100) * trinnskatt;
			return ("Dette tilsvarer trinn " + trinn + ", og betyr at du må betale: " + trinnskatt + "% trinnskatt, " + "d.v.s at du må betale kr " + (int)betBelop + ",- i skatt");
		}
	}