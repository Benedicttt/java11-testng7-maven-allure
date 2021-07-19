package core;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static helpers.Property.getProperty;

public interface BaseMethods {
    static String baseUrl() throws IOException { return getProperty("baseUrl"); }
    static String currentUrl() { return WebDriverRunner.getWebDriver().getCurrentUrl(); }
    static WebDriver currentDriver() { return WebDriverRunner.getWebDriver(); }
}
