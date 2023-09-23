package register;

import org.testng.annotations.Test;

import generics.BaseClass;

public class DWS_10_Test extends BaseClass{
	@Test
public void registering_The_User() throws InterruptedException {
	register.getRegisterLink().click();
	register.getGenderRadioButton().click();
	register.getLastnameTextfield().sendKeys("12323434");
	register.getFirstnameTF().sendKeys("selenium");
	register.getEmailTextfield().sendKeys("demo@gmail.com");
	register.getPasswordTextfield().sendKeys("*************");
	register.getConfirmPasswordTF().sendKeys("**************");
	Thread.sleep(1000);
	register.getRegisterButton().click();
	Thread.sleep(1000);

}
}
