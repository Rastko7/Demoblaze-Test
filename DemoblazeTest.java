package test.Demoblaze;

import base.Demoblaze.com.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.Demoblaze.DemoblazeHomepage;

import java.awt.*;
import java.util.Random;

public class DemoblazeTest extends BaseTest {

    DemoblazeHomepage demoblazeHomepage;

    Random random = new Random();
    String testName = "NekoIme" + random.nextInt(10000);
    String testEmail = testName + "@mailinator.com";
    String message = "Number 42 is, in Douglas Adams' Hitchhiker's Guide to the Galaxy, " +
            "\"The Answer to the Ultimate Question of Life, the Universe, and Everything," +
            "\" computed by a huge supercomputer called Deep Thought over a period of 7.5 million years.";

    @Before
    public void SetupTest(){
        demoblazeHomepage = new DemoblazeHomepage();



    }


    @Test
    public void DemoblazeTest(){
        demoblazeHomepage.contactButtonClick()
                .contactEmailInputFieldSendKeys(testEmail)
                .contactNameInputFieldSendKeys(testName)
                .messageInputFieldSendKeys(message)
                .sendMessageButtonClick();
        driver.switchTo().alert().accept();


    }

}
