package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabsBackpack;
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabsBackpack;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToCardSauceLabsBackpack;
    @FindBy(id = "shopping_cart_container")
    private WebElement cart;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement setfilter;
    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement redtshirt;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement btnaddtocartredtshirt;
    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement saucelabsonesie;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement btnaddtocartsaucelabsonesie;

    public boolean verifyTitleProductSauceLabsBackpack(){
        return isDisplayed(titleProductSauceLabsBackpack);
    }
    public boolean verifyRemoveButtonDisplayedOnTheProductSauceLabsBackpack(){
        return isDisplayed(btnRemoveSauceLabsBackpack);
    }
    public void clickRemoveProductSauceLabBackpack(){
        scrollIntoView(btnRemoveSauceLabsBackpack);
        waitForElementClickable(btnRemoveSauceLabsBackpack);
        click(btnRemoveSauceLabsBackpack);
    }
    public boolean verifyAddToCartSauceLabsBackpack(){
        return isDisplayed(btnAddToCardSauceLabsBackpack);
    }
    public void clickAddToCartSauceLabsBackpack(){
        scrollIntoView(btnAddToCardSauceLabsBackpack);
        waitForElementClickable(btnAddToCardSauceLabsBackpack);
        click(btnAddToCardSauceLabsBackpack);
    }
    public void clickCart(){
        waitForElementClickable(cart);
        click(cart);
    }
    public void selectFilter(String filter){
        selectByVisibleText(setfilter, filter);
    }
    public boolean verifysetfilterdisplayed(){
        return isDisplayed(setfilter);
    }


    public boolean verifytitleproductredtshirt(){
        return isDisplayed(redtshirt);
    }
    public void clickbtnaddtocartredtshirt(){
        scrollIntoView(btnaddtocartredtshirt);
        waitForElementClickable(btnaddtocartredtshirt);
        click(btnaddtocartredtshirt);
    }
    public boolean verifytitlesaucelabonesie(){
        return isDisplayed(saucelabsonesie);
    }
    public void clickbtnaddtocartsaucelabsonesie(){
        scrollIntoView(btnaddtocartsaucelabsonesie);
        waitForElementClickable(btnaddtocartsaucelabsonesie);
        click(btnaddtocartsaucelabsonesie);
    }


}
