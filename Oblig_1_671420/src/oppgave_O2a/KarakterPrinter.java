package oppgave_O2a;

import java.util.Scanner;

public class KarakterPrinter {
	public static void main(String[] args) {
		String melding;
		String kar = "";
		boolean gyldigPoeng = true;
		int poeng;

		Scanner input = new Scanner(System.in);

		melding = "Hva er elevens poengsum?";
		System.out.print(melding);
		poeng = Integer.parseInt(input.nextLine());
		input.close();

		if (90 <= poeng && poeng <= 100) {
			kar = "A";
		} else if (80 <= poeng && poeng <= 89) {
			kar = "B";
		} else if (60 <= poeng && poeng <= 79) {
			kar = "C";
		} else if (50 <= poeng && poeng <= 59) {
			kar = "D";
		} else if (40 <= poeng && poeng <= 49) {
			kar = "E";
		} else if (0 <= poeng && poeng <= 39) {
			kar = "F";
		} else
			gyldigPoeng = false;

		if (gyldigPoeng)
			melding = "Elevens poengsum " + poeng + " gir karakter " + kar + ".\n";
		else
			melding = poeng + " er ikke en gyldig poengsum";
		System.out.println(melding);
	}
}