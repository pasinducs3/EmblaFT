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

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Administrere familietrrOpprett nyt_597acc'))

WebUI.click(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Administrere familietrr'))

WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_WEB_menu-edit-icon-wrap'))

WebUI.click(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Import'))

WebUI.click(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_FiltypeVelg typeGEDCOM'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/select_Velg typeGEDCOM_1'), 
    'GEDCOM', true)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Dra og slipp filer her for  laste oppLa_e8aff1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/Input'), file)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ImportFamilyTree/Page_Embla Familie og Slekt/button_Importer fil'))

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/a_Hjem'))

WebUI.click(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_pasi123 Administrere familietrrOpprett _10b2d2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Pasi Tree 1'), 
    0)

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/a_Hjem'))

