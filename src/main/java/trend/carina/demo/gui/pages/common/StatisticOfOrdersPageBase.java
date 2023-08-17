package trend.carina.demo.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class StatisticOfOrdersPageBase extends SmBotPageBase {

    public StatisticOfOrdersPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void checkRejected();

    public abstract void checkClosed();

    public abstract void checkFailed();

    public abstract void clickResetForm();

}
