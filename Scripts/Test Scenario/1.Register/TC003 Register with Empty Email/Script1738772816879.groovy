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

WebUI.callTestCase(findTestCase('Blocks/Navigate to Register Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Register/h1_DAFTAR AKUN'), 0)

WebUI.setText(findTestObject('Register/input_nama_lengkap_reg'), 'ableh')

WebUI.setText(findTestObject('Register/input_mail_reg'), '')

WebUI.setText(findTestObject('Register/input_nomor_reg'), '628121122188')

WebUI.setEncryptedText(findTestObject('Register/input_password_reg'), 'vOoj4tQjAWVV9mKJ1JcWEw==')

WebUI.setEncryptedText(findTestObject('Register/input_Repeat_Password_reg'), 'vOoj4tQjAWVV9mKJ1JcWEw==')

WebUI.click(findTestObject('Register/button_SIGN UP'))

WebUI.verifyElementPresent(findTestObject('Register/div_Harap isi alamat email anda'), 0)

WebUI.verifyElementText(findTestObject('Register/div_Harap isi alamat email anda'), 'Harap isi alamat email anda.')

WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

