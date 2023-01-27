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

WebUI.openBrowser('http://192.168.4.193/ticketing')

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/1. Halaman Login.png')

WebUI.setMaskedText(findTestObject('OBJ_Ticketing (PR List)/Login_Username'), 'jessen_yaputra')

WebUI.setEncryptedText(findTestObject('OBJ_Ticketing (PR List)/Login_Password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Login_Button'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/2. Halaman Utama Ticketing.png')

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Main Menu_PR List'))

WebUI.switchToWindowTitle('MLCI - PR LIST')

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/3. Halaman PR List.png')

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/4. PR List.png')

WebUI.selectOptionByValue(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Dropdown Division'), '50', false)

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_ Search'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/5. PR List_SIT.png')

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Excel'))

WebUI.selectOptionByValue(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Dropdown Division'), '10', false)

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_ Search'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/6. PR List_OP.png')

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Excel'))

WebUI.selectOptionByValue(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Dropdown Division'), '20', false)

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_ Search'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/7. PR List_CA.png')

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Excel'))

WebUI.selectOptionByValue(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Dropdown Division'), '40', false)

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_ Search'))

WebUI.takeFullPageScreenshot('D:/_Doc/JESSEN/DATA/Katalon Reports/1. PR List (Ticketing)/8. PR List_FA.png')

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Excel'))

WebUI.click(findTestObject('OBJ_Ticketing (PR List)/Detail PR List_Log Out'))

WebUI.closeBrowser()

