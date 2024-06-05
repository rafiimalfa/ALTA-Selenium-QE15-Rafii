package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {
    private WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);

    @Then("On the product page verify the saucelabs backpack is displayed")
    public void onTheProductPageVerifyTheSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyTitleProductSauceLabsBackpack());
    }
    @And("Add to cart button saucelabs backpack is displayed")
    public void addToCartButtonSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartSauceLabsBackpack());

    }

    @And("Add to cart saucelabs backpack")
    public void addToCartSaucelabsBackpack() {
    }

    @And("Remove button on the saucelabs backpack is displayed")
    public void removeButtonOnTheSaucelabsBackpackIsDisplayed() {
        Thread.sleep(1000);
        Assert.assertTrue(productPage.verifyRemoveButtonDisplayedOnTheProductSauceLabsBackpack());

    }
}
