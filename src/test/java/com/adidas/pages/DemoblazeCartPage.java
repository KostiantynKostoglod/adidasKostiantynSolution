package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoblazeCartPage {
    public DemoblazeCartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cartBtn;

    @FindBy(xpath = "//table/tbody//td[2]")
    public List<WebElement> productName;

@FindBy(xpath = "//table/tbody//td[4]/a")
    public List<WebElement> deleteFunction;

@FindBy (xpath = "//button[.='Place Order']")
    public WebElement placeOrderBtn;


@FindBy(xpath = "//div[@id='orderModal']//form//input")
public List<WebElement> placeOrderForm;

@FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseBtn;

@FindBy(xpath = "//div/p[@class='lead text-muted ']")
    public WebElement confirmTable;

@FindBy(xpath = "//li/a[@href='index.html']")
    public WebElement homeBtn;

@FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    public WebElement okBtn;
}