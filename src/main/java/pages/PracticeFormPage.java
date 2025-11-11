package pages;

import base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reportes.EstadoPrueba;
import reportes.PdfBciReports;

public class PracticeFormPage {

    public PracticeFormPage() {
        PageFactory.initElements(DriverContext.getDriver(), this);
    }

    @FindBy (id ="firstName")
    WebElement inputFirstName;

    public void ingresarNombre(String texto){
        inputFirstName.sendKeys(texto);
        PdfBciReports.addWebReportImage("formulario","ingreso input nombre:"+texto, EstadoPrueba.PASSED,false);
    }

}
