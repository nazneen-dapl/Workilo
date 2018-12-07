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

for(def row=1; row<=findTestData('Add_Listing_Invalid_Input').getRowNumbers();row++)
{

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.workilo.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_email_address'), findTestData('Add_Listing_Invalid_Input').getValue(
"Username", row), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_password'), findTestData('Add_Listing_Invalid_Input').getValue(
        "Password", row), FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'),5);
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Welcome/input_button'),5)

//WebUI.click(findTestObject('Add Listing/Page_Workilo  Service Provider Dash (2)/h2_Services you are offering'))
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/i_add-icon'),5)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_title'), findTestData('Add_Listing_Invalid_Input').getValue(
        "Product_name", row), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Please SelectAssemblyCr'),findTestData('Add_Listing_Invalid_Input').getValue("Category", row), true)


WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), findTestData('Add_Listing_Invalid_Input').getValue(
        "Tags", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 350)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description'), findTestData(
        'Add_Listing_Invalid_Input').getValue("Service_description", row))

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_price'), findTestData('Add_Listing_Invalid_Input').getValue(
        "Total_price", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 350)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description_material'), 
    findTestData('Add_Listing_Invalid_Input').getValue("Material", row))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Miles willing to travel'), 
    findTestData('Add_Listing_Invalid_Input').getValue("Distance_to_cover", row), true)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_where_located'), findTestData(
        'Add_Listing_Invalid_Input').getValue("Enter Location", row), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_how_many_hours'), findTestData(
        'Add_Listing_Invalid_Input').getValue("Hours_of_completion", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 1000)

////div[@class='add-photo-section']
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_image-upload1'), findTestData(
        'Add_Listing_Invalid_Input').getValue("Add Photo", row), FailureHandling.STOP_ON_FAILURE)


WebUI.println("..............................................................")
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/imageUpload2'), findTestData(
        'Add_Listing_Invalid_Input').getValue("Add Photo2", row), FailureHandling.STOP_ON_FAILURE)


//---------------------------------------------
WebUI.waitForPageLoad(10)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/delete button/delete button'),5)
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/imageUpload2'),5)


WebUI.println("............................................")
WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/imageUpload3'), findTestData(
        'Add_Listing_Invalid_Input').getValue("Add Photo3", row), FailureHandling.STOP_ON_FAILURE)



WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)

/*
WebUI.waitForElementClickable(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)
WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))

*/
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 
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
BlankProductName=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Products Name'),5 )
BlankCategory=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Blank input for category'),5  )
BlankDescription=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Blank input for description'),5  )
BlankPrice=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Price'),5  )
BlankMaterials=WebUI.verifyElementPresent( findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Material'),5  )
BlankTravel=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Distance to cover'),5 )
BlankLocation=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Location'),5 )
BlankHours=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Hours to comeplete'),5  )
//BlankPrimaryIMage=WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/BlankPrimaryImage'),5 )

try
{
	
	if(BlankProductName== ' ' || BlankCategory== ' ' ||BlankDescription== ' ' ||BlankPrice== ' ' ||BlankMaterials== ' ' ||BlankTravel== ' ' ||BlankLocation== ' ' ||BlankProductName== ' ' || BlankHours== ' ')
	{
		System.Out.println("Blank Inputs")
	}
	
	//BlankProductName=WebUI.getText(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Blank Inputs/Blank Inputs for Product name'),5)
	//WebUI.verifyMatch(BlankProductName,"THIS FIELD IS REQUIRED.")
	}	

catch(Exception e){
	
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Price 0') ,FailureHandling.OPTIONAL))
	{
		ExpectedPriceValue=WebUI.getText(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Price 0'))
		WebUI.verifyMatch(ExpectedPriceValue,"ENTER VALUE GREATER THAN 0")
	}
	
	else if(WebUI.verifyElementPresent(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Img size') ,FailureHandling.OPTIONAL ))
	{
		ImageFormat=WebUI.getText(findTestObject('Object Repository/Add Listing/Add Listing for Invalid Inputs/Img size'))
		WebUI.verifyMatch(ImageFormat,"IMAGE SIZE MUST BIGGER THAN 680 X 680")
		
	}
		
}
//finally{
//WebUI.closeBrowser()
//}
}