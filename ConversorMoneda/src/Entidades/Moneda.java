package Entidades;

public class Moneda {

	private double dolar = 197.86;
	private double euro = 209.68;
	private double librasEsterlinas = 236.46;
	private double wonSurcoreano = 0.15;
	private double yenJapones = 1.45;
	
	public Moneda() {
		super();
	}
	
	public Moneda(double dolar, double euro, double librasEsterlinas, double wonSurcoreano,
			double yenJapones) {
		super();
		this.dolar = dolar;
		this.euro = euro;
		this.librasEsterlinas = librasEsterlinas;
		this.wonSurcoreano = wonSurcoreano;
		this.yenJapones = yenJapones;
	}
	
	public double getDolar() {
		return dolar;
	}
	
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	
	public double getEuro() {
		return euro;
	}
	
	public void setEuro(double euro) {
		this.euro = euro;
	}
	public double getLibrasEsterlinas() {
		return librasEsterlinas;
	}
	
	public void setLibrasEsterlinas(double librasEsterlinas) {
		this.librasEsterlinas = librasEsterlinas;
	}
	
	public double getWonSurcoreano() {
		return wonSurcoreano;
	}
	
	public void setWonSurcoreano(double wonSurcoreano) {
		this.wonSurcoreano = wonSurcoreano;
	}
	
	public double getYenJapones() {
		return yenJapones;
	}
	
	public void setYenJapones(double yenJapones) {
		this.yenJapones = yenJapones;
	}

}
