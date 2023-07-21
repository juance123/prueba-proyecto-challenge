import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ConversorDeTemperatura {
	
	private double Temperatura = 0;
	private double Conversion = 0;
	private String EscalaTemperatura;
	private double Kelvin = 273.15;
	
	public ConversorDeTemperatura(double temperatura) {
		this.Temperatura = temperatura;
	}
	
	public void EscogerEscala() {
		this.EscalaTemperatura = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión", "Escalas de Temperatura",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Celsius a Kelvin","De celcius a Fahrenheit","De Kelvin a Celsius", "De Fahrenheit a Celsius" }
		,"Selecciona")).toString();
	}
	
	public int ConversionTemperatura() {
		
		if(this.EscalaTemperatura.equals("De Celsius a Kelvin")) {
			Conversion = this.Temperatura * Kelvin;
			return 0;
		}else if(this.EscalaTemperatura.equals("De Celcius a Fahrenheit")) {
			Conversion =this.Temperatura * (9/5)+32;
			return 1;
		}else if(this.EscalaTemperatura.equals("De Kelvin a Celsius")){
			Conversion =this.Temperatura - Kelvin;
			return 2;
		}else if(this.EscalaTemperatura.equals("De Fahrenheit a Celsius")) {
			Conversion = (this.Temperatura-32)*(5/9);
			return 2;
		}
		else {
			return 3;
		}
			
	}
	
	public void message() {
		String[] Escala = {"Kelvin", "Fahrenheit, Celcius"};
		JOptionPane.showMessageDialog(null, "Tienes " +  this.Conversion  +" "+  Escala[ConversionTemperatura()]);
	}
	
	
}
/*"De Celsius a Kelvin","De celcius a Fahrenheit","De Kelvin a Celsius", "De Fahrenheit a Celsius"*/