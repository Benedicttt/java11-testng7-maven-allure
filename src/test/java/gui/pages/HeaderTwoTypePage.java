package gui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

//Classic Page Object with Selenide
public class HeaderTwoTypePage {
    public SelenideElement headerBlock() { return $("#main-header"); }

    public SelenideElement title() { return $(".et_pb_module_header"); }
}
