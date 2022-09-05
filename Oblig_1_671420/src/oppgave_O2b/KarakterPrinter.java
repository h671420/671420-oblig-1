package oppgave_O2b;

import java.util.Scanner;

public class KarakterPrinter {
	public static void main(String[] args) {
		final int ANTALL_ELEVER = 10;
		String melding;
		String kar = "";
		boolean gyldigPoeng = true;
		int poeng;
		int i = 1;

		Scanner input = new Scanner(System.in);

		do {

			melding = "Hva er elev nr."+i+" sin poengsum?";
			System.out.print(melding);
			poeng = Integer.parseInt(input.nextLine());
			
			if (90 <= poeng && poeng <= 100) {
				kar = "A";
				gyldigPoeng = true;
			} else if (80 <= poeng && poeng <= 89) {
				kar = "B";
				gyldigPoeng = true;
			} else if (60 <= poeng && poeng <= 79) {
				kar = "C";
				gyldigPoeng = true;
			} else if (50 <= poeng && poeng <= 59) {
				kar = "D";
				gyldigPoeng = true;
			} else if (40 <= poeng && poeng <= 49) {
				kar = "E";
				gyldigPoeng = true;
			} else if (0 <= poeng && poeng <= 39) {
				kar = "F";
				gyldigPoeng = true;
			} else
				gyldigPoeng = false;

			if (gyldigPoeng)
				melding = "Elevens poengsum " + poeng + " gir karakter " + kar + ".\n";
			else if (!gyldigPoeng && i<10)
				melding = poeng + " er ikke en gyldig poengsum. Vi går videre.\n";
			else 
				melding = poeng + " er ikke en gyldig poengsum. Vi har ikke flere karakterer å printe, og programmet avsluttes.";
			System.out.println(melding);
			i++;
		} while (i <= ANTALL_ELEVER);
		input.close();
	}
}