package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.DetallesDelproducto;

public class Abrir implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		//se realiza la accion de abrir el carrito de compras
		actor.attemptsTo(Click.on(DetallesDelproducto.btnCarrito));
		
	}

	public static Abrir elCarrito() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Abrir.class);
	}

}
