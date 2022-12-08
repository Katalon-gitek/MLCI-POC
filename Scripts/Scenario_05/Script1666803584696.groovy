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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('http://192.168.4.193/newcam_katalon')

WebUI.waitForElementPresent(findTestObject('LoginPage/Logo_Mitsui'), 3)

WebUI.setText(findTestObject('LoginPage/Textfield_Username'), 'Dian_Retno')

WebUI.setText(findTestObject('LoginPage/Textfield_Password'), '123')

WebUI.click(findTestObject('LoginPage/Button_Login'))

WebUI.click(findTestObject('DashboardPage/Menu_Master_Data'))

WebUI.delay(1)

WebUI.click(findTestObject('DashboardPage/SubMenu_Sales'))

WebUI.delay(1)

WebUI.click(findTestObject('DashboardPage/SubSubMenu_Sales'))

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

driver.switchTo().frame(driver.findElement(By.id('main1')))

WebUI.click(findTestObject('DashboardPage/Button_Page_283'))

WebUI.delay(2)

String salesName = 'ALESSANDRO HUTAPEAA'

String editedName = 'ALESSANDRO HUTAPEA'

WebElement tableSales = driver.findElement(By.cssSelector('body > form:nth-child(2) > table > tbody > tr:nth-child(3) > td > table > tbody'))

java.util.List row = tableSales.findElements(By.tagName('tr'))

for (int x = 1; x < row.size(); x++) {
    WebElement ele = row.get(x)

    WebElement name = ele.findElement(By.xpath('td[2]'))

    println(name.getText())

    if (name.getText() == salesName) {
        WebElement buttonEdit = ele.findElement(By.xpath('td[5]/input'))

        buttonEdit.click()

        break
    }
}

driver.switchTo().frame(driver.findElement(By.id('submain')))

WebElement nameTextField = driver.findElement(By.cssSelector('body > form > table:nth-child(3) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td.border_format > input[type=text]'))

nameTextField.clear()

nameTextField.sendKeys(editedName)

WebElement updateButton = driver.findElement(By.cssSelector('body > form > table:nth-child(4) > tbody > tr > td.table_button > input[type=submit]:nth-child(1)'))

updateButton.click()

driver.switchTo().defaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('DashboardPage/SubSubMenu_Sales'))

driver.switchTo().frame(driver.findElement(By.id('main1')))

WebUI.click(findTestObject('DashboardPage/Button_Page_283'))

WebElement tableSales1 = driver.findElement(By.cssSelector('body > form:nth-child(2) > table > tbody > tr:nth-child(3) > td > table > tbody'))

java.util.List row1 = tableSales1.findElements(By.tagName('tr'))

for (int x1 = 1; x1 < row1.size(); x1++) {
    WebElement ele1 = row1.get(x1)

    WebElement name1 = ele1.findElement(By.xpath('td[2]'))

    println(name1.getText())

    if (name1.getText() == editedName) {
        println('Edit data sales success !!')
		//Get Back to edit data
		WebElement buttonEdit1 = ele1.findElement(By.xpath('td[5]/input'))
		
		buttonEdit1.click()
		driver.switchTo().frame(driver.findElement(By.id('submain')))
		
		WebElement nameTextField1 = driver.findElement(By.cssSelector('body > form > table:nth-child(3) > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td.border_format > input[type=text]'))
		
		nameTextField1.clear()
		
		nameTextField1.sendKeys(salesName)
		
		WebElement updateButton1 = driver.findElement(By.cssSelector('body > form > table:nth-child(4) > tbody > tr > td.table_button > input[type=submit]:nth-child(1)'))
		
		updateButton1.click()
		
		driver.switchTo().defaultContent()
		driver.findElement(By.cssSelector('body > table > tbody > tr:nth-child(2) > td:nth-child(2) > span > a')).click()
        break
    }
	
	
	
}

