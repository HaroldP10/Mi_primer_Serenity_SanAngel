package interactions;

import java.util.List;
import java.util.Random;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import userInterface.SanAngelUserInterface;
import variablesGlobales.VariablesGlobales;

public class ClicProductoAleatorio implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) { //metodo de secuencia performAs
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		Random random = new Random();
		List<WebElementFacade> listaBotonesProductos = SanAngelUserInterface.BTN_PRODUCTO_ALEATORIO_SAN_ANGEL.resolveAllFor(actor);
		List<WebElementFacade> listaNombresProductos = SanAngelUserInterface.LBL_NOMBRE_PRODUCTO_ALEATORIO_SAN_ANGEL.resolveAllFor(actor);
		int numeroAleatorio = random.nextInt(listaBotonesProductos.size());
		System.out.println("LBL"+listaBotonesProductos);
		System.out.println("nombres"+listaNombresProductos);
		VariablesGlobales.nombreProductoAleatorio = listaNombresProductos.get(numeroAleatorio).getTextContent();
		listaBotonesProductos.get(numeroAleatorio).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Performable on() {  //metodo recursivo imporpia su propia clases nos permite invocxar un metodo del actor en cualquier clase
		return Instrumented.instanceOf(ClicProductoAleatorio.class).withProperties();
	}
}
