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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://anteraja.id/')

WebUI.click(findTestObject('Object Repository/Page_Anteraja Jasa Pengiriman Barang Online_bf332d/a_Layanan'))

WebUI.click(findTestObject('Object Repository/Page_Anteraja Jasa Pengiriman Barang Online_bf332d/a_Cek Ongkir'))

WebUI.setText(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Input_Origin'), 
    origin)

WebUI.click(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Dropdown_Origin'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Input_Destination'), 
    destination)

WebUI.click(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Dropdown_Destination'))

WebUI.click(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Button_CekOngkir'))

WebUI.verifyElementPresent(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Regular'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Ongkir_Regular'), 0)

// validation ongkir reguler
String actualOngkirReg = WebUI.getText(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Ongkir_Regular'))

KeywordUtil.logInfo(actualOngkirReg)

WebUI.verifyEqual(actualOngkirReg, expectedOngkirReg)

WebUI.verifyElementPresent(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Estimate_Regular'), 0)

// validation estimate reguler
String actualEstimateReg = WebUI.getText(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Estimate_Regular'))

KeywordUtil.logInfo(actualEstimateReg)

WebUI.verifyEqual(actualEstimateReg, expectedEstimateReg)

WebUI.verifyElementPresent(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Frozen'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Ongkir_Frozen'), 0)

// validation ongkir frozen
String actualOngkirFrozen = WebUI.getText(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Ongkir_Frozen'))

KeywordUtil.logInfo(actualOngkirFrozen)

WebUI.verifyEqual(actualOngkirFrozen, expectedOngkirFrozen)

WebUI.verifyElementPresent(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Estimate_Frozen'), 0)

// validation estimate frozen
String actualEstimateFrozen = WebUI.getText(findTestObject('Page_Informasi Ongkos Kirim - Anteraja/Value_Estimate_Frozen'))

KeywordUtil.logInfo(actualEstimateFrozen)

WebUI.verifyEqual(actualEstimateFrozen, expectedEstimateFrozen)

WebUI.closeBrowser()

