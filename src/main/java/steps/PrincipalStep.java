package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PrincipalPage;
import reportes.EstadoPrueba;
import reportes.PdfBciReports;

public class PrincipalStep {

    PrincipalPage principal = new PrincipalPage();

    @Given("Ingreso a la pagina Qa")
    public void ingresoALaPaginaQa() {
        PdfBciReports.addWebReportImage("Ingreso a la pagina Qa","visualizo pagina", EstadoPrueba.PASSED,false);
    }


    @When("presiona formulario Form")
    public void presionaFormularioForm() {
        principal.presionarForm();
    }

    @And("Se visualiza boton sub Form")
    public void seVisualizaBotonSubForm() {
        principal.entrarForm();
    }
}
