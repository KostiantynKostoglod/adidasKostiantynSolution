package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoblazeLaptopModulePage {
    public DemoblazeLaptopModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement sonyVaioi5;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement sonyVaioi5AddToCart;

    @FindBy(xpath = "//a[.='Dell i7 8gb']")
    public WebElement delli78gb;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement delli78gbAddToCart;
}
