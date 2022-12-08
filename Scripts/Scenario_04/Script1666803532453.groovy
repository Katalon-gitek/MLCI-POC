import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('http://192.168.4.193/newcam_katalon')

WebUI.waitForElementPresent(findTestObject('LoginPage/Logo_Mitsui'), 3)

WebUI.setText(findTestObject('LoginPage/Textfield_Username'), 'Reza_Renika\n')

WebUI.setText(findTestObject('LoginPage/Textfield_Password'), '123')

WebUI.click(findTestObject('LoginPage/Button_Login'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/PopupMinimalDp/Button_Yes'), 5)

WebUI.click(findTestObject('DashboardPage/PopupMinimalDp/Button_Yes'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/Menu_OnHand'), 3)

WebUI.click(findTestObject('DashboardPage/Menu_OnHand'))

WebUI.waitForElementPresent(findTestObject('DashboardPage/Table_List_CAM'), 10)

WebDriver driver = DriverFactory.getWebDriver()

driver.switchTo().frame(0)

WebElement tableCAM = driver.findElement(By.cssSelector('body > form:nth-child(1) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > form:nth-child(1) > table:nth-child(1) > tbody:nth-child(1)'))

List row = tableCAM.findElements(By.tagName('tr'))

String expected = 'I - 13762208012'

for (int x = 1; x < row.size(); x++) {
    WebElement ele = row.get(x)

    WebElement CAM = ele.findElement(By.xpath('td[2]/a/font'))

    println(CAM.getText())

    if (CAM.getText().contains(expected)) {
        println('CAM Ditemukan')

        WebElement el = ele.findElement(By.xpath('td[2]/a/font'))

        el.click()

        break
    }
}

WebUI.delay(3)

String originalWindow = driver.getWindowHandle()

driver.switchTo().frame(0)

WebUI.click(findTestObject('CAMPage/CAMDetailPage/Doc_Link_KTP_Pelanggan'))

WebUI.delay(2)

for (String windowHandle : driver.getWindowHandles()) {
    if (!(originalWindow.contentEquals(windowHandle))) {
        driver.switchTo().window(windowHandle)

        break
    }
}

driver.close()

driver.switchTo().window(originalWindow)

driver.switchTo().frame(0)

WebUI.click(findTestObject('CAMPage/CAMDetailPage/Doc_Link_Kartu_Keluarga_Pelanggan'))

WebUI.delay(2)

for (String windowHandle : driver.getWindowHandles()) {
    if (!(originalWindow.contentEquals(windowHandle))) {
        driver.switchTo().window(windowHandle)

        break
    }
}

driver.close()

driver.switchTo().window(originalWindow)

driver.switchTo().frame(0)

WebUI.click(findTestObject('CAMPage/CAMDetailPage/Doc_Link_KTP_BPKB'))

WebUI.delay(2)

for (String windowHandle : driver.getWindowHandles()) {
    if (!(originalWindow.contentEquals(windowHandle))) {
        driver.switchTo().window(windowHandle)

        break
    }
}

driver.close()

driver.switchTo().window(originalWindow)

driver.switchTo().frame(0)

WebUI.click(findTestObject('CAMPage/CAMDetailPage/Doc_Link_NPWP'))

WebUI.delay(2)

for (String windowHandle : driver.getWindowHandles()) {
    if (!(originalWindow.contentEquals(windowHandle))) {
        driver.switchTo().window(windowHandle)

        break
    }
}

driver.close()

driver.switchTo().window(originalWindow)

driver.switchTo().frame(0)

WebUI.click(findTestObject('CAMPage/CAMDetailPage/Doc_Link_Slip_Gaji'))

WebUI.delay(2)

for (String windowHandle : driver.getWindowHandles()) {
    if (!(originalWindow.contentEquals(windowHandle))) {
        driver.switchTo().window(windowHandle)

        break
    }
}

driver.close()

driver.switchTo().window(originalWindow)

WebUI.click(findTestObject('CAMPage/CAMDetailPage/Logo_Home'))

WebUI.click(findTestObject('DashboardPage/Button_Logout'))

WebUI.closeBrowser()

