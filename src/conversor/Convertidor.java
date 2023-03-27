package conversor;

import java.util.ArrayList;
import java.util.Collection;


import javax.swing.JOptionPane;

public class Convertidor {
	public static void main(String[] args) {
		Collection<Moneda> monedas = llenar();
		
		Object[] objects = {"Conversor de moneda", "Conversor de medida"};
		Object[] objects2 = {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreanos", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won coreanos a Pesos"};
		Object selection;
		selection= JOptionPane.showInputDialog(null, "Selecciones la opcion deseada", "Conversor", JOptionPane.PLAIN_MESSAGE, null , objects, objects[0]);
		String opcionMenu1;
		if(selection == null) {
			opcionMenu1 = "null";
		}else {
			opcionMenu1 = selection.toString();
		}
		switch (opcionMenu1) {
			case "Conversor de moneda": 
				conversion(monedas,objects2,selection);
				break;
			case "Conversor de medida":
				System.out.println("En proceso");
				break;
			case "null":
				salir();
				return;
		}
		
		
	}
	
	public static Collection<Moneda> llenar() {
		Collection<Moneda> monedas2 = new ArrayList<>();
		Moneda dolar = new Moneda("Dolar", 0.00021134545, 4739.0514);
		Moneda euro = new Moneda("Euro", 0.00019606146, 5099.6639);
		Moneda LibraEsterlina = new Moneda("Libra Esterlina", 0.00017247532, 5796.2741);
		Moneda yen = new Moneda("Yen", 0.027576482, 36.262784);
		Moneda won = new Moneda("Won", 0.27343641, 3.6571794);
		
		monedas2.add(dolar);
		monedas2.add(euro);
		monedas2.add(LibraEsterlina);
		monedas2.add(yen);
		monedas2.add(won);
		return monedas2;
	}
	
	public static void salir() {
		JOptionPane.showMessageDialog(null, "Programa teminado", "Saliendo...", 1);
	}
	
	public static String continuar() {
		String conversion;
		Object respuesta;
		respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Continar?", "", JOptionPane.YES_NO_CANCEL_OPTION, 3);
		System.out.println(respuesta);
		conversion = respuesta.toString();
		return conversion;
	}
	
	public static void conversion(Collection<Moneda> monedas, Object[] objects2, Object seleccion) {
		String opcion;
		String salida = "";
		for(;;) {
			String valor;
			seleccion = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir", "Entrada", 3);
			
			if(seleccion == null) {
				salir();
				break;
			}else {
				
				valor = seleccion.toString();
				
				if(valor.matches("-?\\d+(\\.\\d+)?")) {
					double valorAConvertir = Double.parseDouble(valor);
					Object seleccionMenu2 = JOptionPane.showInputDialog(null, "Elije la moneda a la que desea hacer la conversion", "Monedas", JOptionPane.PLAIN_MESSAGE, null , objects2, objects2[0]);
					if(seleccionMenu2 == null) {
						salir();
						break;
					}
					opcion = seleccionMenu2.toString();
					switch (opcion) {
						case "De Pesos a Dolar": 
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(0).getValorConversionLocal() + " Dolares", "respuesta", 1);
							salida = continuar();
							break;
						case "De Pesos a Euro":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(1).getValorConversionLocal() + " Euros", "respuesta", 1);
							salida = continuar();
							break;
						case "De Pesos a Libras":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(2).getValorConversionLocal() + " Libras esterlinas", "respuesta", 1);
							salida = continuar();
							break;
						case "De Pesos a Yen":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(3).getValorConversionLocal() + " Yenes", "respuesta", 1);
							break;
						case "De Pesos a Won Coreanos":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(4).getValorConversionLocal() + " Won coreanos", "respuesta", 1);
							break;
						case "De Dolar a Pesos":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(0).getValorConversionExterior() + " COP", "respuesta", 1);
							break;
						case "De Euro a Pesos":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(1).getValorConversionExterior() + " COP", "respuesta", 1);
							break;
						case "De Libras a Pesos":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(2).getValorConversionExterior() + " COP", "respuesta", 1);
							break;
						case "De Yen a Pesos":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(3).getValorConversionExterior() + " COP", "respuesta", 1);
							break;
						case "De Won coreanos a Pesos":
							JOptionPane.showMessageDialog(null, valorAConvertir * ((ArrayList<Moneda>) monedas).get(4).getValorConversionExterior() + " COP", "respuesta", 1);
							break;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Valor no valido", "Error", 1, null);
				}
				System.out.println(salida);
			}
			
			if(salida.equals("1") || salida.equals("2") || salida.equals("-1")) {
				salir();
				break;
			}
			
		}
	
	}
	
}

	
