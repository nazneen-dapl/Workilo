import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.lang.ref.ReferenceQueue.Null
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.sun.java.util.jar.pack.Instruction.Switch
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

for(def row=1; row<=findTestData('Login').getRowNumbers();row++)
{
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.workilo.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_email_address'), findTestData('Login').getValue(
        "Username", row), FailureHandling.STOP_ON_FAILURE)



WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_password'), findTestData('Login').getValue(
        "Password", row), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'))

//************** Checking for validation*******************************************************************

title = WebUI.getWindowTitle()

try{
	WebUI.verifyElementNotVisible(findTestObject('Object Repository/Negative testing/SignIn Validation/Add Listing icon'), FailureHandling.OPTIONAL)
	WebUI.println("customer dashboard")
	}


catch (Exception e){
 WebUI.verifyElementVisible(findTestObject('Object Repository/Negative testing/SignIn Validation/Add Listing icon'), FailureHandling.OPTIONAL)

	WebUI.println("service Provider dashboard")

}
finally
{
WebUI.closeBrowser()
}
}