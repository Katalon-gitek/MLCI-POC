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

WebUI.openBrowser('https://192.168.4.193/coremain/')

WebUI.setText(findTestObject('Object Repository/MIWA-Docstorage 2/Page_Mitsui Leasing Capital Indonesia Core _b3b180/input_Core Application_username'), 
    'ardian_wibowo')

WebUI.setEncryptedText(findTestObject('Object Repository/MIWA-Docstorage 2/Page_Mitsui Leasing Capital Indonesia Core _b3b180/input_Core Application_password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_Mitsui Leasing Capital Indonesia Core _b3b180/a_Login'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_Mitsui Leasing Capital Indonesia Core _b3b180/img_Corporate Finance_card-img-top'))

WebUI.switchToWindowTitle('DS - Mitsui Leasing Capital Indonesia')

WebUI.navigateToUrl('https://192.168.4.193/coreds/home')

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/button__sidebarCollapse'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/a_Report'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/div_List Pengiriman Box(40005)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/select_INFORMATION TECHNOLOGYINTERNAL PROCEDURE'), 
    'INFORMATION TECHNOLOGY', true)

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/input_Date_col-md-2 form-control input active'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/span_-_arrowDown'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/select_JanuariFebruariMaretAprilMeiJuniJuli_13de9b'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/span_List Pengiriman Box_fa fa-print'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/button_Continue'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/button__sidebarCollapse'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/div_List Peminjaman Box(40006)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/select_INFORMATION TECHNOLOGYINTERNAL PROCEDURE'), 
    'INFORMATION TECHNOLOGY', true)

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/span'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/div_List Penyimpanan Kembali Box(40007)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/select_INFORMATION TECHNOLOGYINTERNAL PROCEDURE'), 
    'INFORMATION TECHNOLOGY', true)

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/button__sidebarCollapse'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/div_List Dokumen Dimusnahkan(40009)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/select_INFORMATION TECHNOLOGYINTERNAL PROCEDURE'), 
    'INFORMATION TECHNOLOGY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/select_ALLAGIIDOMLCIMMI'), 
    'ALL', true)

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/span_List Pengiriman Box_fa fa-print'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/button_Continue'))

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_DS - Mitsui Leasing Capital Indonesia/a_Close page'))

WebUI.switchToWindowTitle('Mitsui Leasing Capital Indonesia Core Application')

WebUI.click(findTestObject('Object Repository/MIWA-Docstorage 2/Page_Mitsui Leasing Capital Indonesia Core _b3b180/a_Logout'))

WebUI.closeBrowser()

