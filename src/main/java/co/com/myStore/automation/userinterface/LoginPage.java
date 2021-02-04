package co.com.myStore.automation.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public  static final Target INPUT_EMAIL =Target.the("ingresamos el correo").located(By.id("email"));
    public  static final Target INPUT_PASSWORD = Target.the("ingresamos la contraseña").located(By.id("passwd"));
    public  static final Target ENTER_BUTTON = Target.the("Boton de inicio de sesion").located(By.id("passwd"));
}
