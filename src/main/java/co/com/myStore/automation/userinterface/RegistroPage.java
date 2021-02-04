package co.com.myStore.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {
    public static  final Target REGISTRY_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"));

}
