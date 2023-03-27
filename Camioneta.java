package vehiculos;

public class Camioneta extends Vehiculo{
	private Boolean volco;
	private static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, Boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
		
	}
	
	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
	
	public Boolean isVolco() {
		return volco;
	}
	
	public void setVolco(Boolean volco) {
		this.volco = volco;
	}
	
}
