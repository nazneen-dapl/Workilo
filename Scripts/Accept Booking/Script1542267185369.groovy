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
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.workilo.com/')

WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/a_Log In'))
	
WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_email_address'), 'pawel.r.walczuk@gmail.com',
FailureHandling.STOP_ON_FAILURE)
	
WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_password'), 'admin#123', FailureHandling.STOP_ON_FAILURE)
	
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'))
WebUI.click(findTestObject('Object Repository/AcceptBookingOrder/Booking menu'))	
WebUI.click(findTestObject('Object Repository/AcceptBookingOrder/Orderdetails tab'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/AcceptBookingOrder/a_Accept'))
//WebUI.click(findTestObject('Object Repository/AcceptBookingOrder/a_Accept'))
//CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/AcceptBookingOrder/a_Accept'),5)
WebUI.click(findTestObject('Object Repository/AcceptBookingOrder/button_Accept'))
WebUI.click(findTestObject('Object Repository/AcceptBookingOrder/confirm accept button'))


