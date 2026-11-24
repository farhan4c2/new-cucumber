package org.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.BaseClass;

public class POJOSearchHotel extends BaseClass {

	public POJOSearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement totalRoom;
	
	@FindBy(id="datepick_in")
	private WebElement chkIn;
	
	@FindBy(id="datepick_out")
	private WebElement chkOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement searchBt;

	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getTotalRoom() {
		return totalRoom;
	}

	public WebElement getChkIn() {
		return chkIn;
	}

	public WebElement getChkOut() {
		return chkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchBt() {
		return searchBt;
	}
}
