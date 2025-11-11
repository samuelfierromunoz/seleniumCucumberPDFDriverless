package Laboratorio.labWeb;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ParisPage;

import static base.Navegador.*;

public class LabExtraccion {

    @BeforeTest
    public void before(){
        ChromeDriverLess("https://www.paris.cl/");
    }

    @AfterTest
    public void after(){
        closeNav();
    }

    @Test
    public void extraccionParis(){
        ParisPage paris = new ParisPage();
        paris.seleccionarCategoria("TV y Audio");
        for (int i=0 ; i<=2; i++){
            paris.seleccionarProducto(i);
            paris.extraerDatos();
            paris.volverPaginaAnterior();
        }


    }
}
