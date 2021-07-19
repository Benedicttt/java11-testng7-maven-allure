package gui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

//Super method PageObject with Selenide
public class HeaderOneTypePage {
    @FindBy(css = "#main-header")
    public SelenideElement headerBlock;

    @FindBy(css = ".et_pb_module_header")
    public SelenideElement title;
}
