package stepDefinitions;

import java.io.IOException;
import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnSanAngel;
import userInterface.SanAngelUserInterface;
import variablesGlobales.VariablesGlobales;

public class SanAngelBuscadorFallido {
	

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@When("^Deseo encontrar un producto en el buscador$")
	public void deseoEncontrarUnProductoEnElBuscador(List<Producto> productos) {
	OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnSanAngel.on(productos.get(0).getNombreProducto()));  
	  
	}


	@Then("^validar el producto buscado en la pantalla$")
	public void validarElProductoBuscadoEnLaPantalla() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(SanAngelUserInterface.LBL_PRODUCTO_SAN_ANGEL.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
	}

}
