package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaDeProductos extends PageObject{

	//Mapea el producto a seleccionar
	public static final Target btnSeleccionarProducto = Target.the("Seleccionar el porducto").located(By.id("item-product-caption_41490830"));
}
