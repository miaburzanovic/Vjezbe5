package com.studyopedia;

import java.util.Scanner;

public class VjezbePeta {

	// Drugi zadatak
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica=sc.nextLine().trim();
		StringBuilder sb= new StringBuilder(recenica);
		String obrnuto = sb.reverse().toString();
		if(recenica.equalsIgnoreCase(obrnuto)) {
			System.out.println("Jeste palindrom");
		}
		else {
			System.out.println("Nije palindrom");
		}
	}
	*/
	
	
	 // Odredite broj samoglasnika i suglasnika u odredjenoj recenici
/*	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica=sc.nextLine();
		String samoglasnici = "aeiouAEIOU";
		int brojSamoglasnika=0;
		int suglasnici=0;
		for (int i=0; i<recenica.length(); i++) {
			char c = recenica.charAt(i);
			if(Character.isLetter(c)) {
				if(samoglasnici.indexOf(c)!=-1) {
					brojSamoglasnika+=1;
				}
				else {
					suglasnici=suglasnici+1;
				}
			}
			
			
		}
		System.out.println("Ukupan broj samoglasnika je: " +brojSamoglasnika);
		System.out.println("Ukupan broj suglasnika je: " +suglasnici);
	}
	*/
	
	// Pronadji koja se to slova ponavljajju
	
	/*
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica=sc.nextLine();
		for (int i=0; i<recenica.length()-1;i++) {
			char c= recenica.charAt(i);
			char c1=recenica.charAt(i+1);
			if(c==c1) {
				System.out.println("Slovo koje se ponavlja je "+c);	
			}
		}
		
	}
	*/
	/*
	
	// Za dva unijeta stringa provjeriti da li je drugi podtekst prvog
	// Za ovaj kod je potrebno i da se trimuje
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica=sc.nextLine();
		System.out.println("Unesite drugu recenicu");
		String recenica2=sc.nextLine();
		if(recenica.contains(recenica2.trim())) {
			System.out.println("Druga recenica jeste podtekst prve");
		}
		else {
			System.out.println("Druga recenica nije podtekst prve");
		}
	}
	*/
	
	// Vjezbe V
	
	// Kreirati StringBuilder  sa sadrzajem "programiranje". Obrisati od 3. do 6. indeksa
	/*
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("programiranje");
		sb.delete(3, 7);
		System.out.println(sb);
		
	}
	*/
	
	// Napisati program kojim se ucitava recenica. Stampati recenicu sa obrnutim redosljedom karaktera u rijecima
	/*
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica = unos.nextLine();
		String[] rijeci=recenica.split(" ");
		StringBuilder novi= new StringBuilder;
		for(int i0;i<rijeci.length;i++){
		StringBuilder sb = new StringBuilder(rijeci[1]);
		novi.append(sb.reverse());
		}
		System.out.println(novi.toString());
	}
	*/
	
	// Dat je string sastavljen od karaktera 0 i 1. Karakter 0 predstavlja slobodno polje, a 1 predstavlja zauzeto polje. Vas zadatak je da za zadatu
	// poziciju u stringu provjerite da li su susjedna polja slobodna.
	/*
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string sastavljen od 0 i 1");
		String polje = unos.nextLine();
		System.out.println("Unesite poziciju koju provjeravate");
		int pozicija = unos.nextInt();
		if( pozicija == 0) {
			if(polje.charAt(1)=='0') {
				System.out.println("Susjedno polje je slobodno");
			}
			else{
			System.out,println("Susjedno polje nije slobodno");
		}
		else if(pozicija==polje.length()-1) {
			if(polje.charAt(polje.length()-2)=='0') {
				System.out.println("Susjedno polje je slobodno");
			}
		}
		else {
			int lijevo=pozicija-1;
			int desno=pozicija+1;
			if(polje.charAt(lijevo)=='0' && polje.charAt(desno)=='0') {
				System.out.println("Susjedna polja su slobodno");
			}
		}
	}
	 */
	
	
	// Napisati program koji za unijeti string s (karakteri stringa od 0 do 9)
	// enkriptuje sve na sledeci nacin: ako je karakter paran broj pretvara ga u 0, a ako je karakter neparan broj pretvara ga u 1
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string");
		String s = unos.nextLine();
		StringBuilder novi= new StringBuilder();
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)-'0')%2==0) {
				novi.append('0');
			}
			else if((s.charAt(i)-'0')%2!=0) {
				novi.append('1');
			}	
			else {
				novi.append('0');
			}

		}
		System.out.println(novi);
	}
}
