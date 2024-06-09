package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.example.pageObject.CartPage;
import org.example.pageObject.ProductPage;
import org.openqa.selenium.WebDriver;

public class EtoeSteps {
    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);


    @And("Verify set filter button displayed")
    public void verifySetFilterButtonDisplayed() {
        productPage.verifysetfilterdisplayed();
    }


    @And("Click set filter button {string}")
    public void clickSetFilterButton(String filterZtoA) {
        productPage.selectFilter(filterZtoA);
    }


    @And("Verify Red T-Shirt is displayed")
    public void verifyRedTShirtIsDisplayed() {
        productPage.verifytitleproductredtshirt();
    }

    @And("Click add to cart button red T-Shirt")
    public void clickAddToCartButtonRedTShirt() {
        productPage.clickbtnaddtocartredtshirt();
    }

    @And("Verify Sauce Labs Onesie displayed")
    public void verifySauceLabsOnesieDisplayed() {
        productPage.verifytitlesaucelabonesie();
    }

    @And("Click add to cart button Sauce Labs Onesie")
    public void clickAddToCartButtonSauceLabsOnesie() {
        productPage.clickbtnaddtocartsaucelabsonesie();
    }


    @And("verify Sauce Labs Onesie and Red T=Shirt displayed")
    public void verifySauceLabsOnesieAndRedTShirtDisplayed() {
        cartPage.verifyredtshirtdisplayedoncartlist();
        cartPage.verifysaucelabsonesiedisplayedoncartlist();
    }

    @And("Remove Red T-Shirt")
    public void removeRedTShirt() {
        cartPage.clickbtnremoveredtshirt();
    }

    @And("Click continue Shopping")
    public void clickContinueShopping() {
        cartPage.clickcontiuneshopping();
    }
}
