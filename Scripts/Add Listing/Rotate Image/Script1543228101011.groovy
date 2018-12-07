import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
for(def row=1; row<=findTestData('Edit_listing').getRowNumbers();row++)
{

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.workilo.com/')

WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/a_Log In'))
	
WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_email_address'), findTestData('Edit_listing').getValue(
"Username", row), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_password'), findTestData('Edit_listing').getValue(
        "Password", row), FailureHandling.STOP_ON_FAILURE)
	
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'))

WebUI.scrollToElement(findTestObject('Object Repository/Edit Listing/Edit Button'),5)

WebUI.click(findTestObject('Object Repository/Edit Listing/Edit Button'))

WebUI.scrollToElement(findTestObject('Object Repository/Edit Listing/rotate image on edit/Rotate image button'),5)
//Rotate image
WebUI.click(findTestObject('Object Repository/Edit Listing/rotate image on edit/Rotate image button'))
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Edit Listing/rotate image on edit/rotate left button'),5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Edit Listing/rotate image on edit/save after rotate button'),5)


WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Listing/save'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Edit Listing/save'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Edit Listing/save'), 5)

/*
WebUI.waitForElementClickable(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))

*/
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Edit Listing/save'),
5)


/*
def errMsg1=WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/duplicateEntry'), 5)
def errMsg2=WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/ListingAdded'), 5)
if (errMsg1==true)
{System.out.println("Duplicate ")
 
}
else if(errMsg2==true)
{
System.out.println("Listing added successfully")

}
*/


WebUI.closeBrowser()

}


