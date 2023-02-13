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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cam.mitsuilease.co.id/login.php')

WebUI.setText(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Username_username'), 
    'jessen_yaputra')

WebUI.setEncryptedText(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Password_password'), 
    'FegelPVVC31AbCTjQ/6HeA==')

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Password_task'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_Report ViewList Approved CAMList CAM by _b40749'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_OthersHistory PaymentAmortization Report_128a63'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Amortization Report'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Undisburse Contract'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_OthersHistory PaymentAmortization Report_128a63'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_RESTRUCTURING FOR COVIDReport of Rejecte_ccf5bb'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Report of Rejected Restructuring Covid 19'))

WebUI.setText(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Rejected Period -_start_dt'), 
    '01-02-2021')

WebUI.setText(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Sun_end_dt'), '01-02-2023')

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Report for Internal_reportfilter'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Report for Internal_task'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_View IM Restructuring'))

WebUI.setText(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input__contract'), '111831280')

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_111831280--AMELIYAH JAYA PERKASA, PT. Re_8fd222'))

WebUI.setText(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input__contract'), '111831280')

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/font_I - 111831280'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_RESTRUCTURING FOR COVIDReport of Rejecte_ccf5bb'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_APPROVER AVAILABILITYOperationBranch Man_e15654'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Operation'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Credit Commitee'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_APPROVER AVAILABILITYOperationBranch Man_e15654'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_OFFERING LETTERInput Offering Letter'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Input Offering Letter'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_OFFERING LETTERInput Offering Letter'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/ul_CAMOn ProcessOn HandIn ProgressApprovedB_84b0b8'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_MASTER DATASalesSalesList of SalesDealer_050409'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_SalesSalesList of Sales'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Sales'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_List of Sales'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/select_Select  ConsolidateGatot SubrotoBeka_9a1a4f'), 
    '00', true)

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Report for Internal_task'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_SalesSalesList of Sales'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_DealerDealerList of SupplierDealer Profile'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Dealer'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_List of Supplier'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/select_Select  ConsolidateHead OfficeGatot _5c3a46'), 
    '00', true)

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Report for Internal_task'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Dealer Profile'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_DealerDealerList of SupplierDealer Profile'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_Collateral ObjectModelKaroseriBrand - Ty_afc80d'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Model'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Karoseri'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_Brand - Type'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_List of Brand'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/select_Select  ABBAGRONICAIRMANALDENAAlfa R_a6d04e'), 
    'HON', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/select_Select  MINIBUSSEDANJEEPPICK UPLIGHT_bd4a27'), 
    '02', true)

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Report for Internal_task'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_List of Model'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Report for Internal_task'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_List of Karoseri'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/select_Select  MINIBUSSEDANJEEPPICK UPLIGHT_bd4a27'), 
    '06', true)

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/input_Report for Internal_task'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/li_Collateral ObjectModelKaroseriBrand - Ty_afc80d'))

WebUI.click(findTestObject('Object Repository/OBJ_CAM/Page_MLCI - Credit Approval Memorandum/a_LOGOUT'))

WebUI.closeBrowser()

