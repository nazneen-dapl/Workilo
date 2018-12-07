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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys

count=1
for(def row=1; row<=findTestData('Read data for Add listing').getRowNumbers();row++)
{

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.workilo.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_email_address'), findTestData('Read data for Add listing').getValue(
"Username", row), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_password'), findTestData('Read data for Add listing').getValue(
        "Password", row), FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'),5);
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'),5)

//WebUI.click(findTestObject('Add Listing/Page_Workilo  Service Provider Dash (2)/h2_Services you are offering'))
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/i_add-icon'),5)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_title'), findTestData('Read data for Add listing').getValue(
        "Product_name", row), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Please SelectAssemblyCr'),findTestData('Read data for Add listing').getValue("Category", row), true)


WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), findTestData('Read data for Add listing').getValue(
        "Tags", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 350)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description'), findTestData(
        'Read data for Add listing').getValue("Service_description", row))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_price'), findTestData('Read data for Add listing').getValue(
        "Total_price", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 350)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description_material'), 
    findTestData('Read data for Add listing').getValue("Material", row))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Miles willing to travel'), 
    findTestData('Read data for Add listing').getValue("Distance_to_cover", row), true)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_where_located'), findTestData(
        'Read data for Add listing').getValue("Enter Location", row), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_how_many_hours'), findTestData(
        'Read data for Add listing').getValue("Hours_of_completion", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 1000)

////div[@class='add-photo-section']
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_image-upload1'), findTestData(
        'Read data for Add listing').getValue("Add Photo", row), FailureHandling.STOP_ON_FAILURE)



WebUI.println("............................................")
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/imageUpload2'), findTestData(
        'Read data for Add listing').getValue("Add Photo2", row), FailureHandling.STOP_ON_FAILURE)


//---------------------------------------------
WebUI.waitForPageLoad(10)
//CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/delete button/delete button'),5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/imageUpload2'),5)


WebUI.println("............................................")
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/imageUpload3'), findTestData(
        'Read data for Add listing').getValue("Add Photo3", row), FailureHandling.STOP_ON_FAILURE)

//----------Rotate Pic

/*
WebUI.waitForPageLoad(10)
WebUI.waitForElementPresent(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/Rotate Image f/rotate image'),10)
WebUI.waitForElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/Rotate Image f/rotate image'),10)
WebUI.waitForPageLoad(10)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Add Listing/Page_Workilo  Create Listing/Rotate Image f/rotate image'),7)

CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/Rotate Image f/Rotate image button left'),5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/Rotate Image f/Rotate save button'),5)
*/

try
{
if(WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/Add More Listing'))){
	CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/Add More Listing'),5)
	}
else{
WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)

CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 
    5)

	}

}
		

catch(Exception e){
	def DuplicateEntry=WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/duplicateEntry'), 5)
	def ListingAdded=WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/ListingAdded'), 5)
	if (DuplicateEntry==true)
	{
		System.out.println("Duplicate ")
		WebUI.verifyMatch(DuplicateEntry,"Listing Already exist with the same title!")
	}
	else if(ListingAdded==true)
	{
		System.out.println("Listing added successfully")
		
		WebUI.verifyMatch(ListingAdded," Listing Added successfully!")
	}
}

finally{
WebUI.closeBrowser()
}
}