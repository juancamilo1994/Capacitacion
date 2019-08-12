package co.com.google.capacitacion.questions;


import co.com.google.capacitacion.userinterfaces.BusquedaEnGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
	
		//se extrae el nombre de la página a comparar dado el resultado de la búsqueda 
					
		return Text.of(BusquedaEnGoogle.link).viewedBy(actor).asString();
	}

	public static Validar quesitoEnWikipedia() {
		// TODO Auto-generated method stub
		return new Validar();
	}
}
