package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.proj.basic.Elements;
import com.proj.Util.utilities;

public class AmazonHomePage {
	private WebDriver driver;
	private WebElement searchBar;
	private WebElement goToSearch;
	private static final String filePath="D:\\Workspaces\\Eclipse_New\\Selenium\\addToCart\\ObjectLocators\\AmezoneHomePage.xlsx";
	public void setSearchBar() throws Exception {
		this.searchBar = Elements.locateElement(this.driver, AmazonHomePage.filePath, "SearchBar");
	}

	public void setGoToSearch() throws Exception {
		this.goToSearch = Elements.locateElement(this.driver, AmazonHomePage.filePath, "GoToSearch");
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getGoToSearch() {
		return goToSearch;
	}

	public AmazonHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.get(utilities.getProperties("URL"));
	}
	
	public void enterTextInSearchBar(String searchText) {
		try {
			this.setSearchBar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchBar.sendKeys(searchText);
	}
	
	public void performSearch() {
		try {
			this.setGoToSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.goToSearch.click();
	}
}
