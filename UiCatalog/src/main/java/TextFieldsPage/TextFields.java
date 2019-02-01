package TextFieldsPage;

import common.Base;

/**
 * Created by mrahman on 1/15/17.
 */
//public class TextFields extends Base {
//    public void typeOnUiTextField(){
//        typeByXpath("//XCUIElementTypeTextField[@name=\"Normal\"]", "Physician");
//    }
//    public void typeOnUiTextFieldRounded(){
//        typeByXpath("//XCUIElementTypeTextField[@name=\"Rounded\"]", "Tahsan");
//    }
//    public void typeOnUiTextFieldSecure(){
//        typeByXpath("//XCUIElementTypeSecureTextField[@name=\"Secure\"]","Tasneem1234");
//    }
//    public void typeOnUiTextFieldLeftView(){
//        typeByXpath("//XCUIElementTypeStaticText[@name=\"UITextField (with LeftView)\"]", "Secure");
//    }
//
//    public void writeTextToFields()throws InterruptedException{
//        typeOnUiTextField();
//        typeOnUiTextFieldRounded();
//        typeOnUiTextFieldSecure();
//        typeOnUiTextFieldLeftView();
//    }
//}


public class TextFields extends Base {
    public void typeOnUiTextField(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]", "Physician");
    }
    public void typeOnUiTextFieldRounded(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]", "Tahsan");
    }
    public void typeOnUiTextFieldSecure(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]", "Tasneem123");
    }
    public void typeOnUiTextFieldLeftView(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]", "Secure");
    }
    public void writeTextToFields()throws InterruptedException{
        typeOnUiTextField();
        typeOnUiTextFieldRounded();
        typeOnUiTextFieldSecure();
        typeOnUiTextFieldLeftView();
    }
}
