package pages;

import base.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static base.MetodosAccion.*;

public class ParisPage {

    public ParisPage() {
        PageFactory.initElements(DriverContext.getDriver(), this);
    }

    @FindBy(xpath ="//nav/button")
    WebElement barraCategoria;

    @FindBy(xpath = "//div[@id='perseo']/div/div")
    List<WebElement> productos;

    @FindBy(xpath = "//p[contains(text(),'SKU ')]")
    WebElement sku;

    @FindBy(xpath = "//div[@class='pdp-top__product-name']/h1")
    WebElement nombreProducto;


    public void seleccionarCategoria(String categoria){
        esperaElemento(barraCategoria,10);
        barraCategoria.click();
        DriverContext.getDriver().findElement(By.xpath("//a[@data-category='"+categoria+"']")).click();
    }

    public void seleccionarProducto(int producto){
        esperaElemento(productos.get(0),10);
        scrollHorizontalElement(productos.get(producto));
        productos.get(producto).click();
        System.out.println("******* Producto "+(producto+1)+" ******");
    }

    public void extraerDatosDeNproductos(int cantproductos){
        cantproductos =cantproductos-1;
        for (int i=0 ; i<=cantproductos; i++){
            seleccionarProducto(i);
            extraerDatos();
            volverPaginaAnterior();
        }
    }

    public void extraerDatos(){
        esperaElemento(sku,10);
        System.out.println("*******************************************");
        System.out.println("codigo "+sku.getText());
        System.out.println("nombre "+nombreProducto.getText());
        System.out.println("*******************************************");
    }

    public void volverPaginaAnterior(){
        DriverContext.getDriver().navigate().back();
    }

}
