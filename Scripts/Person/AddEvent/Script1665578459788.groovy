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

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/a_Ressurser'))

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/li_Person'))

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/a_Legg til hendelse'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/select_Velg en hendelsestypeAdopsjonJordfes_b53109'), 
    '7: FOSTER', true)

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Dato_date'), '15/10/2000')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Sted_ng-untouched ng-pristine ng-valid'), 
    'Gampaha')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/textarea_Notater_note'), 'hello')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/textarea_Beskrivelse_description'), 
    'hello')

WebUI.click(findTestObject('Object Repository/Person/AddEvent/AddEvent/AddMedia'))

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/img_Screenshot 2022-02-22 130451.png_item-image'))

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/button_Legg til'))

WebUI.click(findTestObject('Object Repository/Person/AddEvent/AddEvent/AddProof'))

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/a_Legg til Kilde'))

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Tittel_title'), 'aaa')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Periode_period'), 'sss')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Forfatter_author'), 'fff')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Publikasjon_publication'), 
    'accc')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Tilhrer_repository'), 
    'rrr')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Avskrift_transcript'), 
    'ddd')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Notater_notes'), 'rrr')

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/button_Legg til_1'))

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Bokside_volume'), '55')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_URL_url'), 'www.gggg.lk')

WebUI.setText(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/input_Kommentar_comment'), 'rttr')

WebUI.click(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/button_Lagre'))

WebUI.click(findTestObject('Object Repository/Person/AddEvent/AddEvent/SaveButton'))

WebUI.switchToWindowTitle('')

WebUI.verifyElementPresent(findTestObject('Object Repository/Person/AddEvent/Page_Embla Familie og Slekt/span_Foster'), 
    0)

