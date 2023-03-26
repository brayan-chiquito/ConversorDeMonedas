package conversor;

import java.util.ArrayList;
import java.util.Collection;


import javax.swing.JOptionPane;

public class Convertidor {
	public static void main(String[] args) {
		Collection<Moneda> monedas = llenar();
		
		Object[] objects = {"Conversor de moneda", "Conversor de medida"};
		Object[] objects2 = {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreanos", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won coreanos a Pesos"};
		Object selection = JOptionPane.showInputDialog(null, "Selecciones la opcion deseada", "Conversor", JOptionPane.PLAIN_MESSAGE, null , objects, objects[0]);
		String opcionMenu1;
		if(selection == null) {
			opcionMenu1 = "null";
		}else {
			opcionMenu1 = selection.toString();
		}
		
		int opcion=6;
		int valorAConvertir = 5000;
		String numeroFormateado;
		switch (opcionMenu1) {
			case "Conversor de moneda": 
				System.out.println("si dio");
				break;
			case "Conversor de medida":
				System.out.println("En proceso");
				break;
			case "null":
				salir();
				return;
		}
		
		switch (opcion) {
		case 1: 
			System.out.println(valorAConvertir * ((ArrayList<Moneda>) monedas).get(0).getValorConversionLocal());
			break;
		case 2:
			System.out.println(valorAConvertir * ((ArrayList<Moneda>) monedas).get(1).getValorConversionLocal());
			break;
		case 3:
			System.out.println(valorAConvertir * ((ArrayList<Moneda>) monedas).get(2).getValorConversionLocal());
			break;
		case 4:
			System.out.println(valorAConvertir * ((ArrayList<Moneda>) monedas).get(3).getValorConversionLocal());
			break;
		case 5:
			System.out.println(valorAConvertir * ((ArrayList<Moneda>) monedas).get(4).getValorConversionLocal());
			break;
		case 6:
			numeroFormateado = String.format("%.2f",(valorAConvertir * ((ArrayList<Moneda>) monedas).get(0).getValorConversionExterior()));
			System.out.println(numeroFormateado);
			break;
		case 7:
			numeroFormateado = String.format("%.2f",(valorAConvertir * ((ArrayList<Moneda>) monedas).get(1).getValorConversionExterior()));
			System.out.println(numeroFormateado);
			break;
		case 8:
			numeroFormateado = String.format("%.2f",(valorAConvertir * ((ArrayList<Moneda>) monedas).get(2).getValorConversionExterior()));
			System.out.println(numeroFormateado);
			break;
		case 9:
			numeroFormateado = String.format("%.2f",(valorAConvertir * ((ArrayList<Moneda>) monedas).get(3).getValorConversionExterior()));
			System.out.println(numeroFormateado);
			break;
		case 10:
			numeroFormateado = String.format("%.2f",(valorAConvertir * ((ArrayList<Moneda>) monedas).get(4).getValorConversionExterior()));
			System.out.println(numeroFormateado);
			break;
		
		default:
			
		}
		//JOptionPane.showMessageDialog(null, "XD", "respuesta", 1);
		//Object selection = JOptionPane.showInputDialog(null, "Elije la moneda a la que desea hacer la conversion", "Monedas", JOptionPane.PLAIN_MESSAGE, null , objects2, objects2[0]);
		//JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir", "Entrada", 3);
		//JOptionPane.showMessageDialog(null, "Valor no valido", "Error", 1, null);
		//JOptionPane.showConfirmDialog(null, "¿Desea Continar?", "", JOptionPane.YES_NO_CANCEL_OPTION, 3);
		//JOptionPane.showMessageDialog(null, "Programa teminado", "Saliendo...", 1);
		System.out.println(selection);
		
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
	
}

	
