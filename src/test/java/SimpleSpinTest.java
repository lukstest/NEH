import common.BaseTest;
import org.testng.annotations.Test;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class SimpleSpinTest extends BaseTest{

    @Test
    public void betContainerShouldBeVisible() {
        BasePage basePage = open("", BasePage.class);
        basePage.betContainer.isDisplayed();
    }


}
