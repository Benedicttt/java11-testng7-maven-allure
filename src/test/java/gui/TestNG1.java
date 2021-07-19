package gui;

import core.BaseDriver;
import core.BaseMethods;
import gui.pages.HeaderOneTypePage;
import gui.pages.HeaderTwoTypePage;
import helpers.Print;
import helpers.Property;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static core.BaseMethods.*;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class TestNG1 extends BaseDriver implements BaseMethods {
    String baseUrl = baseUrl();

    public TestNG1() throws IOException {
    }

    @Test
    public void openingPage() throws IOException {
        Print.i(baseUrl);
        open(baseUrl);

        assertEquals(currentUrl(), baseUrl);
    }

    @Test
    public void checkingHeader() throws IOException {
        open(baseUrl);
        HeaderTwoTypePage page = PageFactory.initElements(currentDriver(), HeaderTwoTypePage.class);

        assertFalse(page.headerBlock().exists());
    }

    @Test
    public void checkingHeaderExist() throws IOException {
        HeaderOneTypePage page = open(baseUrl(), HeaderOneTypePage.class);

        assertFalse(page.headerBlock.exists());
    }

    @Test
    @Parameters("baseUrl")
    public void checkingHeaderTitle() {
        HeaderOneTypePage page = open(baseUrl, HeaderOneTypePage.class);

        assertEquals(page.title.getText(), "Automation Practice");
    }
}