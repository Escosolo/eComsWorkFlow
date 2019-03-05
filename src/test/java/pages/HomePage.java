package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how = How.LINK_TEXT, using="Contact us")
    public static WebElement contact_us;

    @FindBy(how = How.LINK_TEXT, using="Sign in")
    public static WebElement Sign_in;

    @FindBy(how = How.LINK_TEXT, using="search_query")
    public static WebElement Searchbox;

    @FindBy(how = How.LINK_TEXT, using="submit_search")
    public static WebElement SearchIcon;

    @FindBy(how = How.XPATH, using= " //*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b\n")
    public static WebElement cart;


    public void click_contact_us() {
        contact_us.click();
    }
        public void click_Sign_in(){
            Sign_in.click();
    }



}
