package com.studyopedia;
import java.util.Scanner;


public class Vjezbanje1 {

	public static void main(String[] args) {
		// Zadaci za vjezbanje
		
		// Zadatak broj 16
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cijenu prvog proizvoda");
		int a = unos.nextInt();
		System.out.println("Unesite cijenu drugog proizvoda");
		int b = unos.nextInt();
		System.out.println("Unesite cijenu treceg proizvoda");
		int c = unos.nextInt();
		int zbir=1, max1=1, max2=1;
		if (a>=c && b>=c) {
			zbir = a+b;
			max1=a;
			max2=b;
		}
		else if (a>=b && c>=b) {
			zbir = a+c;
			max1 = a;
			max2 = c;
		}
		else if (b>=a && c>=a) {
			zbir = b+c;
			max1 =b;
			max2 =c;
		}
		System.out.println("Par cijena " +max1+" i " +max2+" daje u zbiru najvecu vrijednost od "+zbir);
		*/
		
		// Zadatak broj 17
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite godinu");
		int godina = unos.nextInt();
		if(godina%100==0 && godina%400==0 || godina%4==0) {
			System.out.println("Godina "+godina+" je prestupna godina");
		}
		else {
			System.out.println("Godina "+godina+" nije prestupna godina");
		}
		*/
		
		// Zadatak broj 18
		/*
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite koordinatu x gornjeg lijevog tjemena");
		int x1 = unos.nextInt();
		System.out.println("Unesite koordinatu y gornjeg lijevog tjemena");
		int y1 = unos.nextInt();
		System.out.println("Unesite koordinatu x donjeg desnog tjemena");
		int x2 = unos.nextInt();
		System.out.println("Unesite koordinatu y donjeg desnog tjemena");
		int y2 = unos.nextInt();
		System.out.println("Unesite koordinate tacke koju provjeravate");
		int x3 = unos.nextInt();
		int y3 = unos.nextInt();
		if (x3>x1 && x3<x2 && y3>y2 && y3<y1) {
			System.out.println("Tacka se nalazi unutar pravougaonika");
		}
		else {
			System.out.println("Tacka se ne nalazi unutar pravougaonika");
		}
		*/
		
		// Zadatak broj 19
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite duzinu pravougaonika");
		int a = unos.nextInt();
		System.out.println("Unesite sirinu pravougaonika");
		int b = unos.nextInt();
		int povrsina = a*b;
		int povrsinakv = a*a;
		if(povrsina/povrsinakv>=2) {
			System.out.println("Moguce je napraviti bar dva kvadrata");
		}
		else {
			System.out.println("Nije moguce napraviti dva kvadrata");
		}
		*/
		
		// Zadatak broj 20
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite temperaturu vode");
		int temp = unos.nextInt();
		if (temp>0 && temp<100) {
			System.out.println("Tecno");
		}
		else if(temp == 0) {
			System.out.println("Cvrsto");
		}
		else if(temp==100) {
			System.out.println("Gasovito");
		}
		else if(temp<0) {
			System.out.println("Cvrsto");
		}
		else {
			System.out.println("Gasovito");
		}
		*/
		
		// Zadatak broj 21
		/*
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj");
		int broj = unos.nextInt();
		if(broj<1) {
			System.out.println("Broj nije prost");
		}
		else {
			boolean provjera=true;
			for(int i=2;i<broj;i++) {
				if(broj%i==0) {
					provjera=false;
				}
				if(provjera==false) {
					break;
				}
				
			}
		if(provjera==true) {
			System.out.println("Dati broj je prost");
		}
		else {
			System.out.println("Dati broj nije prost");
		}
		}
		*/
		
		// Zadatak broj 22
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = unos.nextInt();
		int cifra = broj%10;
		int max = cifra;
		int min = cifra;
		broj = broj/10;
		while(broj>0) {
			cifra=broj%10;
			if(cifra>max) {
				max=cifra;
			}
			if(cifra<min) {
				min=cifra;
			}
			broj=broj/10;
		}
		int zbir = max+min;
		System.out.println("Zbir najmanje i najvece cifre datog broja je "+zbir);
		*/
		
		// Zadatak broj 24
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite iznos skolarine");
		double skolarina = unos.nextDouble();
		System.out.println("Unesite prosjecnu ocjenu ucenika koristeci zarez");
		double prosjek = unos.nextDouble();
		if(prosjek<2.0 || prosjek>5.0) {
			System.out.println("Greska. Prosjek ucenika treba biti u opsegu od 2.0 do 5.0");
			}
		System.out.println("Unesite 0 ako ucenik nema nagradu sa takmicenja, a 1 ako je ima");
		int nagrada = unos.nextInt();
		if (prosjek>=4.5) {
			skolarina = skolarina*0.6;
		}
		else if(prosjek>=3.5) {
			if(nagrada==1) {
				skolarina=skolarina*0.7;
			}
			else {
				skolarina=skolarina*0.8;
			}
		}
		else if(prosjek>=2.5) {
			if(nagrada==1) {
				skolarina=skolarina*0.7;
			}
			else {
				skolarina=skolarina*0.9;
			}
		}
		System.out.println("Iznos skolarine je "+skolarina);
		*/
		
		// Zadatak broj 25
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cetvorocifreni broj");
		int broj = unos.nextInt();
		int zbir=0;
		int proizvod=1;
		int cifra=broj%10;
		if(broj%2==0) {
			zbir+=cifra;
			broj=broj/10;
			while(broj>0) {
				cifra=broj%10;
				broj=broj/10;
				zbir+=cifra;
			}
			System.out.println("Broj je paran, pa je zbir njegovih cifara "+zbir);
		}
		else {
			proizvod=proizvod*cifra;
			broj=broj/10;
			while(broj>0) {
				cifra=broj%10;
				broj=broj/10;
				proizvod*=cifra;
			}
			System.out.println("Broj je neparan pa je proizvod njegovih cifara "+proizvod);
		}
		*/
		
		// Zadatak broj 26
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite tjeme gornje desne ivice stola");
		int x1= unos.nextInt();
		int y1=unos.nextInt();
		System.out.println("Unesite tjeme donje lijeve ivice stola");
		int x2=unos.nextInt();
		int y2=unos.nextInt();
		System.out.println("Unesite koordinate mrava");
		int x3=unos.nextInt();
		int y3=unos.nextInt();
		if ((x3==x2 && y3>=y2 && y3<=y1) || (x3==x1 && y3>=y2 && y3<=y1) || (y3==y2 && x3>=x2 && x3<=x1) || (y1==y2 && x3>=x2 && x3<=x1)) {
			System.out.println("Mrav se krece po ivici stola");
		}
		else {
			System.out.println("Mrav se ne krece po ivici stola");
		}
		*/
		
		// Zadatak broj 27
		/*
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite cijeli broj");
		int broj = unos.nextInt();
		int cifra=broj%10;
		broj=broj/10;
		int brojac=1;
		int zbir=cifra;
		while(broj>0) {
			cifra=broj%10;
			zbir+=cifra;
			brojac++;
			broj=broj/10;
		}
		double aritmeticka = zbir*1.0/brojac;
		System.out.println("Aritmeticka sredina zbira cifara datog broja je "+aritmeticka);
		*/
	}

}
