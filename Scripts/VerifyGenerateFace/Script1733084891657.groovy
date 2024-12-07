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

WebUI.navigateToUrl('https://next.malinko-uat.co.uk/users/sign_in')

WebUI.setText(findTestObject('Object Repository/LoginPageObjects/input_Email_useremail'), 'aditee.ranade@civica.co.uk')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPageObjects/input_Password_userpassword'), 'NF27hUjOgM0/JycWsmfcZsYz8T0Q5CIm')

WebUI.click(findTestObject('LoginPageObjects/input_Password_commit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPageObjects/h2_Hello, Aditee Ranade_East Midlands'), 0)

WebUI.navigateToUrl('https://next.malinko-uat.co.uk/c/1056293/e/new')

WebUI.verifyElementPresent(findTestObject('GenerateFaceObjects/SearchBar'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/GenerateFaceObjects/select_Please SelectFace to Face VisitVirtu_a88433'), 
    'HH', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/GenerateFaceObjects/select_LONDONmilton keynesNorthSouth'), 
    '8708', true)

WebUI.click(findTestObject('Object Repository/GenerateFaceObjects/input_Interventions_event_item56002'))

WebUI.scrollToElement(findTestObject('GenerateFaceObjects/input_Visit Notes_commit'), 0)

WebUI.click(findTestObject('Object Repository/GenerateFaceObjects/input_Visit Notes_commit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GenerateFaceObjects/span_Successfully added Visit for Patient 1056293'), 
    0)

WebUI.closeBrowser()

