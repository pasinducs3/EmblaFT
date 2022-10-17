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

WebUI.click(findTestObject('Object Repository/Person/Page_Embla Familie og Slekt/a_Ressurser'))

WebUI.click(findTestObject('Object Repository/Person/Page_Embla Familie og Slekt/li_Person'))

WebUI.setText(findTestObject('Person/Page_Embla Familie og Slekt/input_Fornavn_givenName'), 'Pasindu')

WebUI.setText(findTestObject('Person/Page_Embla Familie og Slekt/input_Etternavn_surname'), 'Surasinghe')

WebUI.click(findTestObject('Object Repository/Person/Page_Embla Family and Kindred/input_Mann_gender'))

WebUI.setText(findTestObject('Object Repository/Person/Page_Embla Family and Kindred/input_Date of birth_date'), '15/10/1995')

WebUI.click(findTestObject('Person/Page_Embla Familie og Slekt/BirthPlace'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Person/Page_Embla Familie og Slekt/BirthPlace'), 'kandy')

WebUI.click(findTestObject('Person/Page_Embla Family and Kindred/DeadLocator'))

WebUI.setText(findTestObject('Person/Page_Embla Familie og Slekt/input_Ddsdato_date'), '22/12/2021')

WebUI.setText(findTestObject('Person/Page_Embla Familie og Slekt/DeadPlace'), 'ssssss')

WebUI.setText(findTestObject('Object Repository/Person/Page_Embla Family and Kindred/textarea_Private_biographical'), 'doctor')

WebUI.setText(findTestObject('Object Repository/Person/Page_Embla Family and Kindred/textarea_Private_medical'), 'heart attack')

WebUI.setText(findTestObject('Object Repository/Person/Page_Embla Family and Kindred/input_Address_address'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Person/Page_Embla Family and Kindred/input_Telephone_phone'), '041111111')

WebUI.setText(findTestObject('Object Repository/Person/Page_Embla Family and Kindred/input_E-mail_email'), 'pasi@grr.la')

WebUI.click(findTestObject('Person/Page_Embla Familie og Slekt/button_Lagre'), FailureHandling.STOP_ON_FAILURE)

