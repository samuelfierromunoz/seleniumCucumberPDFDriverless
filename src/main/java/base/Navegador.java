package base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {

    public static void Chrome_Launch(String url) {
        WebDriver driver;
        String srcDriver ="driverNavegador/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", srcDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        DriverContext.setDriver(driver);
    }

    public static void ChromeDriverLess(String url) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        DriverContext.setDriver(driver);
    }

    public static void closeNav(){
        DriverContext.getDriver().quit();
    }
}
