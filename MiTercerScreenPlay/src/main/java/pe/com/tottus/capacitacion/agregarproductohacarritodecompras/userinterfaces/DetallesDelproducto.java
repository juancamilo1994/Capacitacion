package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DetallesDelproducto extends PageObject{
	
	//se mapea el boton agregar, el desplegar carrito de compras y el de pagar que aparece dentro del carrito de compras 
	public static final Target btnAgregar = Target.the("Boton agregar").locatedBy("//input[starts-with(@id, 'atg_behavior_addItemToCart')]");
	public static final Target btnCarrito = Target.the("Boton desplegar carrito").located(By.id("atg_store_cart_total"));
	public static final Target btnPagar = Target.the("Boton de pagar").locatedBy("//a[@class='btn btn-block btn-primary']");
	
	//Mapea el mensaje del carrito de compras cuando esta vacio
	public static final Target carritoVacio = Target.the("Mensaje de carrito vacio").locatedBy("//div[@id='atg_store_csContent']/div/span");
}
