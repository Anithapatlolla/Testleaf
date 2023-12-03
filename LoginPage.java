package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		LoginPage lp =new LoginPage();
		return lp ;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//LoginPage lp =new LoginPage();
		//return lp ;
		return new LoginPage();
		return this;
	}
	
	public WelcomePage clickLoginButton(Object lp) {
		driver.findElement(By.className("decorativeSubmit")).click();
		//WelcomePage wp =new WelcomePage();
		//return wp ;
		return new WelcomePage();
	}

}
;