import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", path + "/lib/geckodriver/geckodriver.exe");
        System.out.println("Hello\n");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.org");
        driver.quit();
    }
}
