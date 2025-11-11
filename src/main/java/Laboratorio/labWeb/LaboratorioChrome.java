package Laboratorio.labWeb;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PracticeFormPage;
import pages.PrincipalPage;
import reportes.PdfBciReports;

import static base.Navegador.*;


public class LaboratorioChrome {

    @BeforeTest
    public void before(){
        PdfBciReports.createPDF();
        //Chrome_Launch("https://demoqa.com/");
        ChromeDriverLess("https://demoqa.com/");
    }

    @AfterTest
    public void after(){
        PdfBciReports.closePDF();
        closeNav();
    }

    @Test
    public void prueba1(){
        PrincipalPage principal = new PrincipalPage();
        PracticeFormPage practice = new PracticeFormPage();
        principal.presionarForm();
        principal.entrarForm();
        practice.ingresarNombre("hola mundo");
    }

}
