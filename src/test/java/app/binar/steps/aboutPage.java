package app.binar.steps;

import app.binar.driverManager;
import app.binar.pages.homePage;
import io.cucumber.java.en.And;

public class aboutPage {
    @And("user click Burger button")
    public void user_click_Burger_Button() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.TapBurgerButton();
    }
    @And("user click about menu")
    public void user_click_about() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.TapAboutMenu();
    }
    @And("verify about page access successfully")
    public void verify_aboutpage_successfully() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.verifySuccessAboutPage();
    }
}
