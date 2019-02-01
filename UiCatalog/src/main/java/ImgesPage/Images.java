package ImgesPage;


import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Images extends Base {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Images\"]")
    public static WebElement findImages;
    public void getImages() {
        findImages.click();
        String Actual=ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Duration\"]")).getText();
        String Expected="Duration";
        System.out.println(Actual);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Use of UIImageView\"]")
    public static WebElement uiImageView;
    public void getUiImage(){
        uiImageView.click();
    }
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[7]")
    WebElement moreInfo;
    public void moreInfo7(){
        moreInfo.click();

    }

}
