package SearchBarPage;

///**
// * Created by mrahman on 1/15/17.
// */
//public class SearchBar {
//}

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SearchBar\"]")
    public static WebElement SearchBar;
    public void setSearchBar(){
        SearchBar.click();
    }
}
