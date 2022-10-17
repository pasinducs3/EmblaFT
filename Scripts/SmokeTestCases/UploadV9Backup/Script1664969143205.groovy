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

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.embla.no/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/V9Backup/Page_Embla Norsk Familiehistorie/input_Passord_Email'))

WebUI.setText(findTestObject('Object Repository/V9Backup/Page_Embla Norsk Familiehistorie/input_Passord_Email'), 'eranga@embla.asia')

WebUI.click(findTestObject('Object Repository/V9Backup/Page_Embla Norsk Familiehistorie/input_Passord_Password'))

WebUI.setText(findTestObject('Object Repository/V9Backup/Page_Embla Norsk Familiehistorie/input_Passord_Password'), 'test123')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/V9Backup/Page_Embla Norsk Familiehistorie/input_Passord_login_locktop login2'))

WebUI.navigateToUrl('https://dev.embla.no/Account/Login')

WebUI.waitForPageLoad(7)

WebUI.click(findTestObject('Object Repository/V9Backup/Page_Embla Norsk Familiehistorie/a_Sikkerhetskopi'))

WebUI.uploadFile(findTestObject('V9Backup/Page_Embla Norsk Familiehistorie/V9input'), zipfile)

WebUI.click(findTestObject('Object Repository/V9Backup/Page_Embla Norwegian Family History/div_upload'))

WebUI.waitForPageLoad(7)

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/a_Hjem'))

