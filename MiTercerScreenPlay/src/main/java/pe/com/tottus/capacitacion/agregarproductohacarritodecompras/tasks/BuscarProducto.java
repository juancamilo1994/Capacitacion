package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.models.BusquedaData;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.DetallesDelproducto;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.PaginaDeProductos;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.TottusHome;

public class BuscarProducto implements Task{

	List<BusquedaData> producto;//variable para almacenar el producto enviado desde la lista del modelo y que se genera a partir de la tabla en el feature
	
	public BuscarProducto(List<BusquedaData> producto) {
		this.producto = producto;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//se ingresa el producto en la caja de texto y se le da click al boton buscar
	
			actor.attemptsTo(Enter.theValue(producto.get(0).nombreDelProducto).into(TottusHome.txtBuscar),
					Click.on(TottusHome.btnBuscar),
					Click.on(PaginaDeProductos.btnSeleccionarProducto),
					Click.on(DetallesDelproducto.btnAgregar));

	
	}

	public static BuscarProducto enLaPagina(List<BusquedaData> producto) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(BuscarProducto.class, producto);//se llama al contructor y se le manda el producto
	}

}
