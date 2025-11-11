package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MetodosAccion {

     /** Select - dropbox */
     public static void seleccionarPorTextoVisible(WebElement elemento, String texto){
         try{
             Select select = new Select(elemento);
             select.selectByVisibleText(texto);
         } catch (Exception e){
             System.out.println("Error :"+e.getMessage());
         }
     }

    public static void seleccionarPorIndice(WebElement elemento, int indice){
        try{
            Select select = new Select(elemento);
            select.selectByIndex(indice);
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    public static void seleccionarPorValue(WebElement elemento, String value){
        try{
            Select select = new Select(elemento);
            select.selectByValue(value);
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    public static WebElement visualizarSeleccionado(WebElement elemento){
        try{
            WebElement elementoSeleccionado;
            Select select = new Select(elemento);
            elementoSeleccionado = select.getFirstSelectedOption();
            return elementoSeleccionado;
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
            return null;
        }
    }

    public static List<WebElement> visualizarTodasOpciones(WebElement elemento){
        try{
            Select select = new Select(elemento);
            List<WebElement> elementoSeleccionado = select.getAllSelectedOptions();
            return elementoSeleccionado;
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
            return null;
        }
    }

     /** Esperas **/
     public static boolean visualizarElemento(WebElement e){
         boolean estado = false;
         try{
             if ( e.isDisplayed()){
                 estado = true ;
             }
         } catch (Exception ex){
             System.out.println(ex);
             return false;
         }
         return estado;
     }

    public static void esperar(int segundos){
        try{
            DriverContext.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(segundos));
        } catch (Exception e ){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static void esperar2(int segundos){
        try{
            Thread.sleep(segundos*1000);
        } catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static void esperaElemento(WebElement element, int segundos){
        try {
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(segundos));
            // Usamos la espera explícita bajo una condiciones esperada, en este caso esperamos hasta que el elemento sea visble
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e){
            System.out.println("falla espera");
        }
    }

    /** Scroll **/
    public static void scrollWebElement(WebElement elemento){
        try{
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("arguments[0].scrollIntoView();", elemento);
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    public static void scrollHastaAbajo(){
        try{
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    public static void scrollHorizontalElement(WebElement elemento){
        try{
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("arguments[0].scrollIntoView();", elemento);
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }

    public static void scrollUpVertical(){
        try{
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("window.scrollBy(0,-1000)");
        } catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}
