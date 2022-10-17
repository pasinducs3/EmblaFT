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

WebUI.click(findTestObject('Object Repository/AddMedia/Page_Embla Familie og Slekt/li_RessurserOversiktPersonFamilieStedsnavns_bc2571'))

WebUI.click(findTestObject('Object Repository/AddMedia/Page_Embla Familie og Slekt/li_Multimedialiste'))

WebUI.click(findTestObject('Object Repository/AddMedia/Page_Embla Familie og Slekt/a_Legg til media'))

WebUI.uploadFile(findTestObject('Object Repository/Person/Page_Embla Familie og Slekt/ProfileImage'), image)

WebUI.click(findTestObject('Object Repository/Person/Page_Embla Familie og Slekt/input_Bildebeskrivelse_caption'))

WebUI.click(findTestObject('Object Repository/AddMedia/Page_Embla Family and Kindred/input_Image description_caption'))

WebUI.setText(findTestObject('Object Repository/AddMedia/Page_Embla Family and Kindred/input_Image description_caption'), 
    'image 1')

WebUI.setText(findTestObject('Object Repository/AddMedia/Page_Embla Family and Kindred/input_Flagg_tag'), 'Abc')

WebUI.setText(findTestObject('Object Repository/AddMedia/Page_Embla Family and Kindred/input_Given_date'), '22-10-2000')

WebUI.setText(findTestObject('Object Repository/AddMedia/Page_Embla Family and Kindred/input_Place name_place'), 'HHH')

WebUI.setText(findTestObject('Object Repository/AddMedia/Page_Embla Family and Kindred/input_Description_description'), 
    'des1')

WebUI.click(findTestObject('Object Repository/AddMedia/Page_Embla Family and Kindred/button_add'))

WebUI.click(findTestObject('Object Repository/Person/AddPlace/Page_Embla Familie og Slekt/button_Legg til'))

