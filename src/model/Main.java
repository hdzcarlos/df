package model;
public class Main {
	public static void main(String[] args) {
//		Perecederos perecedero = new Perecederos("tomates", 3);
//		Producto producto = new Producto("Todo", 8);
//		Producto noPerecedero = new NoPerecederos("Papel", 4, "Limpieza");
//		perecedero.calcular(10);
//		producto.calcular(10);
//		noPerecedero.calcular(8);
//		
		Producto perecedero = new Perecederos("LA VIDA", 100, 1);
		System.out.println("=============================");
		
		Producto[] productos = {new Producto("Tomates", 30d),
								new Producto("Lechugas", 20d),
								new Producto("Cebollas", 20d),
								new Producto("Gisantes", 10d),
								new Producto("Zanahorias", 5d),
								new Perecederos("Leche", 20d, 1),
								new Perecederos("Leche Gaza", 25d, 1),
								new Perecederos("Leche Pascual", 45d, 3),
								new Perecederos("Leche Puleba", 55d, 2),
								new Perecederos("Leche en Polvo", 65d, 3),
								new NoPerecederos("Desodorante AVON", 5, "Higiene"),
								new NoPerecederos("Desodorante AXE", 6, "Higiene"),
								new NoPerecederos("Desodorante DAVE", 7, "Higiene"),
								new NoPerecederos("Desodorante TERDL", 8, "Higiene"),
								new NoPerecederos("Desodorante KDJEWR", 4, "Higiene"),

		};
//		System.out.println(perecedero);
//		System.out.println(noPerecedero);
//		System.out.println(producto);
		for (Producto productos2 : productos) {
			productos2.calcular(4);
			System.out.println(productos2);
			
			
		}
		
	}

}
