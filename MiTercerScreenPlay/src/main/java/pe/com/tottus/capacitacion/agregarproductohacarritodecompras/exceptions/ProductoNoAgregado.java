package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.exceptions;

public class ProductoNoAgregado extends AssertionError{
	//se utiliza cuando aun no se ha cargado el producto en el carrito de compras
	public ProductoNoAgregado(String mensage, Throwable causa) {
		super(mensage, causa);
	}
}
