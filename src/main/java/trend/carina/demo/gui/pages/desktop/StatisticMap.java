package trend.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import trend.carina.demo.gui.pages.common.StatisticMapPageBase;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = StatisticMapPageBase.class)
public class StatisticMap extends StatisticMapPageBase {
    public StatisticMap(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/main/form/button[1]")
    private ExtendedWebElement submitBtn;

    @FindBy(xpath = "/html/body/main/form/button[2]")
    private ExtendedWebElement clearOrdersBtn;

    @Override
    public void clickSubmit() {
        submitBtn.scrollTo();
        submitBtn.click();
    }

    @Override
    public void clickClearOrders() {
        clearOrdersBtn.scrollTo();
        clearOrdersBtn.click();
    }

    @Override
    public boolean isOpened() {
        return true;
    }
}
