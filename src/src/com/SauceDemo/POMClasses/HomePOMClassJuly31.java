package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClassJuly31 {

	private WebDriver driver;
	
	private Select s;
	
	//setting button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement SettingButton;
	
	public void settingButtonClick() {
		SettingButton.click();
	}
	
	//logout button
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement LogoutButton;
	
	public void logoutButtonClick() {
		LogoutButton.click();
		
	}
	
	//Add Product To cart
		//Bag add to cart
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement AddBagToCart;
		
		public void ClickOnAddToCart() {
			AddBagToCart.click();
		}
		
	//Add to cart Select
		@FindBy(xpath="//a[@class='shopping_cart_link']")
	    private WebElement addToCartSelect;
		
		public String GetTextFromAddToCart() {
			String totalProducts = addToCartSelect.getText();
			return totalProducts;
		}
		
		//All product Add to cart
		@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	    private List<WebElement> AllProductAddToCart;
		
		public void ClickAllProduct() {
//			AllProductAddToCart.get(0).click();
//			AllProductAddToCart.get(1).click();
//			AllProductAddToCart.get(2).click();
//			AllProductAddToCart.get(3).click();
//			AllProductAddToCart.get(4).click();
//			AllProductAddToCart.get(5).click();

			for(int i=0;i<AllProductAddToCart.size();i++) {
				AllProductAddToCart.get(i).click();
			}
			
//		    for(WebElement product : AllProductAddToCart) {
//		        product.click();
//		    }
		}
		
		
		//dropdown select
		@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
		private WebElement dropDown;
		
		public void clickOnDropDown(){
			dropDown.click();
			
			s.selectByVisibleText("Text");
		}
	//constructor
	public HomePOMClassJuly31(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
//		s= new Select(dropDown);     //initialized the Select class
	}

}
