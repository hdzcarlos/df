package model;

public class NoPerecederos extends Producto{
	
	private String tipo;

	public NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
		precio = 0;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calcular(int stock) {
		double precioFinal = super.getPrecio() *stock;
		return precioFinal;
	}

	@Override
	public String toString() {
		return super.toString()+"NoPerecederos [tipo=" + tipo + "precio final: " ;
	}
	
	
	
	

}
