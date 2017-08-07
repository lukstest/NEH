package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    @FindBy(id = "betContainer")
    public SelenideElement betContainer;
}
