package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int altezza;
	public int perimetro;
	public int area;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	};
	
	public int calcolaPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
	
	public int calcolaArea() {
		int area = base * altezza;
		return area;
	};
	
	public void disegna() {
		System.out.print("\n");
		
		for(int y=0; y<altezza; y++) {
			
			if(y>0 && y<(altezza - 1)) {
				
				System.out.print("|");
				for(int x=0; x<base - 2; x++) {
					System.out.print(" ");
				}
				System.out.print("|");
				
			} else {
				
				for(int x=0; x<base; x++) {
					System.out.print("-");
				}
				
			}
			
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
}
