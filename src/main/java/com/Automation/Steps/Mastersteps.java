package com.Automation.Steps;

import org.openqa.selenium.WebDriver;

import com.Automation.pages.BaseDriverPage;
import com.Automation.pages.Checkoutpage;
import com.Automation.pages.Homepage;
import com.Automation.pages.Letstalkteapage;
import com.Automation.pages.Menupage;
import com.Automation.pages.Ourpassionpage;
import com.Automation.pages.Welcomepage;

public class Mastersteps {

	public  WebDriver testdriver;
	
	public Homepage homepage =null;
	public Checkoutpage checkoutpage =null;
	public Letstalkteapage letstalkteapage=null;
	public Menupage menupage=null;
	public Ourpassionpage ourpassionpage=null;
	public Welcomepage welcomepage=null;
	
	public void getHomepage() {
		homepage =new Homepage(testdriver);
		
	}
	public void getCheckoutpage() {
		checkoutpage=new Checkoutpage(testdriver);
	}
	public void getLetstalkteapage() {
		letstalkteapage=new Letstalkteapage(testdriver);
		
	}
	public void getMenupage() {
		menupage=new Menupage(testdriver);
	}
	public void getOurpassionpage() {
		ourpassionpage=new Ourpassionpage(testdriver);
	}
	public void getWelcomepage() {
		welcomepage=new Welcomepage(testdriver);
	}
	
	public void startDriver() {
		BaseDriverPage bpage = new BaseDriverPage();
		testdriver = bpage.setup();
	}
}