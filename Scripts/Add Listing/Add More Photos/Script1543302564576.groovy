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

CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Edit Listing/Edit Button'),5)

WebUI.scrollToElement(findTestObject('Object Repository/Edit Listing/rotate image on edit/Rotate image button'),5)

//Add More Images(2nd images)..........................
WebUI.click(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'))
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/2nd image upload button'), findTestData(
        'Edit_Listing').getValue("Add Photo2", row), FailureHandling.STOP_ON_FAILURE)

//Add More Images(3rd images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 3rd image'), findTestData(
	'Edit_Listing').getValue("Add Photo3", row), FailureHandling.STOP_ON_FAILURE)

//Add More Images(4th images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 4th image'),findTestData(
	'Edit_Listing').getValue("Add Photo4", row), FailureHandling.STOP_ON_FAILURE)

//Add More Images(5th images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 5th image'),findTestData(
	'Edit_Listing').getValue("Add Photo5", row), FailureHandling.STOP_ON_FAILURE)


//Add More Images(6th images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 6th image'),findTestData(
	'Edit_Listing').getValue("Add Photo6", row), FailureHandling.STOP_ON_FAILURE)


//Add More Images(7th images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 7th image'),findTestData(
	'Edit_Listing').getValue("Add Photo7", row), FailureHandling.STOP_ON_FAILURE)

//Add More Images(8th images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 8th images'),findTestData(
	'Edit_Listing').getValue("Add Photo8", row), FailureHandling.STOP_ON_FAILURE)

//Add More Images(9th images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 9th image'),findTestData(
	'Edit_Listing').getValue("Add Photo9", row), FailureHandling.STOP_ON_FAILURE)

//Add More Images(10th images)..........................
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)
WebUI.delay(7)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add more image upload/click on 10th image'),7)
//WebUI.scrollToElement(findTestObject('Object Repository/Add Listing/Add more image upload/click on 10th image'),5)
WebUI.acceptAlert()
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 10th image'),findTestData(
	'Edit_Listing').getValue("Add Photo10", row), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)
//Add More Images(11th images)..........................
//CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Add more image upload/Add More Photos'),5)

//..................wait for alert 
//WebUI.acceptAlert()

//WebUI.delay(7)
//WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Add more image upload/click on 11th images'),findTestData(
	//'Edit_Listing').getValue("Add Photo11", row), FailureHandling.STOP_ON_FAILURE)

/*
WebUI.waitForElementClickable(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))

*/
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Edit Listing/save'),
5)




//WebUI.closeBrowser()

}


