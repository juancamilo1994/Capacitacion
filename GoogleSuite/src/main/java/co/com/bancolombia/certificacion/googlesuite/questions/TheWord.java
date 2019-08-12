package co.com.bancolombia.certificacion.googlesuite.questions;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheWord implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		

		return Text.of(GoogleTranslatePage.TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();//se captura el dato mapeado
	}//retornar el timpo que va a retornar

	public static TheWord translated() {
		// TODO Auto-generated method stub
		return new TheWord();//constructor
	}





}
