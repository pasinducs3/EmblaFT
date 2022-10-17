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

WebUI.navigateToUrl('http://dev.ft.embla.no/dashboard')

WebUI.mouseOver(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/i_Pasi_arrow down arrow-black'))

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/div_Administrere familietrr'))

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/div_WEB_menu-edit-icon-wrap'))

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/div_Eksport'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/select_Velg typeGEDCOM'), 
    'GEDCOM', true)

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/button_Eksporter fil'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ExportFamilyTrees/Page_Embla Familie og Slekt/a_Hjem'))

