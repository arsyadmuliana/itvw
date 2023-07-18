package co.nvqa.interview.ui_pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class NinjaPointPage {

  private static final String URL = "https://point-qa.ninjavan.co/";
  protected ChromeDriver driver;

  public NinjaPointPage(ChromeDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void openPage() {
    // implement open page here
    driver.navigate().to(URL);
  }

  public void doLogin(String username, String password) {
    //Start Here
  }

}
