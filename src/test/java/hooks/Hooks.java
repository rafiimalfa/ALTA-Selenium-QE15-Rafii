package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Hooks {
    public static WebDriver driver;

    public static EdgeOptions GenerateEdgeDriver() {
       EdgeOptions options = new EdgeOptions();
        options.addArguments("--no-sandbox",
                "--single-process",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
//                            , "headless"
        );
        return options;
    }


    @Before
    public void openBrowser(){
        //inisiasi library selenium
//        driver = new ChromeDriver(GenerateDriverChrome());
//        driver = new EdgeDriver(GenerateEdgeDriver());
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--no-sandbox",
//                "--single-process" ini yang bikin error
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
//                            , "headless"
        );
        driver = new ChromeDriver();
        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl);//fungsi untuk ngebuka link html
        driver.manage().window().maximize();//fungsi untuk maximize browser
    }

    @After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}

