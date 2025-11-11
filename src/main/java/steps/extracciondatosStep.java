package steps;

import base.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ParisPage;

public class extracciondatosStep {

    ParisPage paris = new ParisPage();

    @Given("ingreso a la tienda paris chile {string}")
    public void ingresoALaTiendaParisChile(String url) {
        DriverContext.getDriver().get(url);
        System.out.println("ingreso a tienda "+url);
    }

    @When("selecciono la categoria {string} donde se extraeran los datos")
    public void seleccionoLaCategoriaDondeSeExtraeranLosDatos(String categoria) {
        paris.seleccionarCategoria(categoria);
    }

    @Then("selecciono {int} productos y extraigo los datos solicitados")
    public void seleccionoProductosYExtraigoLosDatosSolicitados(int cantidad) {
        paris.extraerDatosDeNproductos(cantidad);
    }
}
