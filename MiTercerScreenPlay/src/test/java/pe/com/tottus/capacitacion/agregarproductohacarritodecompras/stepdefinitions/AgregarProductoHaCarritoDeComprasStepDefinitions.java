package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.exceptions.ProductoNoAgregado;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.models.BusquedaData;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.questions.ElMensajeDelCarrito;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.questions.ValidarProducto;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks.Abrir;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks.AbrirLaPagina;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks.BuscarProducto;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.TottusHome;

public class AgregarProductoHaCarritoDeComprasStepDefinitions {

	
	//se referencia el driver a utilizar
	@Managed(driver = "chrome")
	private WebDriver suDriver;//este va primero que el de arriba sino tira error
	
	TottusHome tottusHome;//se crea el objeto para cargar la pagina inicial

	
	Actor juancamilo = Actor.named("Juan Camilo");//se crea el actor
	
	@Before//antes de toda la ejecucion se indica que se abre el navegador con el driver previamente instanciado 
	public void SetUp() {
		
		juancamilo.can(BrowseTheWeb.with(suDriver));//abre el navegador
		
	}
	
	@Given("^Que Juan Camilo este en la pagina de tottus peru$")
	public void queJuanCamiloEsteEnLaPaginaDeTottusPeru() throws Exception {
		//se indica que se va abrir la pagina de inicio de tottus
		juancamilo.wasAbleTo(AbrirLaPagina.en(tottusHome));
	}


	@When("^Agrega el ([^\"]*) al carrito de compras$")
	public void agregaElTelevisorAlCarritoDeCompras(List<BusquedaData> producto) throws Exception {
		//se busca el producto en la pagina y se agrega al carrito de compras
		
		juancamilo.wasAbleTo(BuscarProducto.enLaPagina(producto),
				Abrir.elCarrito());	
	}


    
    
	@Then("^Deberia ver el producto agregado en el carrito de compras validado con el boton \"([^\"]*)\"$")
	public void deberiaVerElProductoAgregadoEnElCarritoDeComprasValidadoConElBoton(String nombreDelBoton) throws Exception {
				
						
		try {
			//se valida que el nombre del boton de pagar sea igual que el enviado por parametro
			juancamilo.should(seeThat(ValidarProducto.enElCarrito(),equalTo(nombreDelBoton)));
		} catch (Exception e) {
			//En caso de que no se ha cargado aun el producto en el carrito se ejecuta la siguiente instruccion 
			System.out.println("entro aqui");
			juancamilo.should(seeThat(ElMensajeDelCarrito.cuandoEstaVacio(),
					equalTo("El carro está vacío")).orComplainWith(ProductoNoAgregado.class,
							"No se agrego el producto al carrito de compras"));
		}
	}
}
