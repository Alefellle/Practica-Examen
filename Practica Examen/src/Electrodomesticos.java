import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

public abstract class Electrodomesticos {
	
	private String modelo = "Desconocido";
	private double precio_base = 100;
	protected char consumo_energetico = 'F';
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
	
	private  void comprobarConsumo(char letra) {
		
		letra = Character.toUpperCase(letra);
		
		if (consumo.containsKey(letra)) {
			this.consumo_energetico =  letra;
		}else {
			this.consumo_energetico = 'F';
		}
	}
	
	public double  incrementoPrecio() {
		double incremento = 0;
	
		
		if (consumo.containsKey(consumo_energetico) && consumo.isEmpty()) {
			incremento += consumo.get(this.consumo_energetico); 
		}
		
		
		if (this.peso >= 0 && this.peso <= 19 ) {
			incremento += 10;
		}else if (this.peso >= 20 && this.peso <= 49 ) {
			incremento += 50;
		}else if (this.peso >= 50 && this.peso <= 79 ) {
			incremento += 80;
		}else if (this.peso >= 0  ) {
			incremento += 100;
		}
		
		
		return incremento;
		
		}
	

	
	
	public Electrodomesticos() {
		super();
	}





	public Electrodomesticos(String modelo, double precio_base, char consumo_energetico, int peso) {
		this.modelo = modelo ;
		this.precio_base = precio_base ;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
		
		comprobarConsumo(consumo_energetico);
		ntotalelectrodomesticos++;
	}






	public String getModelo() {
		return modelo;
	}






	public void setModelo(String modelo) {
		this.modelo = modelo;
	}






	public double getPrecio_base() {
		return precio_base;
	}






	public void setPrecio_base(double precio_base) {
		precio_base = precio_base;
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

	@Override
	public String toString() {
		return "Electrodomesticos [modelo=" + modelo + ", precio_base=" + precio_base + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
	
	
	
	

}
