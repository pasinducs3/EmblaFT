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

WebUI.navigateToUrl('https://dev.embla.no/')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Norsk Familiehistorie/a_Medlemskap'))

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Norsk Familiehistorie/a_Kjp n'))

WebUI.delay(2)

WebUI.navigateToUrl('https://shop.dev.embla.no/0/versjon10ogmedlemskap')

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/button_Kjp n'))

WebUI.delay(4)

WebUI.navigateToUrl('https://shop.dev.embla.no/register')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Fornavn_firstName'), 'Pasi')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Mellomnavn_middleName'), 'Chathu')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Etternavn_lastName'), 'Test')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_E-post_emailAddress'), 'pasi@grr.la')

WebUI.setEncryptedText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Passord_password'), 'RJ5YI6YP1mw=')

WebUI.setEncryptedText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Bekreft passord_confirmPassword'), 
    'RJ5YI6YP1mw=')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Adresse 1_street1'), 'colombo')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Adresse 2_street2'), 'Nugegoda')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Postnummer_postalCode'), '0022')

WebUI.setText(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Poststed_city'), '222222')

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/input_Land_country'))

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/button_Bekreft'))

WebUI.delay(2)

WebUI.navigateToUrl('https://shop.dev.embla.no/order')

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/button_Bestill'))

WebUI.navigateToUrl('https://shop.dev.embla.no/payment')

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/button_Ok'))

WebUI.click(findTestObject('Objects Base/Register/Page_Nets  Select payment method/input_Mrkeskort Ikano_nextButton'))

WebUI.setText(findTestObject('Objects Base/Register/Page_Nets - Aksepter betaling/input_Kortnummer_VisacardNumber'), '4899800000277094')

WebUI.selectOptionByValue(findTestObject('Objects Base/Register/Page_Nets - Aksepter betaling/select_2022202320242025202620272028202920302031203220332034203520362037203820392040204120422043204420452046204720482049205020512052'), 
    '23', true)

WebUI.selectOptionByValue(findTestObject('Objects Base/Register/Page_Nets - Aksepter betaling/select_010203040506070809101112'), 
    '10', true)

WebUI.setText(findTestObject('Objects Base/Register/Page_Nets - Aksepter betaling/input_CVV2_VisasecurityCode'), '255')

WebUI.click(findTestObject('Objects Base/Register/Page_Nets - Aksepter betaling/input_Hva er CVV2_okButton'))

WebUI.delay(4)

WebUI.navigateToUrl('https://shop.dev.embla.no/order')

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/button_Bekreft bestilling'))

WebUI.click(findTestObject('Objects Base/Register/Page_Embla Familie og Slekt/button_Ferdig'))

WebUI.switchToWindowTitle('Embla Familie og Slekt')

