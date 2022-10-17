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

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/a_Ressurser'))

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/li_Kildeliste'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddSource/source1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/img_Legg kilde til_menu-edit-icon-1'))

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/div_Opplasting'))

WebUI.uploadFile(findTestObject('Object Repository/AddSource/sourceImg'), image2)

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Bildebeskrivelse_caption'))

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Family and Kindred/input_Image description_caption'))

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Family and Kindred/input_Image description_caption'), 
    'image 1')

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Family and Kindred/input_Flagg_tag'), 'Abc')

WebUI.setText(findTestObject('AddSource/Page_Embla Familie og Slekt/input_Dato_date'), '22-10-2000')

WebUI.setText(findTestObject('AddSource/Page_Embla Familie og Slekt/input_Stedsnavn_place'), 'HHH')

WebUI.setText(findTestObject('AddSource/Page_Embla Familie og Slekt/input_Beskrivelse_description'), 'des1')

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Family and Kindred/button_add'))

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Tittel_title'), 'aaa')

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Periode_period'), 'sss')

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Forfatter_author'), 'fff')

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Publikasjon_publication'), 'accc')

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Tilhrer_repository'), 'rrr')

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Avskrift_transcript'), 'ddd')

WebUI.setText(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/input_Notater_notes'), 'rrr')

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/button_Legg til_1'))

WebUI.click(findTestObject('Object Repository/AddSource/Page_Embla Familie og Slekt/button_Avbryt'))

