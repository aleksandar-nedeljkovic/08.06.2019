package prvipaket;

import java.util.Scanner;

public class DomaciZadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata:");
		int n = sc.nextInt();

		int[] a = new int[n];
		boolean duplikat = false;
		
		System.out.println("Unesite elemente:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			duplikat = duplikati(a, a[i], i);
		}
		if (duplikat) {
			System.out.println("Postoji duplikat u nizu!");
		} else {
			System.out.println("Nema duplikata u nizu!");
		}
	}

	static boolean duplikati(int[] niz, int element, int broj) {
		for (int i = 0; i < niz.length; i++) {
			if (element == niz[i] && i != broj) {
				return true;
			}
		}
		return false;

	}

}
