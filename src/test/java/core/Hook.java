package core;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hook {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        BaseDriver driverFactory = new BaseDriver();
        driver = driverFactory.getDriver();

        WebDriverRunner.setWebDriver(driver);
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

    //Why am I set @After and before classes?? Because my need open browser and checking all tests in once file, once session.
}
