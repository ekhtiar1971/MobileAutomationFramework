package AlertsPage;

import common.Base;

/**
 * Created by mrahman on 1/15/17.
 */
public class Alerts extends Base {
    public void showActionSheetSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]");
    }
    public void showActionSheetOkCancel(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]");
    }
    public void showActionSheetCustom(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Customized\"]");
    }
    public void showAlertSimple() {
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]");
    }
    public void showAlertOkCancel(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[9]");
    }
    public void showAlertCustom() {
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[11]");
    }
    public void showSecureTextInput(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]");
    }
    public void uiActionSheet2(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"UIActionSheet\"])[2]");
    }
    public void uiActionSheet3(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"UIActionSheet\"])[3]");
    }
    public void uiAlertView1(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"UIAlertView\"])[1]");
    }
}
