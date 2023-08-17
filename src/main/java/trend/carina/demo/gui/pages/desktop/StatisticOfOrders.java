package trend.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import trend.carina.demo.gui.pages.common.StatisticOfOrdersPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = StatisticOfOrdersPageBase.class)
public class StatisticOfOrders extends StatisticOfOrdersPageBase {

    public StatisticOfOrders(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"selectedStatuses1\"]")
    private ExtendedWebElement rejected;

    @FindBy(xpath = "//*[@id=\"selectedStatuses2\"]")
    private ExtendedWebElement closed;

    @FindBy(xpath = "//*[@id=\"selectedStatuses3\"]")
    private ExtendedWebElement failed;

    @FindBy(xpath = "//*[@id=\"filter\"]/button")
    private ExtendedWebElement resetFormBtn;

    @Override
    public void checkRejected() {
        rejected.click();
    }

    @Override
    public void checkClosed() {
        closed.click();
    }

    @Override
    public void checkFailed() {
        failed.click();
    }

    @Override
    public void clickResetForm() {
        resetFormBtn.click();
    }

    @Override
    public boolean isOpened() {
        return true;
    }
}
