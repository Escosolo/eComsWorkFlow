package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {
    @FindBy(how = How.ID, using= "email")
    public static WebElement myemail;

    @FindBy(how = How.ID, using= "passwd")
    public static WebElement mypass;

    @FindBy(how = How.LINK_TEXT, using= "Forgot your password?")
    public static WebElement forgotpassword;

    @FindBy(how = How.ID, using= "SubmitLogin")
    public static WebElement loginbtn;

    @FindBy(how = How.CSS, using= "ol > li")
    public static WebElement login_error_message;

    public void enter_email_address(String email) {
        myemail.sendKeys(email);
    }

        public void enter_password(String passwd) {
            mypass.sendKeys(passwd);
        }

        public void click_login_button() {
            loginbtn.click();
        }

               public void I_see_login_error_message(String errormessage){
                Assert.assertEquals(errormessage, login_error_message.getText());
            }
    }




