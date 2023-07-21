import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ConversorDeMoneda {
	
	private double CantidadDinero = 0;
	private double Conversion = 0;
	private String Tasa;
	private double Dolares = 0.00025;
	private double Euro = 0.00022;
	private double LibraEsterlina = 0.000195;
	private double YenJaponés = 0.03517;
	private double WonSurCoreano = 0.3173;

	public ConversorDeMoneda (double Cantidad){
		this.CantidadDinero=Cantidad;
	}

	public void EscogerTasaCambio() {
		
		this.Tasa =(JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De pesos colombianos a Dólar","De pesos colombianos a Euros",
						"De pesos colombianos a Libras Esterlinas","De pesos colombianos a Yen Japonés","De pesos colombianos a Won sur-coreano",
						"De Dólar a pesos colombianos","De Euros a pesos colombianos","De Libras Esterlinas a pesos colombianos",
						"De Yen Japonés a pesos colombianos","De Won sul-coreano a pesos colombianos"}
		,"Selecciona")).toString();
		
	}
	
	public int ConversionTasa() {
		
		if(this.Tasa.equals("De pesos colombianos a Dólar")) {
			Conversion = this.CantidadDinero * Dolares;
			return 0;
		}else if(this.Tasa.equals("De pesos colombianos a Euros")) {
			Conversion =this.CantidadDinero * Euro;
			return 1;
		}else if(this.Tasa.equals("De pesos colombianos a Libras Esterlinas")){
			Conversion =this.CantidadDinero * LibraEsterlina;
			return 2;
		}else if(this.Tasa.equals("De pesos colombianos a Yen Japonés")) {
			Conversion =this.CantidadDinero * YenJaponés;
			return 3;
		}else if(this.Tasa.equals("De pesos colombianos a Won sur-coreano")) {
			Conversion =this.CantidadDinero * WonSurCoreano;
			return 4;
		}else if(this.Tasa.equals("De Dólar a pesos colombianos")) {
			Conversion =this.CantidadDinero / Dolares;
			return 5;	
		}else if(this.Tasa.equals("De Euros a pesos colombianos")) {
			Conversion =this.CantidadDinero / Euro;
			return 5; 
		}else if(this.Tasa.equals("De Libras Esterlinas a pesos colombianos")){
			Conversion =this.CantidadDinero / LibraEsterlina;
			return 5;
		}else if(this.Tasa.equals("De Yen Japonés a pesos colombianos")) {
			Conversion =this.CantidadDinero / YenJaponés;
			return 5;
		}else if(this.Tasa.equals("De Won sul-coreano a pesos colombianos")) {
			Conversion =this.CantidadDinero / WonSurCoreano;
			return 5;
		}
		else {
			return 6;
		}
			
	}

    public void message() {
    	String[] Monedas = {"Dolares","Euros", "Libras Esterlinas","Yen Japonés", "Won sur-coreano","pesos colombianos" };
		JOptionPane.showMessageDialog(null, "Tienes " +  this.Conversion  +" "+  Monedas[ConversionTasa()]);
	}
	

	public double getCantidadDinero() {
		return CantidadDinero;
	}

	public void setCantidadDinero(double cantidadDinero) {
		CantidadDinero = cantidadDinero;
	}

	public double getConversion() {
		return Conversion;
	}

	public void setConversion(double conversion) {
		Conversion = conversion;
	}

	public String getTasa() {
		return Tasa;
	}

	public void setTasa(String tasa) {
		Tasa = tasa;
	}

	public double getDolar() {
		return Dolares;
	}

	public void setDolar(double dolar) {
		Dolares = dolar;
	}

	public double getEuro() {
		return Euro;
	}

	public void setEuro(double euro) {
		Euro = euro;
	}

	public double getLibraEsterlina() {
		return LibraEsterlina;
	}

	public void setLibraEsterlina(double libraEsterlina) {
		LibraEsterlina = libraEsterlina;
	}

	public double getYenJaponés() {
		return YenJaponés;
	}

	public void setYenJaponés(double yenJaponés) {
		YenJaponés = yenJaponés;
	}

	public double getWonSurCoreano() {
		return WonSurCoreano;
	}

	public void setWonSurCoreano(double wonSurCoreano) {
		WonSurCoreano = wonSurCoreano;
	}
	
	
}
/*
String nombre = JOptionPane.showInputDialog("Por favor, ingresa tu nombre:");


if (nombre != null) {
	JOptionPane.showMessageDialog(null, "Hola, " + nombre + "! Bienvenido.");
}*/