import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BetContainer {
    @FindBy(id = "spinButton")
    private SelenideElement spinButton;

    @FindBy(id = "betSpinDown")
    private SelenideElement spinDown;

    @FindBy(id = "betSpinUp")
    private SelenideElement spinUp;

}
