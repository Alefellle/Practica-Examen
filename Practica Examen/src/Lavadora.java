
public final class Lavadora extends Electrodomesticos {
	
	
	private double carga = 5;

	
	
	public Lavadora() {
		super();
	}



	public Lavadora(String modelo, double precio_base, char consumo_energetico, int peso, double carga) {
		super(modelo, precio_base, consumo_energetico, peso);
		this.carga = carga;
	}
	
	
	
	
	
	
	
	
	
	
	
}
