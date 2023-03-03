package Servicio;

public class LongitudServicio {

	public double deKmAMillas(double km) {
		try {
			return km / 1.6;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deMillasAKm(double millas) {
		try {
			return millas * 1.6;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
}
