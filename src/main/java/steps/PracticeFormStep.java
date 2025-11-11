package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PracticeFormPage;

public class PracticeFormStep {

    PracticeFormPage practice = new PracticeFormPage();

    @Then("ingresa en input nombre el texto {string}")
    public void ingresaEnInputNombreElTexto(String arg0) {
        practice.ingresarNombre(arg0);
    }


}
