package com.adidas.stedDefs;

import com.adidas.pages.DemoblazeBasePage;
import com.adidas.pages.DemoblazeCartPage;
import com.adidas.pages.DemoblazeLaptopModulePage;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;

public class DemoblazwStepDefs {
    DemoblazeBasePage demoblazeBasePage = new DemoblazeBasePage();
    DemoblazeLaptopModulePage demoblazeLaptopModulePage = new DemoblazeLaptopModulePage();
    DemoblazeCartPage demoblazeCartPage = new DemoblazeCartPage();


    @Given("user is on main page, user goes to Phones, user goes to Laptops, user goes to Monitors")
    public void user_is_on_main_page_user_goes_to_phones_user_goes_to_laptops_user_goes_to_monitors() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitFor(1);
        demoblazeBasePage.phoneModule.click();
        BrowserUtils.waitFor(1);
        demoblazeBasePage.laptopModule.click();
        BrowserUtils.waitFor(1);
        demoblazeBasePage.monitorModule.click();
        BrowserUtils.waitFor(1);
    }

    @When("user goes to {string}, user adds {string} to cart and user adds {string} to cart, accepts pop-up confirmation")
    public void userGoesToUserAddsToCartAndUserAddsToCartAcceptsPopUpConfirmation(String arg0, String arg1, String arg2) {
        demoblazeBasePage.laptopModule.click();
        demoblazeLaptopModulePage.sonyVaioi5.click();
        demoblazeLaptopModulePage.sonyVaioi5AddToCart.click();
        BrowserUtils.waitFor(1);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        demoblazeCartPage.homeBtn.click();
        demoblazeBasePage.laptopModule.click();
        demoblazeLaptopModulePage.delli78gb.click();
        demoblazeLaptopModulePage.delli78gbAddToCart.click();
        BrowserUtils.waitFor(1);
        Alert alert1 = Driver.getDriver().switchTo().alert();
        alert1.accept();
    }


    @And("user goes to cart, user deletes {string} from cart")
    public void userGoesToCartUserDeletesFromCart(String arg0) {
        demoblazeCartPage.cartBtn.click();
        BrowserUtils.waitFor(1);
        for (int i = 0; i < demoblazeCartPage.productName.size(); i++) {
            if (demoblazeCartPage.productName.get(i).getText().equals(arg0)) {
                demoblazeCartPage.deleteFunction.get(i).click();
                BrowserUtils.waitFor(1);

            }
        }
    }


    @And("user fills all info fields and places order, user clicks purchase button")
    public void userFillsAllInfoFieldsAndPlacesOrderUserClicksPurchaseButton(List<String> credentials) {
        demoblazeCartPage.placeOrderBtn.click();
        BrowserUtils.waitFor(1);

        for (int i = 0; i < demoblazeCartPage.placeOrderForm.size(); i++) {
    demoblazeCartPage.placeOrderForm.get(i).sendKeys(credentials.get(i));
        }
        BrowserUtils.waitFor(1);
        demoblazeCartPage.purchaseBtn.click();
    }

    @And("user sees purchase amount {string} and price {string}")
    public void userSeesPurchaseAmountAndPrice(String arg0, String arg1) {
        String res = demoblazeCartPage.confirmTable.getText();
        System.out.println(res);
    }

    @Then("user clicks OK and sees home page")
    public void userClicksOKAndSeesHomePage() {
        BrowserUtils.waitFor(1);
demoblazeCartPage.okBtn.click();
        BrowserUtils.waitFor(1);
        Assert.assertEquals(Driver.getDriver().getTitle(), "STORE");
    }
}
