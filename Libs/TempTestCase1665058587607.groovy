import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\PasinduS\\AppData\\Local\\Temp\\Katalon\\20221006_174627\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',['file': 'C:\\\\Users\\\\PasinduS\\\\Downloads\\\\Haakon og Judith Johnsen.ged']), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'Base/Login\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)\n\nWebUI.click(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Administrere familietrrOpprett nyt_597acc\'))\n\nWebUI.click(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Administrere familietrr\'))\n\nWebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)\n\nWebUI.click(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_WEB_menu-edit-icon-wrap\'))\n\nWebUI.click(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Import\'))\n\nWebUI.click(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_FiltypeVelg typeGEDCOM\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/select_Velg typeGEDCOM_1\'), \n    \'GEDCOM\', true)\n\nWebUI.delay(3, FailureHandling.STOP_ON_FAILURE)\n\nWebUI.click(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/div_Dra og slipp filer her for  laste oppLa_e8aff1\'), \n    FailureHandling.STOP_ON_FAILURE)\n\nWebUI.uploadFile(findTestObject(\'Object Repository/ImportFamilyTree/Page_Embla Familie og Slekt/Input\'), file)\n\nWebUI.delay(15, FailureHandling.STOP_ON_FAILURE)\n\n', FailureHandling.STOP_ON_FAILURE, true)

