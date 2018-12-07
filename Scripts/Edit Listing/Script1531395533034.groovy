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

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_title'), findTestData('Edit_listing').getValue(
	"Product_name", row), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Please SelectAssemblyCr'),findTestData('Edit_listing').getValue("Category", row), true)

removeTags=WebUI.waitForElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'),5)
/// Remove Tag
if(removeTags==true)
{
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Edit Listing/remove tag'),5)
WebUI.acceptAlert()


WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), findTestData('Edit_listing').getValue(
	"Tags", row), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/Edit Listing/remove tag'))
CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Edit Listing/outside hover'),5)
}
else
{
	
}
WebUI.scrollToPosition(0, 350)
//WebUI.doubleClick('Object Repository/Edit Listing/Edit text area')
//WebUI.sendKeys(findTestObject('Object Repository/Edit Listing/Edit text area'),Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Listing/Edit text area'), findTestData(
	'Edit_listing').getValue("Service_description", row), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_price'), findTestData('Edit_listing').getValue(
	"Total_price", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Edit Listing/Material provided in the price'),5)

WebUI.setText(findTestObject('Object Repository/Edit Listing/Material provided in the price'),
findTestData('Edit_listing').getValue("Material", row),FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Miles willing to travel'),
findTestData('Edit_listing').getValue("Distance_to_cover", row), true)

WebUI.setText(findTestObject('Object Repository/Edit Listing/location enter'), findTestData(
	'Edit_listing').getValue("Enter Location", row), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Edit Listing/hours of completeion'), findTestData(
	'Edit_listing').getValue("Hours_of_completion", row), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 1000)

////div[@class='add-photo-section']

//WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_image-upload1'), 'C:\\Users\\Asset-192\\Desktop\\sample images\\br.jpg',
//FailureHandling.STOP_ON_FAILURE)

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
try
{
def errMsg1=WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/duplicateEntry'), 5)
def errMsg2=WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Service Provider Dash/ListingAdded'), 5)
if (errMsg1==true)
{
	System.out.println("Duplicate ")
	 
}
else if(errMsg2==true)
{
	System.out.println("Listing Edited successfully")
	
}

}
catch(Exception e){

}

WebUI.closeBrowser()

}


