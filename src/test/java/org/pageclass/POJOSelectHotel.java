package org.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.BaseClass;

public class POJOSelectHotel extends BaseClass{

	public POJOSelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectBt;
	
	@FindBy(id="continue")
	private WebElement continueBt;
	


	public WebElement getSelectBt() {
		return selectBt;
	}



	public WebElement getContinueBt() {
		return continueBt;
	}

}
