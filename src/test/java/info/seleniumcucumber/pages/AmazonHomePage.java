package info.seleniumcucumber.pages;

import info.seleniumcucumber.annotations.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.sql.Driver;
import java.util.List;

@PageObject
public class AmazonHomePage extends AbstractPage {

    @FindBy(how = How.CSS, using = ".hm-icon")
    private WebElement AllVirticalMenu;

    public WebElement getAllMenuBtn() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(AllVirticalMenu);
        return AllVirticalMenu;
    }

//    @FindBy(how = How.CSS, using = "li:nth-child(20) > .hmenu-item > div")
    @FindBy(how = How.LINK_TEXT, using = "Electronics & Computers")
    private WebElement ElectronicsComputers;

    public WebElement getElectronicsComputers() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(ElectronicsComputers);
        return ElectronicsComputers;
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Phones & Accessories')]")
    private WebElement PhonesAccessories;

        public WebElement getPhonesAccessories() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(PhonesAccessories);
        return PhonesAccessories;
    }

    public void ClickAction(){
        new Actions(driverManager.getDriver())
                .click(PhonesAccessories)
                .perform();
    }

    @FindBy(how = How.LINK_TEXT, using = "SIM-Free")
    private WebElement SmartPhones;

    public WebElement getSmartPhones() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(SmartPhones);
        return SmartPhones;
    }

    @FindBy(how = How.CSS, using = "#p_n_feature_four_browse-bin\\/14210450031 .a-icon")
    private WebElement CameraResolution;

    public WebElement getCameraResolution() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(CameraResolution);
        return CameraResolution;
    }

    public void getCameraResolutionClick(){
        new Actions(driverManager.getDriver())
                .click(CameraResolution)
                .perform();
    }

    @FindBy(how = How.CSS, using = "#p_89\\/Samsung .a-icon")
    private WebElement SamsungBrand;

    public WebElement getSamsungBrand() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(SamsungBrand);
        return SamsungBrand;
    }

    public void getSamsungBrandClick(){
        new Actions(driverManager.getDriver())
                .click(SamsungBrand)
                .perform();
    }

    @FindBy(how = How.ID, using = "low-price")
    private WebElement minPrice;

    public WebElement getMinPrice() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(minPrice);
        return minPrice;
    }

     @FindBy(how = How.ID, using = "high-price")
    private WebElement maxPrice;

    public WebElement getMaxPrice() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(maxPrice);
        return maxPrice;
    }

    @FindBy(how = How.CSS, using = "#p_n_feature_thirteen_browse-bin\\/12421314031 .a-icon")
    private WebElement ModelYear;

    public WebElement getModelYear() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(ModelYear);
        return ModelYear;
    }
    public void getModelYearClick(){
        new Actions(driverManager.getDriver())
                .click(ModelYear)
                .perform();
    }

    @FindBy(how = How.CSS, using = ".a-button-input")
    private WebElement Go;

    public WebElement getGOBtn() throws NoSuchFieldException {
        getDriverWait().waitForElementToLoad(Go);
        return Go;
    }

    @FindAll({@FindBy(how = How.CSS, using = "div.s-result-list div[data-component-type='s-search-result']"),
             @FindBy(how = How.CSS, using = "div.s-main-slot")})
    private List<WebElement> mobileCount;

    public List<WebElement> getlistOfMobiles() throws NoSuchFieldException {
        return mobileCount;
    }


}

