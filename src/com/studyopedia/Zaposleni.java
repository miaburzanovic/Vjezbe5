package com.studyopedia;

public class Zaposleni {

private String ime;
private String prezime;
private int godineStaza;
private double plata;

public Zaposleni (String ime, String prezime, int godineStaza, int plata) {
 this.ime=ime;
 this.prezime=prezime;
 this.godineStaza=godineStaza;
 this.plata=plata;
	
}

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	this.ime = ime;
}

public String getPrezime() {
	return prezime;
}

public void setPrezime(String prezime) {
	this.prezime = prezime;
}

public int getGodineStaza() {
	return godineStaza;
}

public void setGodineStaza(int godineStaza) {
	if(godineStaza<0) {
		System.out.println("Godine staza ne mogu biti negativne");
		this.godineStaza=0;
	}
	else {
		this.godineStaza = godineStaza;
	}
	
}	

public double getPlata() {
	return plata;
}

public void setPlata(double plata) {
	this.plata = plata;
}
	
public void ispis() {
	System.out.println("Ime: "+this.ime+" prezime: " +this.prezime+ " godine staza: " +this.godineStaza);
}


public void uvecaj() {
	if(this.plata<800 && this.godineStaza>10) {
		this.plata+=this.plata*0.06;
		System.out.println("Plata je uvecana i iznosi "+this.plata);
	}
	else {
		System.out.println("Plata se nece uvecati");
	}
}
public void maxPlata() {
	double max = zaposleni1.getPlata();
	String maxIme = zaposleni.getIme();
	if(zaposleni2.getPlata()>max) {
		max=zaposleni.getPlata();
		maxIme=zaposleni.getIme();
	}
	if(zaposleni3.getPlata()>max) {
		max=zaposleni.getPlata();
		maxIme = zaposleni.getIme();
	}
	System.out.println("Najvecu platu u iznosu od "+this.max+" ima zaposleni pod imenom "+this.maxIme);
}

public static void main(String[] args) {
	Zaposleni zaposleni1 = new Zaposleni("Marko", "Markovic",5,600);
	Zaposleni zaposleni2 = new Zaposleni("Petar", "Petrovic",11,700);
	Zaposleni zaposleni3 = new Zaposleni("Maja","Jankovic",12,750);
	
	zaposleni1.ispis();
	zaposleni3.uvecaj();
}
}
