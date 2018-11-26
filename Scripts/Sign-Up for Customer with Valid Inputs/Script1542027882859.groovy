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
	
	CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Signup_Customer/signup_menu'),5)

	WebUI.click(findTestObject('Object Repository/Signup_Customer/customer_menu'))
	
	WebUI.setText(findTestObject('Object Repository/Signup_Customer/email'), findTestData('signup_customer').getValue('Email', row))

	WebUI.setText(findTestObject('Object Repository/Signup_Customer/first name'), findTestData(
			'signup_customer').getValue('FirstName', row))

	WebUI.setText(findTestObject('Object Repository/Signup_Customer/Last Name'), findTestData(
			'signup_customer').getValue('LastName', row))

	
	//WebUI.setText(findTestObject('sign up for service provider recording/Page_Workilo  Welcome/input_new_password'), '90876543')
	WebUI.setText(findTestObject('Object Repository/Signup_Customer/Password'), findTestData(
			'signup_customer').getValue('Password', row))

	WebUI.setText(findTestObject('Object Repository/Signup_Customer/Contact NO'), findTestData(
			'signup_customer').getValue('ContactNo', row))

	CustomKeywords.'clickEvent.SelectServices.clickUsingJS1'(findTestObject('Object Repository/Signup_Customer/Submit Button'),5)
	
	
	try{
		WebUI.verifyElementPresent(findTestObject('Object Repository/Signup_Customer/DuplicateEmail'),5 )
		WebUI.click(findTestObject('Object Repository/Signup_Customer/DuplicateEmail'))
		}
	
	catch(Exception e){
					
		}
	WebUI.closeBrowser()
	
}

