import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.waitForElementVisible(findTestObject('Salesforce/Case/Page_Home  Salesforce/span_Cases'), 10)

WebUI.enhancedClick(findTestObject('Object Repository/Salesforce/Case/Page_Home  Salesforce/span_Cases'))

WebUI.click(findTestObject('Object Repository/Salesforce/Case/Page_Recently Viewed  Cases  Salesforce/div_New'))

WebUI.waitForElementVisible(findTestObject('Salesforce/Case/Page_New Case  Salesforce/caseorgigin'), 10)

WebUI.click(findTestObject('Salesforce/Case/Page_New Case  Salesforce/caseorgigin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Salesforce/Case/Page_New Case  Salesforce/caseorgiginemail'), FailureHandling.STOP_ON_FAILURE)


not_run: WebUI.click(findTestObject('Object Repository/Salesforce/Case/Page_New Case  Salesforce/a_Medium'))

not_run: WebUI.click(findTestObject('Object Repository/Salesforce/Case/Page_New Case  Salesforce/a_Highest'))

// WebUI.setText(findTestObject('Object Repository/Salesforce/Case/Page_New Case  Salesforce/input_Subject_123840'), 'Case for Testing')

//WebUI.setText(findTestObject('Object Repository/Salesforce/Case/Page_New Case  Salesforce/textarea_Description_124040'), 
//    'This a case created for testing purpose')

//WebUI.scrollToElement(findTestObject('Salesforce/Case/Page_New Case  Salesforce/span_Studio'), 10)

//WebUI.click(findTestObject('Object Repository/Salesforce/Case/Page_New Case  Salesforce/span_Studio'))

//WebUI.click(findTestObject('Object Repository/Salesforce/Case/Page_New Case  Salesforce/caseorgigin'))

WebUI.enhancedClick(findTestObject('Object Repository/Salesforce/Case/Page_New Case  Salesforce/span_Save'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Salesforce/Case/Page_Cases_Salesforce/span_Case 00001063 was created'), 
    'Case "00001063" was created.')

WebUI.waitForElementVisible(findTestObject('Salesforce/Case/Page_Cases_Salesforce/span_Case 00001063 was created'), 
    5)

String caseNumber = WebUI.getText(findTestObject('Salesforce/Case/Page_Cases_Salesforce/span_Case 00001063 was created'))

println('Case Number: ' + caseNumber)

GlobalVariable.caseNumber = caseNumber

println('Case Number is: ' + caseNumber)

WebUI.delay(5)

