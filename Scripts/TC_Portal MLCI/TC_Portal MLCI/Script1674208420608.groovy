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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://192.168.4.206:8099/portal_update/')

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/1. Halaman Login.png')

WebUI.setMaskedText(findTestObject('OBJ_Portal MLCI/Login_Username'), 'jessen_yaputra')

WebUI.setEncryptedText(findTestObject('OBJ_Portal MLCI/Login_Password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('OBJ_Portal MLCI/Login_Button'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/2. Halaman Utama.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation'))

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation_Company Regulation'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/3.a Company Regulation.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation_Company Regulation_View'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/3.b Company Regulation View.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation_Company Regulation_View_Close'))

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation'))

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation_SOP'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/4.a SOP.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation_SOP_View'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/4.b SOP View.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Regulation_SOP_View_Close'))

WebUI.click(findTestObject('OBJ_Portal MLCI/Application'))

WebUI.click(findTestObject('OBJ_Portal MLCI/Application_Manual Book'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/5.a Manual Book.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Application_Manual Book_View'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/5.b Manual Book View.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Application_Manual Book_View_Close'))

WebUI.click(findTestObject('OBJ_Portal MLCI/Application_Manual Book_Download'))

WebUI.click(findTestObject('OBJ_Portal MLCI/User Profile'))

WebUI.selectOptionByValue(findTestObject('OBJ_Portal MLCI/User Profile_Branch'), '16', false)

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/6. User Profile_Bekasi.png')

WebUI.setText(findTestObject('OBJ_Portal MLCI/User Profile_Input Name'), 'Jessen Yaputra Setiawan')

WebUI.click(findTestObject('OBJ_Portal MLCI/User Profile_Search'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/7. User Profile_Jessen.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Employee Form'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/2. Portal MLCI/8. Employee Form.png')

WebUI.click(findTestObject('OBJ_Portal MLCI/Employee Form_Download'))

WebUI.click(findTestObject('OBJ_Portal MLCI/Log out'))

