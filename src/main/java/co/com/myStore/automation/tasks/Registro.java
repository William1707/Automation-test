package co.com.myStore.automation.tasks;

import co.com.myStore.automation.userinterface.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Registro implements Task {

    public static Registro onThepage() {
        return Tasks.instrumented(Registro.class);

    }

    @Override

    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(RegistroPage.REGISTRY_BUTTON)

        );

    }
}
