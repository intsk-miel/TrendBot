package trend.carina.demo.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class OrdersPageBase extends SmBotPageBase {

    public OrdersPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickStatisticOfOrders();

    public abstract void clickStatisticMap();

    public abstract void clickCreateNewOrder();

}
