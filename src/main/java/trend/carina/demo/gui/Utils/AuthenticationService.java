package trend.carina.demo.gui.Utils;

import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import trend.carina.demo.gui.pages.common.LoginPageBase;
import trend.carina.demo.gui.pages.common.OrdersPageBase;
import trend.carina.demo.gui.pages.common.SmBotPageBase;

public class AuthenticationService extends AbstractTest {

    private SmBotPageBase login(String user, String password) {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        Assert.assertTrue(loginPage.isOpened(), "Login page is not opened");
        loginPage.typeUser(R.TESTDATA.get(user));
        loginPage.typePassword(R.TESTDATA.get(password));
        OrdersPageBase ordersPage = loginPage.clickLoginBtn();
        Assert.assertTrue(ordersPage.isOpened(), "Orders page is not opened");
        return ordersPage;
    }

    public SmBotPageBase loginUser() {
        return login("user", "password");
    }
}
