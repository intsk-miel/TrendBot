package trend.carina.demo;

import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;
import trend.carina.demo.gui.Utils.AbstractSmBotTest;
import trend.carina.demo.gui.pages.common.LoginPageBase;
import trend.carina.demo.gui.pages.common.OrdersPageBase;
import trend.carina.demo.gui.pages.common.SmBotPageBase;
import trend.carina.demo.gui.pages.desktop.StatisticMap;
import trend.carina.demo.gui.pages.desktop.StatisticOfOrders;

public class SmBotTest extends AbstractSmBotTest {

    @Test
    public void loginTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.open();
        Assert.assertTrue(loginPage.isOpened(), "Login page is not opened");
        loginPage.typeUser(R.TESTDATA.get("user"));
        loginPage.typePassword(R.TESTDATA.get("password"));
        OrdersPageBase ordersPage = loginPage.clickLoginBtn();
        Assert.assertTrue(ordersPage.isOpened(), "Orders page is not opened");
    }

    @Test
    public void ordersStatisticTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.open();
        SmBotPageBase sm = authenticationService.loginUser();
        Assert.assertTrue(sm.isOpened(), "Orders page is not opened");
        OrdersPageBase ordersPage = initPage(getDriver(), OrdersPageBase.class);
        ordersPage.clickStatisticOfOrders();
        StatisticOfOrders statisticOfOrders = new StatisticOfOrders(getDriver());
        Assert.assertTrue(statisticOfOrders.isOpened(), "Statistic of orders page is not opened");
        statisticOfOrders.checkClosed();
        statisticOfOrders.clickResetForm();
        statisticOfOrders.checkFailed();
    }

    @Test
    public void statisticMapTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.open();
        SmBotPageBase sm = authenticationService.loginUser();
        Assert.assertTrue(sm.isOpened(), "Orders page is not opened");
        OrdersPageBase ordersPage = initPage(getDriver(), OrdersPageBase.class);
        ordersPage.clickStatisticMap();
        StatisticMap statisticMap = new StatisticMap(getDriver());
        Assert.assertTrue(statisticMap.isOpened(), "Statistic map page is not opened");
        statisticMap.clickClearOrders();
    }
}
