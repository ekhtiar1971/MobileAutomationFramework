package ImgesPage;


import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Images extends Base {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Images\"]")
    public static WebElement findImages;
    public void getImages(){
        findImages.click();
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Use of UIImageView\"]")
    public static WebElement uiImageView;
    public void getUiImage(){
        uiImageView.click();
    }

}
