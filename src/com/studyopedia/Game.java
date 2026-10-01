package com.studyopedia;

public class Game {
	 class Player {
		
		private int pozicijax;
		private int pozicijay;
		private int width;
		private int height;
		private int health;
		
		public Player(int pozicijax, int pozicijay, int width, int height, int health) {
			this.pozicijax=pozicijax;
			this.pozicijay=pozicijay;
			this.width=width;
			this.height=height;
			this.health=health;
			
		}
		

		public int getPozicijax() {
			return pozicijax;
		}


		public void setPozicijax(int pozicijax) {
			this.pozicijax = pozicijax;
		}


		public int getPozicijay() {
			return pozicijay;
		}


		public void setPozicijay(int pozicijay) {
			this.pozicijay = pozicijay;
		}


		public int getWidth() {
			return width;
		}


		public void setWidth(int width) {
			this.width = width;
		}


		public int getHeight() {
			return height;
		}


		public void setHeight(int height) {
			this.height = height;
		}


		public int getHealth() {
			if(this.health<0 || this.health>100) {
				System.out.println("Zivotni bodovi uzimaju bodove od 0 do 100");
				this.health=0;
			}
			else {
			this.health=health;
			}
		}


		public void setHealth(int health) {
			this.health = health;
		}
		
		class Enemy {
			
		private int pozicijax;
		private int pozicijay;
		private int width;
		private int height;
		private int damage;
		
		public Enemy(int pozicijax, int pozicijay, int width, int height, int damage) {
			this.pozicijax=pozicijax;
			this.pozicijay=pozicijay;
			this.width=width;
			this.height=height;
			this.damage=damage;
			
		}

		public int getPozicijax() {
			return pozicijax;
		}

		public void setPozicijax(int pozicijax) {
			this.pozicijax = pozicijax;
		}

		public int getPozicijay() {
			return pozicijay;
		}

		public void setPozicijay(int pozicijay) {
			this.pozicijay = pozicijay;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			if(this.damage<0 || this.damage>100) {
			System.out.println("Greska. Vrijednost napada uzima vrijednosti od 0 do 100");
			this.damage = 0;
		}
			else {
				this.damage=damage;
			}
			
			
		}
			



}
}
