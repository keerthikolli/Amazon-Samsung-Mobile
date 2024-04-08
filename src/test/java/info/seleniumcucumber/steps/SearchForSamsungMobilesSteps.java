package info.seleniumcucumber.steps;

import info.seleniumcucumber.pages.AbstractPage;
import info.seleniumcucumber.pages.AmazonHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class SearchForSamsungMobilesSteps extends AbstractPage {

    @Given("^I navigate to \"([^\"]*)\"$")
    public void navigate_to(String link) {
        navigationObj.navigateTo(link);
    }

    @And("I select samsung mobiles")
    public void iNavigateToSamsungMobiles() throws NoSuchFieldException, IOException {
        final AmazonHomePage homePage = new AmazonHomePage();

        homePage.getAllMenuBtn().click();

        homePage.getElectronicsComputers().click();
        homePage.ClickAction();
        homePage.getSmartPhones().click();
        navigationObj.scrollToElement(homePage.getSamsungBrand());
        homePage.getSamsungBrandClick();

    }


    @When("I click on search button")
    public void iClickOnSearchButton() throws NoSuchFieldException {
        final AmazonHomePage searPage = new AmazonHomePage();
        searPage.getGOBtn().click();
    }

    @Then("I should able to view list of mobiles")
    public void iShouldAbleToViewListOfMobiles() throws NoSuchFieldException {
        final AmazonHomePage searchPage = new AmazonHomePage();
        List<WebElement> listOfMobiles = searchPage.getlistOfMobiles();
    }

    @Then("I add camera , model and price range requirements")
    public void iAddCameraModelAndPriceRangeRequirements() throws NoSuchFieldException {
        final AmazonHomePage filterPage = new AmazonHomePage();
        navigationObj.scrollToElement(filterPage.getModelYear());
        filterPage.getModelYearClick();
        navigationObj.scrollToElement(filterPage.getCameraResolution());
        filterPage.getCameraResolutionClick();
        filterPage.getMinPrice().sendKeys("50");
        filterPage.getMaxPrice().sendKeys("100");
    }
}
