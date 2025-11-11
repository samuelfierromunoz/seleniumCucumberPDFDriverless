package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import reportes.PdfBciReports;

import static base.Navegador.*;

public class CucumberHook {

    @Before
    public void before(){
        PdfBciReports.createPDF();
       // Chrome_Launch("https://demoqa.com/");
        ChromeDriverLess("https://www.google.com/");
    }

    @After
    public void after(){
        PdfBciReports.closePDF();

        closeNav();
    }
}
