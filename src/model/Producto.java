package model;

public  class Producto {
	
	private String nombre;
	private double precio;
	
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public Producto() {
		this.nombre ="";
		this.precio =0d;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public  double calcular(int stock) {
		double precioFinal = precio *stock;
		return precioFinal;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	  

}
