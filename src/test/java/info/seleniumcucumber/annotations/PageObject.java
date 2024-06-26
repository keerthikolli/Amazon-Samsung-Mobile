package info.seleniumcucumber.annotations;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@PageFactoryFinder(FindBy.FindByBuilder.class)

public @interface PageObject {

}
