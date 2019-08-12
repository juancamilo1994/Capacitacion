package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.DetallesDelproducto;

public class ValidarProducto implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		
		return  Text.of(DetallesDelproducto.nombreProducto).viewedBy(actor).asString();//se captura el nombre del producto que sale en el carrito de compras
	}

	
	public static ValidarProducto enElCarrito() {
		// TODO Auto-generated method stub
		return new ValidarProducto();
	}


}
