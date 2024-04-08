package info.seleniumcucumber.utils;

public interface BaseTest {
    MiscMethods miscmethodObj = new MiscMethods();
    NavigateMethods navigationObj = new NavigateMethods();
   AssertionMethods assertionObj = new AssertionMethods();
   ClickElementsMethods clickObj = new ClickElementsMethods();
    InputMethods inputObj = new InputMethods();
    JavascriptHandlingMethods javascriptObj = new JavascriptHandlingMethods();

}
