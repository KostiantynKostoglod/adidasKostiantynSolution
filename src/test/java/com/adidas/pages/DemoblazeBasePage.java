package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DemoblazeBasePage {

    public DemoblazeBasePage(){
PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='list-group']/a[2]")
    public WebElement phoneModule;

    @FindBy(xpath = "//div[@class='list-group']/a[3]")
    public WebElement laptopModule;

    @FindBy(xpath = "//div[@class='list-group']/a[4]")
    public WebElement monitorModule;





}
