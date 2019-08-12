package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.DetallesDelproducto;

public class Abrir implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DetallesDelproducto.btnCarrito));//se le da la orden de abrir la pestaña del carrito
		
	}

	public static Abrir elCarrito() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Abrir.class);//se llama la tarea de abrir la pestaña del carrito
	}
	
	

}
