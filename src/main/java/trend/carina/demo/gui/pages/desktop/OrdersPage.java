package trend.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import trend.carina.demo.gui.pages.common.OrdersPageBase;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = OrdersPageBase.class)
public class OrdersPage extends OrdersPageBase {

    public OrdersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/main/div[1]/a[2]")
    private ExtendedWebElement statisticOfOrdersBtn;

    @FindBy(xpath = "/html/body/main/div[1]/a[3]")
    private ExtendedWebElement statisticMapBtn;

    @FindBy(xpath = "/html/body/main/a[1]")
    private ExtendedWebElement createNewOrderBtn;

    @Override
    public void clickStatisticOfOrders() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        statisticOfOrdersBtn.click();
    }

    @Override
    public void clickStatisticMap() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        statisticMapBtn.click();
    }

    @Override
    public void clickCreateNewOrder() {
        createNewOrderBtn.click();
    }

    @Override
    public boolean isOpened() {
        return true;
    }
}
