import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://salestest.dev.sugar.ib4t.co/')

WebUI.waitForPageLoad(2)

WebUI.sendKeys(findTestObject('Login/Page_SugarCRM/input__username'), 'kwang')

WebUI.sendKeys(findTestObject('Login/Page_SugarCRM/input__password'), 'KatWan19')

WebUI.click(findTestObject('Login/Page_SugarCRM/a_Log In'))

WebUI.navigateToUrl('https://salestest.dev.sugar.ib4t.co/#Accounts/49d65c0e-cd08-11e9-b8b7-fa163e552948')

//try to test the Function


