package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "checkout")
    private WebElement btnCheckout;
    @FindBy(id = "remove-sauce-labs-onesie")
    private WebElement btnremovesaucelabsonesie;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement btnremoveredtshirt;
    @FindBy(id = "continue-shopping")
    private WebElement btncontinueshopping;
    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement redthirttitle;
    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement saucelabsonesietitle;



    public void clickCheckout(){
        waitForElementClickable(btnCheckout);
        click(btnCheckout);
    }
    public void clickbtnremovesaucelabsonesie(){
        waitForElementClickable(btnremovesaucelabsonesie);
        click(btnremovesaucelabsonesie);
    }
    public void clickbtnremoveredtshirt(){
        scrollIntoView(btnremoveredtshirt);
        waitForElementClickable(btnremoveredtshirt);
        click(btnremoveredtshirt);
    }
    public void clickcontiuneshopping(){
        scrollIntoView(btncontinueshopping);
        waitForElementClickable(btncontinueshopping);
        click(btncontinueshopping);
    }
    public boolean verifyredtshirtdisplayedoncartlist(){
        return isDisplayed(redthirttitle);
    }
    public boolean verifysaucelabsonesiedisplayedoncartlist(){
        return isDisplayed(saucelabsonesietitle);
    }

}
