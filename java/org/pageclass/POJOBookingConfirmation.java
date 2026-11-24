package org.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.BaseClass;

public class POJOBookingConfirmation extends BaseClass {

	public POJOBookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderid;
	public WebElement getOrderid() {
		return orderid;
	
}
}
