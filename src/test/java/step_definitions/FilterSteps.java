package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.example.pageObject.ProductPage;
import org.openqa.selenium.WebDriver;

public class FilterSteps {
    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);

    @And("Verify Sauce Labs Onesia is displayed on Low to High filter")
    public void verifySauceLabsOnesiaIsDisplayedOnLowToHighFilter() {
        productPage.verifysaucelabsonesieindisplayedonlowtoprice();
    }

    @And("Verify Sauce Labs Fleece is displayed on High to Low filter")
    public void verifySauceLabsFleeceIsDisplayedOnHighToLowFilter() {
        productPage.verifysaucelabsfleecejacketindisplayed();
    }
}
