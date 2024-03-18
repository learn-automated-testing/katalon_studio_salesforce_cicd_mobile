import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.VerifyMatchKeyword as VerifyMatchKeyword
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

WebUI.callTestCase(findTestCase('Testcases_Salesforce/TestCaseReuseables/StartStopApplication/Login into Salesforce'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Testcases_Salesforce/TestCaseReuseables/Case/Create a New Case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Testcases_Salesforce/TestCaseReuseables/Case/Edit a New Case and Change the Status'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Testcases_Salesforce/TestCaseReuseables/Case/Search a Case by ID and Delete a Case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Testcases_Salesforce/TestCaseReuseables/StartStopApplication/Close application'), [:], FailureHandling.STOP_ON_FAILURE)

