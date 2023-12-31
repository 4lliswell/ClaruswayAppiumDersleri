package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver webdriver) {
        driver = webdriver;
    }

    By popupText = By.id("trendyol.com:id/textViewTooltipTitle");
    By popupCloseButton = By.id("trendyol.com:id/imageViewTooltipClose");
    By searchBar = By.id("trendyol.com:id/edittext_search_view");


    public String getTextPopupText() {
        return driver.findElement(popupText).getText();
    }

    public void clickPopupCloseButton() {
        driver.findElement(popupCloseButton).click();
    }

    public void clickSearchBar() {
        driver.findElement(searchBar).click();
    }
}
