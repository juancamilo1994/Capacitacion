package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaDeProductos extends PageObject{
	
	//se mapea el producto buscado
	public static final Target btnSeleccionarProducto= Target.the("Seleccionar el producto").locatedBy("//div[@class=' item-product-caption']");
	
}
