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

WebUI.click(findTestObject('Object Repository/Salesforce/Lead/Page_Recently Viewed  Leads  Salesforce (1)/button_Search'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Salesforce/Lead/Page_Recently Viewed  Leads  Salesforce (1)/input_search'), 'Mohit Kumar Sharma')

WebUI.click(findTestObject('Object Repository/Salesforce/Lead/Page_Recently Viewed  Leads  Salesforce (1)/img'))

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Salesforce/button_Delete'))

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Salesforce/span_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Salesforce/Lead/Page_Recently Viewed  Leads  Salesforce (1)/span_Lead Mohit Sharma was deleted. Undo'), 
    'Lead "Mohit Kumar Sharma" was deleted. Undo', FailureHandling.OPTIONAL)

