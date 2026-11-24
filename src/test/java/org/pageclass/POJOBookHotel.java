package org.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.BaseClass;

public class POJOBookHotel extends BaseClass {
	
	public POJOBookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement credCard;
	
	@FindBy(id="cc_type")
	private WebElement credCdType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMon;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccExpYr;
	
	@FindBy(id="cc_cvv")
	private WebElement ccvNum;
	
	@FindBy(id="book_now")
	private WebElement bookBt;

	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredCard() {
		return credCard;
	}

	public WebElement getCredCdType() {
		return credCdType;
	}

	public WebElement getCcExpMon() {
		return ccExpMon;
	}

	public WebElement getCcExpYr() {
		return ccExpYr;
	}

	public WebElement getCcvNum() {
		return ccvNum;
	}

	public WebElement getBookBt() {
		return bookBt;
	}

}
