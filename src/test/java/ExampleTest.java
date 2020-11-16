import helpers.TestConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest extends A_BaseTest
{
    @Test
    public void loginViaEmail() {
        app.loginPage.open();
        app.loginPage.login("tomsmith", "SuperSecretPassword!");


        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");

        softAssert.assertEquals(2,2);
        softAssert.assertAll();
    }
    @Test
    public void tsadas () {
        System.out.println("Test123");
        Assert.assertEquals(5, 4);
    }
}
