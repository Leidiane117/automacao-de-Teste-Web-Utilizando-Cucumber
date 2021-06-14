package report;

import driver.Driver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Report extends Driver {

    @Attachment(value = "Page Screenshot", type = "image/png")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    }


}


