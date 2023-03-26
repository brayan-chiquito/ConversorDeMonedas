package conversor;


public class Moneda {
	private String nombre;
	private double valorConversionLocal;
	private double valorConversionExterior;

	
	public Moneda(String nombre, double valorConversionLocal, double valorConversionExterior) {
		super();
		this.nombre = nombre;
		this.valorConversionLocal = valorConversionLocal;
		this.valorConversionExterior = valorConversionExterior;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValorConversionLocal() {
		return valorConversionLocal;
	}
	public void setValorConversionLocal(double valorConversionLocal) {
		this.valorConversionLocal = valorConversionLocal;
	}
	public double getValorConversionExterior() {
		return valorConversionExterior;
	}
	public void setValorConversionExterior(double valorConversionExterior) {
		this.valorConversionExterior = valorConversionExterior;
	}

	
	
}
