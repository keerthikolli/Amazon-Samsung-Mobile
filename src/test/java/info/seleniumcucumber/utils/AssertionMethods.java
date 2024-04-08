package info.seleniumcucumber.utils;

import info.seleniumcucumber.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class AssertionMethods extends AbstractPage implements BaseTest {
    // This file contains assertion methods which are called from
    // predefinedStepDefinitions

    private final SelectElementByType selectElementByType = new SelectElementByType();
    // SelectElementByType eleType= new SelectElementByType();
    private WebElement element = null;

    /**
     * Method to get page title
     *
     * @return String
     */
    public String getPageTitle() {
        return getDriver().getTitle();
    }

    /**
     * Method to verify page title
     *
     * @param title    : String : expected title
     * @param testCase : Boolean : test case [true or false]
     */
    public void checkTitle(String title, boolean testCase) throws TestCaseFailed {
        String pageTitle = getPageTitle();

        if (testCase) {
            if (!pageTitle.equals(title))
                throw new TestCaseFailed("Page Title Not Matched, Actual Page Title : " + pageTitle);
        } else {
            if (pageTitle.equals(title))
                throw new TestCaseFailed("Page Title Matched, Actual Page Title : " + pageTitle);
        }
    }

    /**
     * Method to verify partial page title
     *
     * @param partialTitle : String : partial title string
     * @param testCase     : Boolean : test case [true or false]
     */
    public void checkPartialTitle(String partialTitle, boolean testCase) throws TestCaseFailed {
        String pageTitle = getPageTitle();
        if (testCase) {
            if (!pageTitle.contains(partialTitle))
                throw new TestCaseFailed("Partial Page Title Not Present, Actual Page Title : " + pageTitle);
        } else {
            if (pageTitle.contains(partialTitle))
                throw new TestCaseFailed("Partial Page Title Present, Actual Page Title : " + pageTitle);
        }
    }

    /**
     * Method to get element text
     *
     * @param accessType : String : Locator type (id, name, class, xpath, css)
     * @param accessName : String : Locator value
     * @return String
     */
    public String getElementText(String accessType, String accessName) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(accessType, accessName)));
        return element.getText();

    }

    /**
     * Method to check element text
     *
     * @param accessType  : String : Locator type (id, name, class, xpath, css)
     * @param actualValue : String : Expected element text
     * @param accessName  : String : Locator value
     * @param testCase    : Boolean : test case [true or false]
     */
    public void checkElementText(String accessType, String actualValue, String accessName, boolean testCase)
            throws TestCaseFailed {
        String elementText = getElementText(accessType, accessName);

        if (testCase) {
            if (!elementText.equals(actualValue))
                throw new TestCaseFailed("Text Not Matched");
        } else {
            if (elementText.equals(actualValue))
                throw new TestCaseFailed("Text Matched");
        }
    }

    /**
     * Method to check partial element text
     *
     * @param accessType  : String : Locator type (id, name, class, xpath, css)
     * @param actualValue : String : Expected element text
     * @param accessName  : String : Locator value
     * @param testCase    : Boolean : test case [true or false]
     */
    public void checkElementPartialText(String accessType, String actualValue, String accessName, boolean testCase)
            throws TestCaseFailed {
        String elementText = getElementText(accessType, accessName);

        if (testCase) {
            if (!elementText.contains(actualValue))
                throw new TestCaseFailed("Text Not Matched");
        } else {
            if (elementText.contains(actualValue))
                throw new TestCaseFailed("Text Matched");
        }
    }

    /**
     * Method to return element status - enabled?
     *
     * @param accessType : String : Locator type (id, name, class, xpath, css)
     * @param accessName : String : Locator value
     * @return Boolean
     */
    public boolean isElementEnabled(String accessType, String accessName) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(accessType, accessName)));
        return element.isEnabled();
    }

    /**
     * Element enabled checking
     *
     * @param accessType : String : Locator type (id, name, class, xpath, css)
     * @param accessName : String : Locator value
     * @param testCase   : Boolean : test case [true or false]
     */
    public void checkElementEnable(String accessType, String accessName, boolean testCase) throws TestCaseFailed {
        boolean result = isElementEnabled(accessType, accessName);
        if (testCase) {
            if (!result)
                throw new TestCaseFailed("Element Not Enabled");
        } else {
            if (result)
                throw new TestCaseFailed("Element Enabled");
        }
    }

    /**
     * method to get attribute value
     *
     * @param accessType    : String : Locator type (id, name, class, xpath, css)
     * @param accessName    : String : Locator value
     * @param attributeName : String : attribute name
     * @return String
     */
    public String getElementAttribute(String accessType, String accessName, String attributeName) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(accessType, accessName)));
        return element.getAttribute(attributeName);
    }

    /**
     * method to check attribute value
     *
     * @param accessType     : String : Locator type (id, name, class, xpath, css)
     * @param attributeName  : String : attribute name
     * @param attributeValue : String : attribute value
     * @param accessName     : String : Locator value
     * @param testCase       : Boolean : test case [true or false]
     */
    public void checkElementAttribute(String accessType, String attributeName, String attributeValue, String accessName,
                                      boolean testCase) throws TestCaseFailed {
        String attrVal = getElementAttribute(accessType, accessName, attributeName);
        if (testCase) {
            if (!attrVal.equals(attributeValue))
                throw new TestCaseFailed("Attribute Value Not Matched");
        } else {
            if (attrVal.equals(attributeValue))
                throw new TestCaseFailed("Attribute Value Matched");
        }
    }














}
