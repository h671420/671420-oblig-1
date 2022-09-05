package oppgave_O3;

import java.util.Scanner;

public class FakultetPrinter {

	public static void main(String[] args) {
		String melding;
		String nTxt;
		int n = 0;
		int forsøk = 3;
		boolean gyldigInput = true;

// Kode ned til neste kommentar tar en string fra bruker og sjekker at den kan konverteres til 
// et heltall >0. 
// Programmet funker når n<=20, men gir feil output over når n>20 da n! vil overstig Long.MAX_VALUE. 
// Jeg informerer bruker om begrensningen uten å løse selve problemet i koden min.

		Scanner input = new Scanner(System.in);

		melding = "Vennligst skriv inn et heltall mellon 1 og 20 som vi skal finne fakultet av." + "\nDu har " + forsøk
				+ " forsoek igjen.";
		System.out.println(melding);
		nTxt = input.nextLine();
		forsøk--;

		if (nTxt.equals("0") || !nTxt.matches("[0-9]+"))
			gyldigInput = false;
		else
			gyldigInput = true;

		while (!gyldigInput && forsøk >= 1) {
			melding = "\n" + nTxt + " er ikke en gyldig input.\n"
					+ "Vennligst skriv inn et heltall mellon 1 og 20 som vi skal finne fakultet av." + "\nDu har "
					+ forsøk + " forsoek igjen.";
			System.out.println(melding);
			nTxt = input.nextLine();
			if (nTxt.equals("0") || !nTxt.matches("[0-9]+"))
				gyldigInput = false;
			else
				gyldigInput = true;
			forsøk--;
		}
		input.close();

// Kode nedenfor her informerer bruker om at programet er avsluttet fordi input var ubrukelig,.
// ellers returneres n! korrekt (gitt at n<=20 som nevnt).

		if (!gyldigInput)
			melding = "\nProgrammet avsluttes pga gjentatte innmatingsfeil.";
		else {
			n = Integer.parseInt(nTxt);
			long fn = 1;
			while (n > 1) {
				fn = fn * n;
				n--;
			}
			melding = "\nFakultetet av " + nTxt + " er " + fn + ".";
		}
		System.out.println(melding);
	}
}

//Håper jeg virkelig!