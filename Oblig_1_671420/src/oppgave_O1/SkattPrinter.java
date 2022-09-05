package oppgave_O1;

import javax.swing.JOptionPane;

public class SkattPrinter {

	public static void main(String[] args) {
		String melding = "Hva er bruttoinntekten din?";
		String bruttoTxt = JOptionPane.showInputDialog(melding);
		boolean okInput = bruttoTxt.matches("[0-9]+");
		for (int i = 2; !okInput && i >= 1; i--) {
			melding = "Du har tastet inn en ugyldig bruttoinntekt." + "\n"
					+ "Vennligst tast inn ett positivt heltall bestående av siffer 0-9.\n Du har " 
					+ i + " forsøk igjen.";
			bruttoTxt = JOptionPane.showInputDialog(melding);
			okInput = bruttoTxt.matches("[0-9]+");
		}

		int brutto = 0;
		int skatteklasse = 0;
		double sats = 0;

		if (!okInput)
			JOptionPane.showMessageDialog(null, "Program avsluttes pga gjentatte innmatingsfeil.");
		else {
			brutto = Integer.parseInt(bruttoTxt);
			if (brutto >= 190350 && brutto <= 267899) {
				skatteklasse = 1;
				sats = 0.017;
			} else if (brutto >= 267900 && brutto <= 643799) {
				skatteklasse = 2;
				sats = 0.04;
			} else if (brutto >= 643800 && brutto <= 969199) {
				skatteklasse = 3;
				sats = 0.134;
			} else if (brutto >= 969200 && brutto <= 1999999) {
				skatteklasse = 4;
				sats = 0.164;
			}
			else if (brutto >= 2000000) {
				skatteklasse = 5;
				sats = 0.174;
			}
			if (skatteklasse != 0)
				melding = "En bruttoinntekt på kr." + brutto 
						+ " plasserer deg i skatteklasse " + skatteklasse
						+ " og medfører en trinnskattsats på " + sats * 100 + "%." + "\n"
						+ "Din trinnskatt blir da kr." + (int) (brutto * sats) 
						+ ", og din nettoutbetaling blir kr."
						+ (int) (brutto - brutto * sats);
			else 
				melding = "En bruttoinntekt på kr." + brutto 
						+ " plasserer deg i skatteklasse " + skatteklasse
						+" og du fritas fra trinnskatt.";
			JOptionPane.showMessageDialog(null, melding);
			;
		}

	}
}
