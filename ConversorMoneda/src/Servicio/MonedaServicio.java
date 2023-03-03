package Servicio;

import Entidades.Moneda;
import Errores.ErroresMoneda;

public class MonedaServicio {

	private Moneda moneda;
	
	public MonedaServicio() {
		this.moneda = new Moneda();
	}
	
	public double dePesoADolar(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAEuro(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoALibrasEsterlinas(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getLibrasEsterlinas();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAWonSurcoreano(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getWonSurcoreano();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	public double dePesoAYenJapones(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getYenJapones();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deDolarAPeso(double dolar) throws ErroresMoneda {
		validar(dolar);
		try {
			return dolar * moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deEuroAPeso(double euro) throws ErroresMoneda {
		validar(euro);
		try {
			return euro * moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deLibrasEsterlinasAPeso(double libras) throws ErroresMoneda {
		validar(libras);
		try {
			return libras * moneda.getLibrasEsterlinas();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deWonSurcoreanoAPeso(double won) throws ErroresMoneda {
		validar(won);
		try {
			return won * moneda.getWonSurcoreano();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	public double deYenJaponesAPeso(double yen) throws ErroresMoneda {
		validar(yen);
		try {
			return yen * moneda.getYenJapones();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	private void validar(double moneda) throws ErroresMoneda {
		if (moneda <= 0) {
			throw new ErroresMoneda("Debe ingresar un valor mayor a 0");
		}
	}
}
