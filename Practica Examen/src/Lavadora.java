
public final class Lavadora extends Electrodomesticos {
	
	
	private double carga = 5;

	
	
	public Lavadora() {
		super();
	}



	public Lavadora(String modelo, double precio_base, char consumo_energetico, int peso, double carga) {
		super(modelo, precio_base, consumo_energetico, peso);
		this.carga = carga;
	}
	
	
	
	public Lavadora(Lavadora copia) {
		this(copia.getModelo(),copia.getPrecio_base(),copia.getConsumo_energetico(),copia.getPeso(),copia.carga);
	}
	
	
	public double precioFinal() {
		/* devuelve el precio final de venta, teniendo en cuenta que al
		precio base se le deben aplicar los incrementos de la clase Electrodoméstico más
		el incremento propio de esta clase, que es el siguiente:
		➢ si tiene una carga mayor de 30 kg, se aumenta el precio 50 €, si no es así, no
		se incrementa el precio.*/
		
		
		double precio_final = getPrecio_base()+incrementoPrecio();
		
		if (carga > 30) {
			precio_final+= 50;
		}
		return precio_final;
		
		
	}



	@Override
	public String toString() {
		return super.toString() +  "Lavadora [carga=" + carga + "]" ;
	}
	
	
	
	
	
	
	


	
	
	
	
	
}
