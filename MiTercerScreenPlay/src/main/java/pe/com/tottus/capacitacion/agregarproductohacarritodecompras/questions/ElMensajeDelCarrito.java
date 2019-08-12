package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.DetallesDelproducto;

public class ElMensajeDelCarrito implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		//retorna el texto que aparece cuando el carrito esta vacio 
		return Text.of(DetallesDelproducto.carritoVacio).viewedBy(actor).asString();
	}

	public static ElMensajeDelCarrito cuandoEstaVacio() {
		
		return new ElMensajeDelCarrito();
	}

}
