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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.workilo.com/')

WebUI.click(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Welcome/a_Log In'))
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Welcome/input_email_address'),
	'pawel.r.walczuk@gmail.com')

WebUI.setText(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Welcome/input_password'), 'admin#123')
WebUI.scrollToElement(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Welcome/input_button'), 5)
//CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Welcome/input_button'),5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Welcome/input_button'),5)
//WebUI.verifyElementVisible(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Service Provider Dash/span_menu-trigger'))
//WebUI.waitForElementVisible(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Service Provider Dash/span_menu-trigger'), 10)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Service Provider Dash/span_menu-trigger'),5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Service Provider Dash/a_nazneen f.'),5)
WebUI.uploadFile(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Shop Info/input_image'), 'C:\\Users\\Asset-192\\Desktop\\sample images\\car1.jpg')
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Service Provider Dash/span_menu-trigger'),5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Update Profile Image/Page_Workilo  Shop Info/a_Sign Out'),5)
WebUI.closeBrowser()

