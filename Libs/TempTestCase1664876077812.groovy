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


RunConfiguration.setExecutionSettingFile('C:\\Users\\PasinduS\\AppData\\Local\\Temp\\Katalon\\20221004_150437\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'Base/Login\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)\n\nWebUI.click(findTestObject(\'Object Repository/EditorNavigation/Page_Embla Familie og Slekt/div_OversiktFamiliePerson\'))\n\nWebUI.click(findTestObject(\'Object Repository/EditorNavigation/Page_Embla Familie og Slekt/a_Hjem\'))\n\nWebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)\n\nWebUI.click(findTestObject(\'Object Repository/EditorNavigation/Page_Embla Familie og Slekt/svg__editor-family-icon\'))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Object Repository/EditorNavigation/Page_Embla Familie og Slekt/a_Hjem\'))\n\nWebUI.click(findTestObject(\'Object Repository/EditorNavigation/Page_Embla Familie og Slekt/svg_Stein Inge Haaland_editor-tree-icon\'))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Object Repository/EditorNavigation/Page_Embla Familie og Slekt/a_Hjem\'))\n\nWebUI.click(findTestObject(\'Object Repository/EditorNavigation/Page_Embla Familie og Slekt/svg__editor-member-icon\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

