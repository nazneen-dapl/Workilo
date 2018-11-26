import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

for (def row = 1; row <= findTestData('signup_customer').getRowNumbers(); row++) {
	WebUI.openBrowser('')

	WebUI.navigateToUrl('https://www.workilo.com/')

	WebUI.maximizeWindow()
	
	//WebUI.waitForElementVisible(findTestObject('sign up for service provider recording/Page_Workilo  Welcome/a_Sign Up'),5)
	//WebUI.verifyElementVisible(findTestObject('sign up for service provider recording/Page_Workilo  Welcome/a_Sign Up'))
	//WebUI.click(findTestObject('sign up for service provider recording/Page_Workilo  Welcome/a_Sign Up')
	CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('sign up for service provider/Page_Workilo  Welcome/a_Sign Up'),
		5)

   // WebUI.click(findTestObject('sign up for service provider/Page_Workilo  Welcome/a_Service Provider'))

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/input_email_address'), findTestData(
			'SignUp_ServiceProvider').getValue('email_address', row))

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/input_first_name'), findTestData(
			'SignUp_ServiceProvider').getValue('first_name', row))

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/input_last_name'), findTestData(
			'SignUp_ServiceProvider').getValue('last_name', row))

	//WebUI.setText(findTestObject('sign up for service provider recording/Page_Workilo  Welcome/input_new_password'), '90876543')
	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/input_new_password'), findTestData(
			'SignUp_ServiceProvider').getValue('new_password', row))

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/input_contact_number'), findTestData(
			'SignUp_ServiceProvider').getValue('Contact no', row))

	CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('sign up for service provider/Page_Workilo  Welcome/input_button'),
		5)

	
	
   try {
	
	
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/Duplicate Email'),FailureHandling.OPTIONAL))
	 WebUI.click(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/Duplicate Email'))
	}
 catch (Exception e) {
	  //WebUI.verifyElementPresent(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Welcome/ShopCreatePage') , 5)
	  title = WebUI.getWindowTitle()
	  WebUI.verifyMatch(title, "Workilo :: Home Improvement And Renovation Services in Brooklyn by Workilo", true)
	
	  if( WebUI.verifyElementPresent(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/Profile Image'),5, FailureHandling.OPTIONAL))
	   {
		   WebUI.uploadFile(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/Profile Image'),
		findTestData('SignUp_ServiceProvider').getValue('profile_image', row), FailureHandling.STOP_ON_FAILURE)

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/input_shop_name'),
		findTestData('SignUp_ServiceProvider').getValue('store_front_name', row))

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/li_Phone Number'),
		findTestData('SignUp_ServiceProvider').getValue('phone_number', row))

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/input_address'),
		findTestData('SignUp_ServiceProvider').getValue('street_address', row))

	// WebUI.setText(findTestObject('sign up for service provider recording/Page_Workilo  Shop Setup/input_apt_suit_other'),
	//  findTestData('SignUp_ServiceProvider').getValue('apt/suit/other', row))
	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/input_user_zip'), findTestData(
			'SignUp_ServiceProvider').getValue('zip_code', row))

	WebUI.setText(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/input_city'), findTestData(
			'SignUp_ServiceProvider').getValue('city', row))

	//WebUI.verifyElementVisible(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/select_AlabamaAlaskaArizonaArk'), 10)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/select_AlabamaAlaskaArizonaArk'),
		findTestData('SignUp_ServiceProvider').getValue('state', row), true)

	CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('sign up for service provider/Page_Workilo  Shop Setup/input_step-button'),
		5)

	//WebUI.click(findTestObject('sign up for service provider recording/Page_Workilo  Shop Setup/input_step-button'))
	//WebUI.click(findTestObject('sign up for service provider recording/Page_Workilo  Shop Setup/span_Profile Image'))
	//WebUI.click(findTestObject('sign up for service provider recording/Page_Workilo  Shop Setup/input_step-button'))
	////-----------Product Listing-----------------------------
	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_title'), findTestData(
			'SignUp_ServiceProvider').getValue('Product_name', row), FailureHandling.STOP_ON_FAILURE)

	WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Please SelectAssemblyCr'),
		findTestData('SignUp_ServiceProvider').getValue('Category', row), true)

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), findTestData(
			'SignUp_ServiceProvider').getValue('Tags', row), FailureHandling.STOP_ON_FAILURE)

	WebUI.sendKeys(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), Keys.chord(Keys.ENTER),
		FailureHandling.STOP_ON_FAILURE)

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), findTestData(
			'SignUp_ServiceProvider').getValue(1, row), FailureHandling.STOP_ON_FAILURE)

	WebUI.sendKeys(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), Keys.chord(Keys.ENTER))

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), findTestData(
			'SignUp_ServiceProvider').getValue(1, row), FailureHandling.STOP_ON_FAILURE)

	WebUI.sendKeys(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_cell'), Keys.chord(Keys.ENTER))

	//WebUI.leftClick(findTestObject('Add Listing/Page_Workilo  Create Listing (2)/div_service or gig details    _1'))
	//WebUI.scrollToElement(findTestObject('Add Listing/Page_Workilo  Create Listing (2)/input_price'), '100')
	//WebUI.scrollToElement(findTestObject('Add Listing/Create listing (2)/input_price'), '100')
	WebUI.scrollToPosition(0, 350)

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description'), findTestData(
			'SignUp_ServiceProvider').getValue('Service_description', row))

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_price'), findTestData(
			'SignUp_ServiceProvider').getValue('Total_price', row), FailureHandling.STOP_ON_FAILURE)

	WebUI.scrollToPosition(0, 350)

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/textarea_description_material'),
		findTestData('SignUp_ServiceProvider').getValue('Material', row))

	WebUI.selectOptionByValue(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/select_Miles willing to travel'),
		findTestData('SignUp_ServiceProvider').getValue('Distance_to_cover', row), true)

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_where_located'), findTestData(
			'SignUp_ServiceProvider').getValue('Enter Location', row), FailureHandling.STOP_ON_FAILURE)

	WebUI.setText(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_how_many_hours'), findTestData(
			'SignUp_ServiceProvider').getValue('Hours_of_completion', row), FailureHandling.STOP_ON_FAILURE)

	WebUI.scrollToPosition(0, 1000)

	////div[@class='add-photo-section']
	WebUI.uploadFile(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/input_image-upload1'), 'C:\\Users\\Asset-192\\Desktop\\sample images\\br.jpg',
		FailureHandling.STOP_ON_FAILURE)

	WebUI.verifyElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))

	WebUI.waitForElementVisible(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)

	WebUI.scrollToElement(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)

	/*
	WebUI.waitForElementClickable(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'), 5)
	WebUI.click(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'))
	
	*/
	CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Add Listing/Page_Workilo  Create Listing/save'),
		5)

	
	
	int timeout = 1
	
	DuplicateProductName = findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Listings/Duplicate listing label') 
	ListingAddedSuccessfully=findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Listings/Listing Added')
	
	// FailureHandling.STOP_ON_FAILURE = Default behavior. Exits/fails the test when the element is not found
	// FailureHandling.CONTINUE_ON_FAILURE = reports that an error occurred during the run but doesn't exit; continues running the "else" clause
	// FailureHandling.OPTIONAL = no error reported; continues running the "else" clause
	if (WebUI.verifyElementPresent(DuplicateProductName, timeout, FailureHandling.OPTIONAL)) {
		
	} else {
		WebUI.click(ListingAddedSuccessfully)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/step3'), 5)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/Open Shop Time'),
			findTestData('SignUp_ServiceProvider').getValue('shop open time', row), false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/Close shop time'),
			findTestData('SignUp_ServiceProvider').getValue('shop close time', row), false)

		WebUI.scrollToElement(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/openshop'),
			5)

		WebUI.click(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/openshop'))
		
		WebUI.scrollToElement( findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/Continue button'), 5)
		WebUI.click(findTestObject('Object Repository/Sign up for service provider/Page_Workilo  Shop Setup/Continue button'))
	}				
   }
 }
   
//************** Checking for validation*******************************************************************
 
  finally{
WebUI.closeBrowser()
}
}

