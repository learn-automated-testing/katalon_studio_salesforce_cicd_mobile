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

'this enables users to click Account in shadowdom (enhance Click) '
WebUI.enhancedClick(findTestObject('Object Repository/Salesforce/Account/Accounts_List_Salesforce/span_Accounts'))

WebUI.click(findTestObject('Object Repository/Salesforce/Account/Accounts_List_Salesforce/New'))

WebUI.setText(findTestObject('Salesforce/Account/Accounts_fields_Salesforce/Account_name'), 'LearnAuto')

'This delay is wrong (why)'
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Salesforce/Account/Accounts_fields_Salesforce/account_site'), 'learnautomatedtesting')

WebUI.setText(findTestObject('Salesforce/Account/Accounts_fields_Salesforce/Annual_revenue'), '20000')

WebUI.setText(findTestObject('Salesforce/Account/Accounts_fields_Salesforce/Phone'), '0643345556')

WebUI.setText(findTestObject('Salesforce/Account/Accounts_fields_Salesforce/fax'), '112313')

WebUI.scrollToElement(findTestObject('Salesforce/Account/Accounts_fields_Salesforce/fax'), 2)

WebUI.click(findTestObject('Object Repository/Salesforce/Account/Accounts_fields_Salesforce/type'))

WebUI.waitForElementClickable(findTestObject('Salesforce/Account/Accounts_fields_Salesforce/typeofaccountother'), 
    20)

WebUI.click(findTestObject('Salesforce/Account/Accounts_fields_Salesforce/typeofaccountother'))

WebUI.click(findTestObject('Object Repository/Salesforce/Account/Accounts_fields_Salesforce/Save'))

not_run: accountCreated = WebUI.getText(findTestObject('Object Repository/Salesforce/Account/Accounts_List_Salesforce/span_toastMessage slds-text-heading--small _f3870d'), 
    FailureHandling.STOP_ON_FAILURE)


