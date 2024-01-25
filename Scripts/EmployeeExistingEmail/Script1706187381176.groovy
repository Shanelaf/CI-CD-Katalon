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

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Page_IECC  Log in/input_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Log in/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Page_IECC  Log in/input_password'), 'F0SXhWetBUA=')

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Log in/button_Log in'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Dashboard  Admin/div_employee'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Dashboard  Admin/a_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_firstName'), 'Zee')

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_lastName'), 'Teal')

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/button_MuiButtonBase-root MuiIconButton-roo_2ed700'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/div_January 2008'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/button_1997'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/button_9'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/select_Choose hereMaleFemale'), 
    'Male', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/select_Choose hereSingleMarriedNone'), 
    'Single', true)

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_personalIdentityNo'), '0010034995')

WebUI.selectOptionByValue(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/select_Choose hereDraftPendingApprovedRejected'), 
    'none', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/select_Choose hereDraftPendingApprovedRejected'), 
    '30', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/select_Choose hereCare GiverSupervisorAdmin_2ab203'), 
    'CARE_GIVER', true)

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_addressLine1'), 'Line 01')

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_addressLine2'), 'Line 02')

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_city'), 'Colombo')

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_zipCode'), '11223')

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_mobile'), '077123456222')

WebUI.setText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/input_email'), 'test@test.com')

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/button_Save'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/button_Save'))

WebUI.click(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Employee/Page_IECC  Employee Register/p_Email address already exists'), 
    'Email address already exists.')

WebUI.closeBrowser()

