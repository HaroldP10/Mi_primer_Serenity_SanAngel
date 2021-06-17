package tasks;
import org.openqa.selenium.Keys;

import interactions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.SanAngelUserInterface;
import variablesGlobales.VariablesGlobales;

public class BuscarProductoEnSanAngel implements Task{
	
	private String producto;
	public BuscarProductoEnSanAngel(String producto) {
		this.producto = producto;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(producto).into(SanAngelUserInterface.TXT_BUSCADOR_SAN_ANGEL).thenHit(Keys.ENTER),
			    Esperar.estosSegundos(30)
				);
		VariablesGlobales.nombreProductoAleatorio = SanAngelUserInterface.LBL_PRODUCTO_SAN_ANGEL.of(producto).resolveFor(actor).getText();
	}
	public static BuscarProductoEnSanAngel on(String producto) {
		return Instrumented.instanceOf(BuscarProductoEnSanAngel.class).withProperties(producto);
	}
}
