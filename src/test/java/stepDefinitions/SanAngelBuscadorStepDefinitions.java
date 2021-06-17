package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnSanAngel;
import userInterface.SanAngelUserInterface;

public class SanAngelBuscadorStepDefinitions {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que me encuentro en la pagina de San Angel con la url (.*)$")
	public void queMeEncuentroEnLaPaginaDeOLXConLaUrlHttpsWwwOlxComCo(String url) {
		OnStage.theActorCalled("Harold").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
	}

	@When("^busco el producto (.*) en el buscador$")
	public void buscoElProudctoEnElBuscador(String producto) {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnSanAngel.on(producto));
	}

	@Then("^podre ver el producto (.*) en pantalla$")
	public void podreVerElProductoEnPantalla(String producto) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(SanAngelUserInterface.LBL_PRODUCTO_SAN_ANGEL.of(producto)), WebElementStateMatchers.containsText(producto)));
	}
}
