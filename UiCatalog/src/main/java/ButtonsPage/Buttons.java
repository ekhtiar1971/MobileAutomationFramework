package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {

    public void checkUIButton(){
        clickByXpath("/XCUIElementTypeStaticText[@name=\"Contact Add\"]");
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Background Image\"]")
    public static WebElement backgroundImage;
    public void checkBackgroundImage(){
        backgroundImage.click();
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buttons\"]")
    public static WebElement buttonTest;
    public void buttonTesting(){
        buttonTest.click();
    }
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[1]")
    public static WebElement findMoreInfo;
    public void getMoreInfo(){
        findMoreInfo.click();
    }


}
