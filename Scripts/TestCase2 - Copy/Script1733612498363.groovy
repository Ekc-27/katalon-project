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

WebUI.navigateToUrl('https://next.malinko-uat.co.uk/day/user')

driver.sleep(3000)

WebUI.setText(findTestObject('Object Repository/Page_Civica Scheduling - New Session/input_Email_useremail'), 'aditee.ranade@civica.co.uk ')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Civica Scheduling - New Session/input_Password_userpassword'), 
    'NF27hUjOgM0/JycWsmfcZsYz8T0Q5CIm')

WebUI.setText(findTestObject('Object Repository/Page_Civica Scheduling - New Session/input_Email_useremail'), 'aditee.ranade@civica.co.uk')

WebUI.click(findTestObject('Object Repository/Page_Civica Scheduling - New Session/input_Password_commit'))

WebUI.verifyElementPresent(findTestObject('LoginPageObjects/nextbtn'), 0)

WebUI.click(findTestObject('LoginPageObjects/nextbtn'))

