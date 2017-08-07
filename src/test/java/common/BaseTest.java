package common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.GlobalTextReport;
import com.codeborne.selenide.testng.ScreenShooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import ru.qatools.properties.PropertyLoader;

import static com.codeborne.selenide.Selenide.close;

public class BaseTest {
    protected TestConfig config = PropertyLoader.newInstance().populate(TestConfig.class);

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext context) {
        System.setProperty("webdriver.chrome.driver", "/Users/lukaszz/Downloads/chromedriver-2");
        WebDriver driver = new ChromeDriver();
        Configuration.baseUrl = config.getBaseURL();
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        close();
    }
}
