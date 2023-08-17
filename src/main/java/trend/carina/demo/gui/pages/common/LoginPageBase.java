package trend.carina.demo.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends SmBotPageBase {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUser(String user);

    public abstract void typePassword(String password);

    public abstract OrdersPageBase clickLoginBtn();


}
