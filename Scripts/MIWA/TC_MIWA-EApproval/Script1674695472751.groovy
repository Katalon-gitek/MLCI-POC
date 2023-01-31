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

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/1. Halaman utama.png')

WebUI.setText(findTestObject('MIWA-EApproval/1_username'), 'jessen_yaputra')

WebUI.setEncryptedText(findTestObject('MIWA-EApproval/2_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('MIWA-EApproval/3_login'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/2. Setelah login.png')

WebUI.click(findTestObject('MIWA-EApproval/4_eapproval'))

WebUI.switchToWindowTitle('EA - Mitsui Leasing Capital Indonesia')

WebUI.click(findTestObject('MIWA-EApproval/5_sidebar'))

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/3. Open Eapproval.png')

WebUI.click(findTestObject('MIWA-EApproval/6_open memo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/4. Open Memo.png')

WebUI.click(findTestObject('MIWA-EApproval/7_send'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/5. Send.png')

WebUI.click(findTestObject('MIWA-EApproval/8_continue'))

WebUI.click(findTestObject('MIWA-EApproval/9_continue-yes'))

WebUI.click(findTestObject('MIWA-EApproval/5_sidebar'))

WebUI.click(findTestObject('MIWA-EApproval/10_approval'))

WebUI.click(findTestObject('MIWA-EApproval/11_onhand'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/6. On Hand.png')

WebUI.click(findTestObject('MIWA-EApproval/12_view memo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/7. View Memo On Hand.png')

WebUI.click(findTestObject('MIWA-EApproval/13_view attachment'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/8. View Attachment On Hand.png')

WebUI.click(findTestObject('MIWA-EApproval/14_close attachment'))

WebUI.click(findTestObject('MIWA-EApproval/5_sidebar'))

WebUI.click(findTestObject('MIWA-EApproval/15_inprogress'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/9. In Progress.png')

WebUI.click(findTestObject('MIWA-EApproval/12_view memo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/10. View Memo In Progress.png')

WebUI.click(findTestObject('MIWA-EApproval/13_view attachment'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/11. View Attachment In Progress.png')

WebUI.click(findTestObject('MIWA-EApproval/14_close attachment'))

WebUI.click(findTestObject('MIWA-EApproval/5_sidebar'))

WebUI.click(findTestObject('MIWA-EApproval/16_approved'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/12. Approved.png')

WebUI.click(findTestObject('MIWA-EApproval/12_view memo'))

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/13. View Memo Approved.png')

WebUI.click(findTestObject('MIWA-EApproval/13_view attachment'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/14. View Attachment Approved.png')

WebUI.click(findTestObject('MIWA-EApproval/14_close attachment'))

WebUI.click(findTestObject('MIWA-EApproval/5_sidebar'))

WebUI.click(findTestObject('MIWA-EApproval/17_rejected'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/15. Rejected.png')

WebUI.click(findTestObject('MIWA-EApproval/12_view memo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/16. View Memo Rejected.png')

WebUI.click(findTestObject('MIWA-EApproval/13_view attachment'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/SEPTI MAULITA/Katalon/MIWA E-APPROVAL/17. View Attachment Rejected.png')

WebUI.click(findTestObject('MIWA-EApproval/14_close attachment'))

WebUI.click(findTestObject('MIWA-EApproval/18_closepage'))

WebUI.switchToWindowTitle('Mitsui Leasing Capital Indonesia Core Application')

WebUI.click(findTestObject('MIWA-EApproval/19_logout'))

