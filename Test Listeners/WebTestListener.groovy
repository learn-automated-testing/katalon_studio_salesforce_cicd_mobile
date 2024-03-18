import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class WebTestListener {




	//@BeforeTestCase
	def BeforeTestCase(TestCaseContext testCaseContext) {
		def testcasename= RunConfiguration.getExecutionSourceName().toString()
		println('Test case: '+testcasename)
		if (testcasename == "finding test case name") {
			testCaseContext.skipThisTestCase()

		}
		else {
			WebUI.openBrowser('www.gmail.com')
		}
	}


	//@BeforeTestCase
	def sampleBeforeTestCase2(TestCaseContext testCaseContext) {
		if (testCaseContext.getTestCaseVariables().get("type") == "TEST") {
			testCaseContext.skipThisTestCase()
		}
	}

	@BeforeTestCase
	def sampleBeforeTestCase3(TestCaseContext testCaseContext) {
		if(GlobalVariable.SKIP_REMAINING_TESTS==true){
			testCaseContext.skipThisTestCase()
			println "Test Case skipped"
		}
	}


	@AfterTestCase
	def sampleAfterTestCase2(TestCaseContext testCaseContext) {
		if(testCaseContext.testCaseStatus=='FAILED'){
			GlobalVariable.SKIP_REMAINING_TESTS = true
		}
	}

	//@BeforeTestSuite
	def OpenBrowserBeforeTestSuite(TestSuiteContext testSuiteContext) {
		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow()
		String strTitle = WebUI.getWindowTitle()
		WebUI.verifyMatch(strTitle, 'CURA Healthcare Service', false)

	}


	//@AfterTestSuite
	def CloseBrowserAfterTestSuite(TestSuiteContext testSuiteContext) {
		WebUI.closeBrowser()

	}
}