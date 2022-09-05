package oppgave_O2c;

import java.util.Scanner;


public class KarakterPrinter {
	public static void main(String[] args) {
		String melding = "";
		String kar = "";
		int poeng = 0;	
		final int antallElever = 10;
		Scanner input = new Scanner(System.in);
		boolean gyldigPoeng = true;
		boolean stoppKjøring = false;
		for (int i = 1; i <= antallElever && !stoppKjøring; i++) {
			melding = "Hva er elev nr." + i + " sin poengsum?";
			System.out.print(melding);
			poeng = Integer.parseInt(input.nextLine());
			if (poeng < 0 || poeng > 100) {
				gyldigPoeng = false;

				stoppKjøring = true;
				for (int j = 2; j >= 1 && !gyldigPoeng; j--) {
					melding = "Feil innmating av data, vennligst prøv på nytt.\n" + "Du har " + j + " forsøk igjen.\n\n"
							+ "Hva er elev nr." + i + " sin poengsum?";
					System.out.print(melding);
					poeng = Integer.parseInt(input.nextLine());
					if (poeng >= 0 && poeng <= 100) {
						gyldigPoeng = true;
						stoppKjøring = false;
					}
				}
			}
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
			}
			if (stoppKjøring)
				melding = "Programmet ble avluttet pga gjentatte innmatingsfeil.";
			else
				melding = "Elev nr." + i + " sin poengsum " + poeng + " gir karakter " + kar + ".\n";
			System.out.println(melding);
		}
		input.close();
	}
}
