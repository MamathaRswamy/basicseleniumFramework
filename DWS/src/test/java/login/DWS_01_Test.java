package login;

import org.testng.annotations.Test;

import generics.BaseClass;

public class DWS_01_Test extends BaseClass {
	@Test
public void Login_With_valid_credentials() {
	login.getLoginLink().click();
	login.getEmailTextField().sendKeys("demo@gmail.com");
	login.getPasswordTextField().sendKeys("********");
	login.getLoginButton().click();
}
}
