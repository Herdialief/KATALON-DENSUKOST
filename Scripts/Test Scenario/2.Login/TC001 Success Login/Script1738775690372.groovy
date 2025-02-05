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

WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Maximized Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Navigate to Landing Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing Page/a_Masuk'))

WebUI.waitForElementPresent(findTestObject('Login/h1_Selamat Datang'), 0)

WebUI.setText(findTestObject('Login/input_email_login'), 'ableh@mail.com')

WebUI.setEncryptedText(findTestObject('Login/input_password_login'), 'vOoj4tQjAWVV9mKJ1JcWEw==')

WebUI.click(findTestObject('Login/input_submit_login'))

WebUI.waitForElementPresent(findTestObject('Dashboard/h1_Dashboard'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard/h1_Dashboard'), 0)

WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

