package co.com.myStore.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CountPage {

    public static final Target TEXT_CUENTA = Target.the("Ver mi cuenta").located(By.xpath("//*[@id=\"center_column\"]/h1"));

}