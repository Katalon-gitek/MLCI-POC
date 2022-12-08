import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://192.168.4.193/newcam_katalon')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('LoginPage/Logo_Mitsui'), 3)

WebUI.verifyElementPresent(findTestObject('LoginPage/Label_Credit_Approval_Memorandum'), 3)

WebUI.verifyElementPresent(findTestObject('LoginPage/Label_Username'), 3)

WebUI.verifyElementPresent(findTestObject('LoginPage/Textfield_Username'), 3)

WebUI.verifyElementPresent(findTestObject('LoginPage/Label_Password'), 3)

WebUI.verifyElementPresent(findTestObject('LoginPage/Textfield_Password'), 3)

WebUI.verifyElementPresent(findTestObject('LoginPage/Button_Login'), 3)

WebUI.setText(findTestObject('LoginPage/Textfield_Username'), 'Reza_Renika\n')

WebUI.setText(findTestObject('LoginPage/Textfield_Password'), '123')

WebUI.click(findTestObject('LoginPage/Button_Login'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/PopupMinimalDp/Button_Yes'), 5)

WebUI.click(findTestObject('DashboardPage/PopupMinimalDp/Button_Yes'))

WebUI.click(findTestObject('Object Repository/DashboardPage/Add_CAM'))

WebUI.switchToFrame(findTestObject('Object Repository/DashboardPage/ParentTable'), 5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/Purpose_Of_Finace_Dropdown'), 'Multiguna', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/Finace_Type_Dropdown'), 'Installment Financing (IF)', 
    false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/Contract_Type_Dropdown'), 'NEW FINANCING', false)

WebUI.click(findTestObject('Object Repository/CAMPage/Customer_Type_RadioButton'))

WebUI.click(findTestObject('Object Repository/CAMPage/Vehicle_Condition_RadioButton'))

WebUI.click(findTestObject('Object Repository/CAMPage/Guarantor_Availability_RadioButton'))

WebUI.click(findTestObject('Object Repository/CAMPage/Go_Public_RadioButton'))

WebUI.click(findTestObject('Object Repository/CAMPage/Beneficial_Owner_Availability_RadioButton'))

WebUI.waitForElementVisible(findTestObject('Object Repository/CAMPage/Beneficial_Owner_Type_RadioButton'), 5)

WebUI.click(findTestObject('Object Repository/CAMPage/Beneficial_Owner_Type_RadioButton'))

WebUI.scrollToElement(findTestObject('Object Repository/CAMPage/Submit_Button'), 4)

WebUI.click(findTestObject('Object Repository/CAMPage/Submit_Button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/CAMPage/Button_Yes'), 5)

WebUI.click(findTestObject('Object Repository/CAMPage/Button_Yes'))

WebUI.delay(20)

//WebUI.switchToFrame(findTestObject('Object Repository/CAMPage/InputCAMDataPage/ParentTable_InputCAMData'), 3)
WebDriver driver = DriverFactory.getWebDriver()

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.waitForElementVisible(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Name_Akta_Button'), 5)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Name_Akta_Button'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Lessee_Name_Textfield'), '3S')

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Search_Button'))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Data_Lesse_Index_1'))

WebUI.switchToWindowIndex(0)

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Button_Next'), 3)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Button_Next'))

WebUI.delay(3)

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Button_Next_2'))

//Guarantor Tab
driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Add_Guarantor_Button'), 3)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Add_Guarantor_Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Guarantor_Type_Dropdown'), 
    3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Guarantor_Type_Dropdown'), 
    'Corporate', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Guarantor_Category_Dropdown'), 
    'MLCI Customer', false)

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Lesse_Name_Textfield'), 'MITRA ABADI MAHAKAM')

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Lesse_Name_Textfield'), 
    3)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Search_Customer_Button'))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Data_Lesse_Index_1'))

WebUI.switchToWindowIndex(0)

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.scrollToElement(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Button_Next'), 3)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Button_Next'))

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Bank_Dropdown'), 3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Bank_Dropdown'), 'ANZ', 
    false)

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Account_No_Textfield'), '32524234324')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Account_Name_Textfield'), 'YOGI')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Month_1'), '05')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Year_1'), '2021')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Beginning_Balance_1'), '100000000')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Debit_1'), '20000000')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Credit_1'), '24000000')

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Calculate_1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Currency_Dropdown'), 
    'INDONESIAN RUPIAH', false)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Upload_Document_Button'))

WebUI.delay(3)

//
String documentPath = RunConfiguration.getProjectDir()

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Upload_File_1'), documentPath + 
    '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Upload_File_2'), documentPath + 
    '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Upload_File_3'), documentPath + 
    '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Upload_File_4'), documentPath + 
    '/Capture001.PNG')

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Back_Guarantor_Button'))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Guarantor_Tab/Button_Next_2'))

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.scrollToElement(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Calculate_Button'), 
    0)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Calculate_Button'))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Button_Next'))

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Calculate_Button'))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Button_Next'))

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Bank_Name_Dropdown'), 
    0)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Bank_Name_Dropdown'), 
    'ANZ', false)

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Bank_Branch_TextField'), 
    'JAKARTA')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Account_No_TextField'), 
    '8777660099')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Account_Name_Textfield'), 
    'JON')

WebUI.selectOptionByLabel(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Currency_Code_Textfield'), 
    'INDONESIAN RUPIAH', false)

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Month_1'), '05')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Year_1'), '2021')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Beginning_Balance_1'), 
    '100000000')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Debit_1'), '20000000')

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Credit_1'), '24000000')

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Calculate_Button'))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Button_Next'))

WebUI.delay(3)

driver.switchTo().frame(driver.findElement(By.id('main')))

String documentNumber = WebUI.getText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Financial Information_Tab/Document_Number_Label'))

String[] documentID = documentNumber.split('-')

println(documentID[1])

WebUI.takeFullPageScreenshot(documentPath + '/Screenshot/BussinessProfile.jpg')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/HomePage_Button'))

WebUI.delay(3)

driver.switchTo().frame(driver.findElement(By.id('main1')))

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Search_Document_ID_Textfield'), 5)

WebUI.setText(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Search_Document_ID_Textfield'), (documentID[1]).replace(
        ' ', ''))

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Search_Document_ID_Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Edit_Data_CAM_Button'), 3)

WebUI.click(findTestObject('Object Repository/CAMPage/InputCAMDataPage/Edit_Data_CAM_Button'))

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/CAMPage/Purpose_Of_Finace_Dropdown'), 3)

WebUI.click(findTestObject('Object Repository/CAMPage/Beneficial_Owner_Availability_RadioButton'))

WebUI.waitForElementVisible(findTestObject('Object Repository/CAMPage/Beneficial_Owner_Type_RadioButton'), 5)

WebUI.click(findTestObject('Object Repository/CAMPage/Beneficial_Owner_Type_RadioButton'))

WebUI.scrollToElement(findTestObject('Object Repository/CAMPage/Submit_Button'), 4)

WebUI.click(findTestObject('Object Repository/CAMPage/Submit_Button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/CAMPage/Button_Yes'), 5)

WebUI.click(findTestObject('Object Repository/CAMPage/Button_Yes'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Survey_Menu'))

driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_1'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_2'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_3'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_4'), documentPath + '/Capture001.PNG')

driver.switchTo().frame(driver.findElement(By.cssSelector('#cke_1_contents > iframe')))

WebElement el = driver.findElement(By.cssSelector('body'))

el.click()

WebElement textArea = driver.findElement(By.xpath('/html/body/p'))

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('arguments[0].textContent = arguments[1];', textArea, 'This is a test')

driver.switchTo().defaultContent()
driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_5'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_6'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_7'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_8'), documentPath + '/Capture001.PNG')

driver.switchTo().frame(driver.findElement(By.cssSelector('#cke_2_contents > iframe')))

WebElement el1 = driver.findElement(By.cssSelector('body'))

el1.click()

WebElement textArea1 = driver.findElement(By.xpath('/html/body/p'))

//JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('arguments[0].textContent = arguments[1];', textArea1, 'This is a test')

driver.switchTo().defaultContent()
driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_9'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_10'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_11'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_12'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_13'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_14'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_15'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_16'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_17'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_18'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_19'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_20'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_21'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_22'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_23'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_24'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_25'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_26'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_27'), documentPath + '/Capture001.PNG')

WebUI.uploadFile(findTestObject('Object Repository/CAMPage/Survey_File_Tab/Upload_28'), documentPath + '/Capture001.PNG')

driver.switchTo().frame(driver.findElement(By.cssSelector('#cke_3_contents > iframe')))

WebElement el2 = driver.findElement(By.cssSelector('body'))

el2.click()

WebElement textArea2 = driver.findElement(By.xpath('/html/body/p'))

//JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('arguments[0].textContent = arguments[1];', textArea2, 'This is a test')

driver.switchTo().defaultContent()
driver.switchTo().frame(driver.findElement(By.id('main')))

WebUI.click(findTestObject('CAMPage/Survey_File_Tab/Button_Next'))

