
package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	public void clickLogoutButton() {
		
	}
	public void verifyLoginPage() {
		WelcomePage wp = new WelcomePage();
		return wp;
		
	}
}
