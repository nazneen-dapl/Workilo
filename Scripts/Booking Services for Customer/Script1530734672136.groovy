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

WebUI.setText(findTestObject('Object Repository/Booking Services/input_search_keyword'), 'painting123')
//WebUI.click(findTestObject('Object Repository/Booking Services/button_Search'))
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Booking Services/button_Search'),5)
WebUI.scrollToPosition(0, 400)
WebUI.waitForElementVisible(findTestObject('Object Repository/Booking Services/p_Painting1'), 5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Booking Services/p_Painting1'),5)
//WebUI.click(findTestObject('Object Repository/Booking Services/p_Painting1'))
WebUI.scrollToPosition(0, 450)

//WebUI.click(findTestObject('Object Repository/Booking Services/serviceName'))

//WebUI.scrollToPosition(0, 450)

//CustomKeywords.'clickEvent.SelectServices.clickUsingJS'(findTestObject('Object Repository/Booking Services/div_yahoo f'))
WebUI.click(findTestObject('Object Repository/Booking Services/a_book now'))

WebUI.setText(findTestObject('Object Repository/Booking Services/input_email_address'), 'nazneenfatma60@gmail.com')

WebUI.setText(findTestObject('Object Repository/Booking Services/input_password'), 'admin#123')

WebUI.waitForElementVisible(findTestObject('Object Repository/Booking Services/input_button'), 10)
WebUI.click(findTestObject('Object Repository/Booking Services/input_button'), FailureHandling.STOP_ON_FAILURE)




//////////// date Picker and Add time/////////////////////////////


//WebUI.setText(findTestObject('Object Repository/Booking Services/input_start_date'), '08 July 2018' )
WebUI.waitForElementClickable(findTestObject('Object Repository/Booking Services/a_Want to add time'), 5)
WebUI.takeScreenshot("Booking.png")

//WebUI.click(findTestObject('Object Repository/Booking Services/a_Want to add time'), FailureHandling.STOP_ON_FAILURE)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Booking Services/input_start_date'), '02:00 PM', false)
WebUI.waitForElementClickable(findTestObject('Object Repository/Booking Services/a_Want to add time'), 5)
WebUI.click(findTestObject('Object Repository/Booking Services/a_next step'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Booking Services/input_billing_address1'), 5)
WebUI.setText(findTestObject('Object Repository/Booking Services/input_billing_address1'), 'sdff')

WebUI.setText(findTestObject('Object Repository/Booking Services/input_billing_city'), 'sdfdsf')

WebUI.setText(findTestObject('Object Repository/Booking Services/input_billing_state'), 'CAsdf')

WebUI.setText(findTestObject('Object Repository/Booking Services/input_billing_zip'), '4354646')

WebUI.setText(findTestObject('Booking By recording/textarea'), 'dfvdffgd')
WebUI.scrollToElement(findTestObject('Object Repository/Booking Services/Next Button for Step-2'),5)
//WebUI.takeScreenshot()
WebUI.focus(findTestObject('Object Repository/Booking Services/Next Button for Step-2'))
WebUI.waitForElementClickable(findTestObject('Object Repository/Booking Services/Next Button for Step-2'), 5)
WebUI.click(findTestObject('Object Repository/Booking Services/Next Button for Step-2'),FailureHandling.STOP_ON_FAILURE)
//CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Booking Services/a_next step'),30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Booking Services/input_billing_first_name'),5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Booking Services/input_billing_last_name'),5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Booking Services/input_billing_phone'),5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Booking Services/input_billing_email'),5)
WebUI.click(findTestObject('Object Repository/Booking Services/Next Button Step-3'),FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Booking Services/Page_Workilo  List Detail page/span_checkout'),FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Booking Services/change card details'))
WebUI.setText(findTestObject('Object Repository/Booking Services/Page_Workilo  List Detail page/input_card_number'), '4563310021976554')
WebUI.setText(findTestObject('Object Repository/Booking Services/Page_Workilo  List Detail page/input_month'), '01')
WebUI.setText(findTestObject('Object Repository/Booking Services/Page_Workilo  List Detail page/input_year'), '19')
WebUI.setText(findTestObject('Object Repository/Booking Services/Page_Workilo  List Detail page/input_cardholder_name'), 'Pawel WalcZuk')
WebUI.setText(findTestObject('Object Repository/Booking Services/Page_Workilo  List Detail page/input_cvc'), '827')

WebUI.click(findTestObject('Object Repository/Booking Services/Book now button'))

//WebUI.click(findTestObject('Booking By recording/i_book-close close'))

//WebUI.click(findTestObject('Booking By recording/span_menu-trigger'))

//WebUI.rightClick(findTestObject('Booking By recording/a_Sign Out'))

//WebUI.click(findTestObject('Booking By recording/a_Sign Out'))

//WebUI.closeBrowser()
