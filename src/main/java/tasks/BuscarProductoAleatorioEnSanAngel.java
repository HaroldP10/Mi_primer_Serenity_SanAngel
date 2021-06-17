package tasks;

import interactions.ClicProductoAleatorio;
//import interactions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SanAngelUserInterface;

public class BuscarProductoAleatorioEnSanAngel implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SanAngelUserInterface.BTN_CATEGORIA_FUNEBRE_SAN_ANGEL),
				ClicProductoAleatorio.on()
				);		
	}
	public static BuscarProductoAleatorioEnSanAngel on() {
	return Instrumented.instanceOf(BuscarProductoAleatorioEnSanAngel.class).withProperties();
	}
}
