package com.studyopedia;

public class Televizor {
	
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	

public Televizor (int brojKanala, String nazivKanala, int jacinaTona) {

	setBrojKanala(brojKanala);
	setNazivKanala(nazivKanala);
	setJacinaTona(jacinaTona);
		
	
}


public int getBrojKanala() {
	return brojKanala;
}


public void setBrojKanala(int brojKanala) {
	this.brojKanala = brojKanala;
	if(brojKanala>=1) {
		this.brojKanala=brojKanala;
	}
	else {
		System.out.println("Broj kanala mora biti veci ili jednak 1");
		this.brojKanala=1;
	}
	
}


public String getNazivKanala() {
	return nazivKanala;
}


public void setNazivKanala(String nazivKanala) {
	this.nazivKanala = nazivKanala;
}


public int getJacinaTona() {
	return jacinaTona;
}


public void setJacinaTona(int jacinaTona) {
	this.jacinaTona = jacinaTona;
	if(jacinaTona>=0 && jacinaTona<=10) {
		this.jacinaTona = jacinaTona;		
	}
	else {
		if(jacinaTona<0) {
			this.jacinaTona=0;
		}
		if(jacinaTona>10) {
			this.jacinaTona=10;
		}
	}
}

public void pojacajTon() {
	
	if(this.jacinaTona<10) {
		this.jacinaTona++;
		System.out.println("Ton je povecan na "+this.jacinaTona);
	}
	else {
		System.out.println("Ton je vec na maksimumu");
	}
}

public void ispisi() {
	System.out.println("Broj kanala: "+this.brojKanala+ " , Naziv kanala: "+this.nazivKanala+ " , a jacina tona je: " +this.jacinaTona);

}
}


