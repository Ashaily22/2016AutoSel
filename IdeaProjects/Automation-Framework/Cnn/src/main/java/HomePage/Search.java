package HomePage;

import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Shaily on 4/27/2016.
 */
public class Search extends Base {

   @Test
    public void searchNews() throws InterruptedException {
        clickOnCSS("#search-button");
       Thread.sleep(30000);
        typeOnCSS("#search-input-field","politics");
        Thread.sleep(30000);
    }
    //mmjbkgjbn
    //jnjnbnb
}
