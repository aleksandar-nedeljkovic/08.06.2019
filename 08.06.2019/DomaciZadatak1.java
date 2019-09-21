package prvipaket;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza:");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int broj;
		System.out.println("Unesite broj:");
		broj = sc.nextInt();

		boolean tacno = broj(a, broj);
		if (tacno) {
			System.out.println("Broj postoji u nizu!");
		} else {
			System.out.println("Broj ne postoji u nizu!");
		}

	}

	static boolean broj(int[] niz, int broj) {
		for (int i = 0; i < niz.length; i++) {
			if (broj == niz[i])
				return true;
		}
		return false;

	}

}
