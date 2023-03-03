package Servicio;


public class TemperaturaServicio {
	
	public double deCelsiusAFahrenheit(double temp) {
		try {
			return temp * (9 / 5) + 32;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deCelsiusAKelvin(double temp) {
		try {
			return temp + 273.15;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deFahrenheitACelsius(double temp) {
		try {
			return (temp - 32) * (5 / 9);
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deFahrenheitAKelvin(double temp) {
		try {
			return (temp + 459.67) * (5 / 9);
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deKelvinACelsius(double temp) {
		try {
			return temp - 273.15;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deKelvinAFahrenheit(double temp) {
		try {
			return 1.8 * (temp - 273) + 32;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
}
