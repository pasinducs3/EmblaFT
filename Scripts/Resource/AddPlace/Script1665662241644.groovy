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

WebUI.callTestCase(findTestCase('Base/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://dev.ft.embla.no/dashboard')

WebUI.click(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/a_Ressurser'))

WebUI.click(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/li_Stedsnavnsliste'))

WebUI.click(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/a_Legg til Stedsnavn'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/select_Adresse Adresse USA Kirkelig DIS Nor_229d04'), 
    '1: Object', true)

WebUI.setText(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/input__detail'), 'Abc')

WebUI.setText(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/input_By_line2'), 'VV')

WebUI.setText(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/input_Fylke_line3'), 'AAA')

WebUI.setText(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/input_Stat_line4'), 'AAA')

WebUI.setText(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/input_Zippost kode_line5'), '123')

WebUI.setText(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/input_Land_country'), 'sss')

WebUI.setText(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/input_Notater_note'), 'hello')

WebUI.click(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/button_Legg til'))

WebUI.click(findTestObject('Object Repository/AddPlace/Page_Embla Familie og Slekt/button_Avbryt'))

