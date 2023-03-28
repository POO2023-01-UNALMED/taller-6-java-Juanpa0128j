package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	static int cantidadVehiculos;
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static ArrayList<Vehiculo> listaVehiculos =  new ArrayList<Vehiculo>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		listaVehiculos.add(this);
		
	}
	
	public static Pais paisMasVendedor() {
		ArrayList<Fabricante> listaFabricas = new ArrayList<Fabricante>();
		for(Vehiculo vehiculo : listaVehiculos) {
			listaFabricas.add(vehiculo.getFabricante());
		}
		
		ArrayList<Pais> listaPaises = new ArrayList<Pais>();
		for(Fabricante fabricante : listaFabricas) {
			listaPaises.add(fabricante.getPais());
		}
		
		Pais mayor = listaPaises.get(0);
		for(int i = 0; i < listaPaises.size() - 1; i++) {
			if (ocurrenciasPais(listaPaises.get(i), listaPaises) < ocurrenciasPais(listaPaises.get(i + 1), listaPaises)) {
				mayor = listaPaises.get(i + 1);
			}
			
		}
		
		return mayor;
			
	}
	
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Fabricante> listaFabricas = new ArrayList<Fabricante>();
		for(Vehiculo vehiculo : listaVehiculos) {
			listaFabricas.add(vehiculo.getFabricante());
		}
		
		Fabricante mayor = listaFabricas.get(0);
		for(int i = 0; i < listaFabricas.size() - 1; i++) {
			if (ocurrenciasFabricante(listaFabricas.get(i), listaFabricas) < ocurrenciasFabricante(listaFabricas.get(i + 1), listaFabricas)) {
				mayor = listaFabricas.get(i + 1);
			}
			
		}
		
		return mayor;
	
	}
		
	private static int ocurrenciasPais(Pais a, ArrayList<Pais> listaPaises) {
		int contador = 0;
		for (Pais pais : listaPaises) {
			if (a == pais){
				contador++;
			}
		}
		
		return contador;
	}
	
	private static int ocurrenciasFabricante(Fabricante a, ArrayList<Fabricante> listaFabricas) {
		int contador = 0;
		for (Fabricante fabrica : listaFabricas) {
			if (a == fabrica){
				contador++;
			}
		}
		
		return contador;
	}
	
	public String VehiculosPorTipo() {
		return ("Automoviles: " + Automovil.getCantidadAutomoviles() + "\n"
				 + "Camionetas: " + Camioneta.getCantidadCamionetas() + "\n"
				+ "Camiones: " + Camion.getCantidadCamiones());
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

}
