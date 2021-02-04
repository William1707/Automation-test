package co.com.myStore.automation.stepdefinitions;

import co.com.myStore.automation.tasks.Login;
import co.com.myStore.automation.tasks.OpenUp;
import co.com.myStore.automation.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDefinitions {


    @Before

    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("William wants to log in with his account on the platform my store, we click on the registration button")
    public void williamWantsToLogInWithHisAccountOnThePlatformMyStoreWeClickOnTheRegistrationButton() {
        theActorCalled("Steven").wasAbleTo(OpenUp.thePage(), Registro.onThepage());
    }

    @When("lwe enter the email and password field")
    public void lweEnterTheEmailAndPasswordField() {
        theActorCalled("Steven").attemptsTo(
                Login.withCredentials("Stevenwilli0517@gmail.com", "Inicio2020"));
    }

    @Then("clicking the register button")
    public void clickingTheRegisterButton() {

        throw new cucumber.api.PendingException("Error de autentificacion");

    }



}
