package trend.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import trend.carina.demo.gui.pages.common.LoginPageBase;
import trend.carina.demo.gui.pages.common.OrdersPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
    private ExtendedWebElement userField;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
    private ExtendedWebElement passwordField;

    @FindBy(css = "body > form > table > tbody > tr:nth-child(3) > td > input[type=submit]")
    private ExtendedWebElement loginBtn;

    @Override
    public void typeUser(String user) {
        userField.type(user);
    }

    @Override
    public void typePassword(String password) {
        passwordField.type(password);
    }

    @Override
    public OrdersPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), OrdersPageBase.class);
    }

    @Override
    public boolean isOpened() {
        return userField.isElementPresent();
    }
}
