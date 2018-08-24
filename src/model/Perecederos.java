package model;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Perecederos extends Producto {
	
	private int diasParaCaducar;

	
	public Perecederos(String nombre, double precio, int diasParaCaducar) {
		super(nombre, precio);
		this.diasParaCaducar = diasParaCaducar;
	}
	
	public Perecederos(String nombre, double precio) {
		super(nombre, precio);
	}

	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}
	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}
	@Override
	public double calcular(int stock) {
	double precioFinal = super.getPrecio()* stock;
	double precioConDescuento;
	System.out.println("El precio normal es de: "+precioFinal);
	
	System.out.println("");
	if(diasParaCaducar==1) {
		 precioConDescuento = precioFinal /=4;
		 System.out.println("----------------------Siguiente precio--------------");
		System.out.println("Precio a 1 dia de caducar es: " + precioConDescuento);
		
		return precioConDescuento;
	}else if(diasParaCaducar == 2) {
		precioConDescuento = precioFinal /=3;
		System.out.println("----------------------Siguiente precio--------------");
		System.out.println("Precio a 2 dias de caducar es:" + precioConDescuento);
		return precioConDescuento;
	}else if (diasParaCaducar == 3) {
		precioConDescuento = precioFinal /2;
		System.out.println("----------------------Siguiente precio--------------");
		System.out.println("Precio a 3 dias de caducar es: " + precioConDescuento);
		return precioConDescuento;
	}else {
		return precioFinal;
	}
		
	}
	@Override
	public String toString() {
		return super.toString()+ "Perecederos [diasParaCaducar=" + diasParaCaducar + "]";
	}
	
	
	

}
