package prvipaket;

import java.util.Scanner;

public class DomaciZadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata:");
		int n = sc.nextInt();

		int[] a = new int[n];
		
		System.out.println("Unesite elemente:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		double srednjavrednost = srednjavrednostniza(a);
		System.out.printf("Brojevi veci od srednje vrednosti %.1f su:\n", srednjavrednost);
		for (int i = 0; i < a.length; i++) {
			if (a[i] > srednjavrednost) {
				System.out.print(a[i] + " ");
				
			}
		}
		System.out.println();
		int najblizibroj = najblizibroj(a, srednjavrednost);
		System.out.println("Najblizi broj srednjoj vrednosti je: ");
		System.out.println(a[najblizibroj]);
	}

	static double srednjavrednostniza(int[] niz) {
		double zbir = 0;
		for (int i = 0; i < niz.length; i++) {
			zbir += niz[i];
		}
		double srednjavrednost = zbir / niz.length;

		return srednjavrednost;
	}

	static int najblizibroj(int[] niz, double srednjavrednost) {
		double razlika;
		if (niz[0] < srednjavrednost) {
			razlika = srednjavrednost - niz[0];
		} else {
			razlika = niz[0] - srednjavrednost;
		}

		double temp = razlika;
		int broj = 0;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < srednjavrednost) {
				razlika = srednjavrednost - niz[i];
			} else {
				razlika = niz[i] - srednjavrednost;
			}
			if (razlika < temp) {
				temp = razlika;
				broj = i;
			}

		}
		return broj;

	}

}
