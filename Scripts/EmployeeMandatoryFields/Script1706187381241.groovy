import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://192.168.100.144:3000/dashboard/')

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Log in/input_email'), 'admin@icptechno.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Page_IECC  Log in/input_password'), 'F0SXhWetBUA=')

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Log in/button_Log in'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Dashboard  Admin/div_employee'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Dashboard  Admin/a_add'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_firstName'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/button_Save'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_First Name is required'), 
    'First Name is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Last Name is required'), 
    'Last Name is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Date of birth is required'), 
    'Date of birth is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Gender is required'), 
    'Gender is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Status is required'), 
    'Status is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Role is required'), 'Role is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Address Line 1 is required'), 
    'Address Line 1 is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_City is required'), 'City is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Postal code is required'), 
    'Postal code is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Mobile Number is required'), 
    'Mobile Number is required')

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Email Address is required'), 
    'Email Address is required')

WebUI.closeBrowser()

