import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		
		boolean continuar = true;
		while(continuar) {
		                                                         //mensaje                             //nombre e la pestaña
			String conversor = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión", "Menu",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Conversor de Moneda","Conversor de Temperaura"}
			,"Selecciona")).toString();
			
			if(conversor == "Conversor de Moneda" ) {
				Double cantidadDinero= null;
				
				try {
				String valor = JOptionPane.showInputDialog("ingrese la cantidad de dinero que desea convertir");	
				cantidadDinero = Double.valueOf(valor);}
				catch(NumberFormatException nfe) {
					nfe.printStackTrace();
					JOptionPane.showMessageDialog(null, "el valor ingresado no es valido");
					return;
				}
	
				ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda(cantidadDinero);
				conversorDeMoneda.EscogerTasaCambio();
				conversorDeMoneda.ConversionTasa();
				conversorDeMoneda.message(); 
				
			}else if(conversor== "Conversor de Temperaura") {
				Double Temperatura= null;
				
				try {
				String valor = JOptionPane.showInputDialog("ingrese la temperatura que desea convertir");	
				Temperatura = Double.valueOf(valor);}
				catch(NumberFormatException nfe) {
					nfe.printStackTrace();
					JOptionPane.showMessageDialog(null, "el valor ingresado no es valido");
					return;
				}
				ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura(Temperatura);
				conversorDeTemperatura.EscogerEscala();
				conversorDeTemperatura.ConversionTemperatura();
				conversorDeTemperatura.message(); 
	
				
			}
			
            int respuesta = JOptionPane.showConfirmDialog(
                    null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (respuesta != JOptionPane.YES_OPTION) {
                    continuar = false;
                }
		}
		JOptionPane.showMessageDialog(null, "¡Hasta la proxima!.");
	}
}
