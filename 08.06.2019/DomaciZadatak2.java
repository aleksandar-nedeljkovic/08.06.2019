package prvipaket;

import java.util.Scanner;
import java.util.Random;

public class DomaciZadatak2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj elemenata:");
		int n = ulaz.nextInt();

		System.out.println("Definisite gornju granicu:");
		int gornjagranica = ulaz.nextInt();
		int[] a = random(n, gornjagranica);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Unesite broj:");
		int broj = ulaz.nextInt();

		boolean rezultat = nadjibroj(broj, a);
		if (rezultat) {
			System.out.println("Broj postoji u nizu!");
		} else {
			System.out.println("Broj ne postoji u nizu!");
		}

	}

	static int[] random(int n, int gornjagranica) {
		int[] b = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {

			b[i] = rand.nextInt(gornjagranica);

		}
		return b;
	}

	static boolean nadjibroj(int broj, int[] n) {
		for (int i = 0; i < n.length; i++) {
			if (broj == n[i]) {
				return true;
			}
		}
		return false;

	}

}
