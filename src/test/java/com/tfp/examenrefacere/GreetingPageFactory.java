package com.tfp.examenrefacere;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GreetingPageFactory {

    @FindBy(id = "GreetingID")
    private WebElement GreetingID;

    @FindBy(id = "Description")
    private WebElement Description;

    @FindBy(id = "Price")
    private WebElement Price;

    @FindBy(id = "TypeID")
    private WebElement TypeID;

    @FindBy(id = "CategoryID")
    private WebElement CategoryID;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "success-message")
    private WebElement successMessage;

    public WebElement getGreetingID() {
        return GreetingID;
    }

    public void setGreetingID(WebElement greetingID) {
        GreetingID = greetingID;
    }

    public WebElement getDescription() {
        return Description;
    }

    public void setDescription(WebElement description) {
        Description = description;
    }

    public WebElement getPrice() {
        return Price;
    }

    public void setPrice(WebElement price) {
        Price = price;
    }

    public WebElement getTypeID() {
        return TypeID;
    }

    public void setTypeID(WebElement typeID) {
        TypeID = typeID;
    }

    public WebElement getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(WebElement categoryID) {
        CategoryID = categoryID;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public void setSubmit(WebElement submit) {
        this.submit = submit;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(WebElement successMessage) {
        this.successMessage = successMessage;
    }
}
