package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object APP_URL
     
    /**
     * <p></p>
     */
    public static Object USERNAME
     
    /**
     * <p></p>
     */
    public static Object PASSWORD
     
    /**
     * <p></p>
     */
    public static Object caseNumber
     
    /**
     * <p></p>
     */
    public static Object SKIP_REMAINING_TESTS
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            APP_URL = selectedVariables['APP_URL']
            USERNAME = selectedVariables['USERNAME']
            PASSWORD = selectedVariables['PASSWORD']
            caseNumber = selectedVariables['caseNumber']
            SKIP_REMAINING_TESTS = selectedVariables['SKIP_REMAINING_TESTS']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
