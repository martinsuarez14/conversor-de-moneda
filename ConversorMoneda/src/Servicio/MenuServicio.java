package Servicio;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import Errores.ErroresMoneda;

public class MenuServicio {

	private MonedaServicio ms;
	private TemperaturaServicio ts;
	private LongitudServicio ls;

	public MenuServicio() {
		this.ms = new MonedaServicio();
		this.ts = new TemperaturaServicio();
		this.ls = new LongitudServicio();
	}
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	public void menuSelecionConversor() throws ErroresMoneda {

		boolean flagMenu = false;

		String[] menu = { 
				"Conversor de monedas", 
				"Conversor de temperatura",
				"Conversor de longitudes millas/kilómetros", 
				};
		
		while (flagMenu == false) {
			String opcionMenu = (String) JOptionPane.showInputDialog(null, "Seleccione el conversor que desea",
					"Conversores", JOptionPane.DEFAULT_OPTION, null, menu, menu[0]);		
	
			if (opcionMenu == null) {
				JOptionPane.showMessageDialog(null, "Gracias por su visita");
				break;
			} else {
				switch (opcionMenu) {
					case "Conversor de monedas":
						menuConversorMoneda();
						break;
					case "Conversor de temperatura":
						menuConversorTemperatura();
						break;
					case "Conversor de longitudes millas/kilómetros":
						menuConversorLongitudes();
						break;
				}
			}
			
			int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Quiere continuar operando el programa?", 
					"Conversor", JOptionPane.YES_NO_OPTION);
			if (respuesta == 1 || respuesta == -1) {
				JOptionPane.showMessageDialog(null, "Gracias por su visita");
				flagMenu = true;
			}
		} 
	}

	public void menuConversorMoneda() throws ErroresMoneda {

		String[] conversoresDeMonedas = { 
				"De Peso a Dolar", 
				"De Peso a Euro", 
				"De Peso a Libras Esterlinas",
				"De Peso a Won Surcoreano", 
				"De Peso a Yen Japonés", 
				"De Dolar a Peso", 
				"De Euro a Peso",
				"De Libras Esterlinas a Peso", 
				"De Won Surcoreano a Peso", 
				"De Yen Japonés a Peso" 
				};

		String respuestaConversorMoneda = (String) JOptionPane.showInputDialog(null,
				"Seleccione el cambio de divisas que desea", "Conversores de Monedas", JOptionPane.DEFAULT_OPTION, null,
				conversoresDeMonedas, conversoresDeMonedas[0]);

		if (respuestaConversorMoneda == null) {
			menuSelecionConversor();
		}
		
		switch (respuestaConversorMoneda) {
			case "De Peso a Dolar":
				double montoPesoDolar = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoDolar + " equivalen a $" + df.format(ms.dePesoADolar(montoPesoDolar)) + " dólares.");
				break;
			case "De Peso a Euro":
				double montoPesoEuro = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoEuro + " equivalen a $" + df.format(ms.dePesoAEuro(montoPesoEuro)) + " euros.");
				break;
			case "De Peso a Libras Esterlinas":
				double montoPesoLibros = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoLibros + " equivalen a $" + df.format(ms.dePesoALibrasEsterlinas(montoPesoLibros)) + " libras esterlinas.");
				break;
			case "De Peso a Won Surcoreano":
				double montoPesoWon = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoWon + " equivalen a $" + df.format(ms.dePesoAWonSurcoreano(montoPesoWon)) + " wones.");
				break;
			case "De Peso a Yen Japonés":
				double montoPesoYenes = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoYenes + " equivalen a $" + df.format(ms.dePesoAYenJapones(montoPesoYenes)) + " yenes.");
				break;
			case "De Dolar a Peso":
				double montoDolarPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoDolarPeso + " equivalen a $" + df.format(ms.deDolarAPeso(montoDolarPeso)) + " pesos.");
				break;
			case "De Euro a Peso":
				double montoEuroPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoEuroPeso + " equivalen a $" + df.format(ms.deEuroAPeso(montoEuroPeso)) + " pesos.");
				break;
			case "De Libras Esterlinas a Peso":
				double montoLibrasPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoLibrasPeso + " equivalen a $" + df.format(ms.deLibrasEsterlinasAPeso(montoLibrasPeso)) + " pesos.");
				break;
			case "De Won Surcoreano a Peso":
				double montoWonPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoWonPeso + " equivalen a $" + df.format(ms.deWonSurcoreanoAPeso(montoWonPeso)) + " pesos.");
				break;
			case "De Yen Japonés a Peso":
				double montoYenesPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoYenesPeso + " equivalen a $" + df.format(ms.deYenJaponesAPeso(montoYenesPeso)) + " pesos.");
				break;
		}
	}
	
	public void menuConversorTemperatura() throws ErroresMoneda {
		
		String[] conversoresTemperatura = { 
				"De Celsius a Fahrenheit", 
				"De Celsius a Kelvin", 
				"De Fahrenheit a Celsius",
				"De Fahrenheit a Kelvin", 
				"De Kelvin a Celsius", 
				"De Kelvin a Fahrenheit" 
				};
		
		String respuestaConversorTemperatura = (String) JOptionPane.showInputDialog(null,
				"Seleccione el conversor de temperatura que desea", "Conversores de Temperatura",
				JOptionPane.DEFAULT_OPTION, null, conversoresTemperatura, conversoresTemperatura[0]);

		if (respuestaConversorTemperatura == null) {
			menuSelecionConversor();
		}
		
		switch (respuestaConversorTemperatura) {
			case "De Celsius a Fahrenheit":
				double celsiusFahrenheit = ingresoDeDato();
				JOptionPane.showMessageDialog(null, celsiusFahrenheit + "°C equivalen a "
					+ df.format(ts.deCelsiusAFahrenheit(celsiusFahrenheit)) + "°F.");			
				break;
			case "De Celsius a Kelvin":
				double celsiusKelvin = ingresoDeDato();
				JOptionPane.showMessageDialog(null, celsiusKelvin + "°C equivalen a "
					+ df.format(ts.deCelsiusAKelvin(celsiusKelvin)) + "°K.");	
				break;
			case "De Fahrenheit a Celsius":
				double fahrenheitCelsius = ingresoDeDato();
				JOptionPane.showMessageDialog(null, fahrenheitCelsius + "°F equivalen a "
					+ df.format(ts.deFahrenheitACelsius(fahrenheitCelsius)) + "°C.");	
				break;
			case "De Fahrenheit a Kelvin":
				double fahrenheitKelvin = ingresoDeDato();
				JOptionPane.showMessageDialog(null, fahrenheitKelvin + "°F equivalen a "
					+ df.format(ts.deFahrenheitAKelvin(fahrenheitKelvin)) + "°K.");	
				break;
			case "De Kelvin a Celsius":
				double kelvinCelsius = ingresoDeDato();
				JOptionPane.showMessageDialog(null, kelvinCelsius + "°K equivalen a "
					+ df.format(ts.deKelvinACelsius(kelvinCelsius)) + "°C.");	
				break;
			case "De Kelvin a Fahrenheit":
				double kelvinFahrenheit = ingresoDeDato();
				JOptionPane.showMessageDialog(null, kelvinFahrenheit + "°K equivalen a "
					+ df.format(ts.deKelvinAFahrenheit(kelvinFahrenheit)) + "°F.");	
				break;
		}
	}
	
	public void menuConversorLongitudes() throws ErroresMoneda {
		
		String[] conversoresLongitud = {
				"De kilómetros a millas",
				"De millas a kilómetros"
		};
		
		String respuestaConversorLongitud = (String) JOptionPane.showInputDialog(null,
				"Seleccione qué medida desea convertir", "Conversores de Longitud", JOptionPane.DEFAULT_OPTION,
				null, conversoresLongitud, conversoresLongitud[0]);

		if (respuestaConversorLongitud == null) {
			menuSelecionConversor();
		}
		
		switch (respuestaConversorLongitud) {
			case "De kilómetros a millas":
				double kmMilla = ingresoDeDato();
				JOptionPane.showMessageDialog(null, kmMilla + " km equivalen a " + df.format(ls.deKmAMillas(kmMilla)) + " millas.");
				break;
			case "De millas a kilómetros":
				double millaKm = ingresoDeDato();
				JOptionPane.showMessageDialog(null,	millaKm + " millas equivalen a " + df.format(ls.deMillasAKm(millaKm)) + " km.");
				break;
		}
	}
	
	public double ingresoDeDato() throws ErroresMoneda {
		
		boolean flag = false;
		
		String cadena = "";
		
		while (flag == false) {
			
			cadena = (String) JOptionPane.showInputDialog(null, "Ingrese el valor");
			
			if (cadena == null || cadena.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debe ingresar un valor para continuar.");
			} else {
				flag = true;
			}
		}
		return convertirADouble(cadena);
	}
	
	public double convertirADouble(String numero) throws ErroresMoneda {
		try {
			if (numero == null || numero.isEmpty()) {
				throw new ErroresMoneda("Debe ingresar un valor");
			}
			
			double decimal = Double.parseDouble(numero);

			return decimal;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
}
