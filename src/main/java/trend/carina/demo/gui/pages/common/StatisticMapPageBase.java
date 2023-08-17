package trend.carina.demo.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class StatisticMapPageBase extends SmBotPageBase {

    public StatisticMapPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickSubmit();

    public abstract void clickClearOrders();
}
