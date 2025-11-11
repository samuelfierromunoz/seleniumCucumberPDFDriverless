package pages;

import base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reportes.EstadoPrueba;
import reportes.PdfBciReports;

public class PrincipalPage {

    public PrincipalPage() {
        PageFactory.initElements(DriverContext.getDriver(), this);
    }

    @FindBy (xpath = "//h5[contains(text(),'Forms')]/../..")
    WebElement form;

    @FindBy (xpath = "//span[contains(text(),'Practice Form')]/../..")
    WebElement formPractica;


    public void presionarForm(){
        form.click();
        PdfBciReports.addReport("formulario","presiono boton form", EstadoPrueba.PASSED,false);
    }

    public void entrarForm(){
        formPractica.click();
        PdfBciReports.addReport("formulario","presiono boton subform", EstadoPrueba.PASSED,false);
    }
}
