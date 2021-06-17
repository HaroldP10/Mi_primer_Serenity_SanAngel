package userInterface;
import net.serenitybdd.screenplay.targets.Target;

public class SanAngelUserInterface {
	
	public static final Target TXT_BUSCADOR_SAN_ANGEL = Target.the("El campo donde se realiza la busque del producto").locatedBy("//*[@class='dgwt-wcas-search-input-1130' or @type='search']");
	public static final Target LBL_PRODUCTO_SAN_ANGEL = Target.the("").locatedBy("//h1[contains(text(),'{0}')]");
	public static final Target BTN_CATEGORIA_FUNEBRE_SAN_ANGEL = Target.the("").locatedBy("//*[@id=\"sticky-wrapper\"]/header/div[2]/nav[1]/ul/li[5]/a");
	public static final Target BTN_PRODUCTO_ALEATORIO_SAN_ANGEL = Target.the("").locatedBy("//h2[@class='woocommerce-loop-product__title']//ancestor::a");
	public static final Target LBL_NOMBRE_PRODUCTO_ALEATORIO_SAN_ANGEL = Target.the("").locatedBy("//h2[@class='woocommerce-loop-product__title']");
	
}
