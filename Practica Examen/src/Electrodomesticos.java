import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

public abstract class Electrodomesticos {
	
	private String modelo = "Desconocido";
	private double Precio_base = 100;
	char consumo_energetico = 'F';
	private int peso = 5;
	
	public static HashMap<Character,Integer > consumo = new HashMap<>();
	public static int ntotalelectrodomesticos = 0;
	
	
	public static void rellenarletras() {
		consumo.put('A',100);
		consumo.put('B',80);
		consumo.put('C',60);
		consumo.put('D',50);
		consumo.put('E',30);
		consumo.put('F',10);
	}
	
	
	

	
	
	public Electrodomesticos() {
		
	}





	public Electrodomesticos(String modelo, double precio_base, char consumo_energetico, int peso) {
		this.modelo = modelo ;
		this.Precio_base = precio_base ;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}






	public String getModelo() {
		return modelo;
	}






	public void setModelo(String modelo) {
		this.modelo = modelo;
	}






	public double getPrecio_base() {
		return Precio_base;
	}






	public void setPrecio_base(double precio_base) {
		Precio_base = precio_base;
	}






	public char getConsumo_energetico() {
		return consumo_energetico;
	}






	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}






	public int getPeso() {
		return peso;
	}






	public void setPeso(int peso) {
		this.peso = peso;
	}






	public static HashMap<Character, Integer> getConsumo() {
		return consumo;
	}






	public static void setConsumo(HashMap<Character, Integer> consumo) {
		Electrodomesticos.consumo = consumo;
	}






	public static int getNtotalelectrodomesticos() {
		return ntotalelectrodomesticos;
	}






	public static void setNtotalelectrodomesticos(int ntotalelectrodomesticos) {
		Electrodomesticos.ntotalelectrodomesticos = ntotalelectrodomesticos;
	}
	
	
	
	

}
