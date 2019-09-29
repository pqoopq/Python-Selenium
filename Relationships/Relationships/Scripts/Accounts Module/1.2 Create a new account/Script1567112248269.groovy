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

String text = ''

WebUI.openBrowser('https://salestest.dev.sugar.ib4t.co/')

WebUI.waitForPageLoad(2, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Login/Page_SugarCRM/input__username'), GlobalVariable.userName)

WebUI.sendKeys(findTestObject('Login/Page_SugarCRM/input__password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/Page_SugarCRM/a_Log In'))

WebUI.waitForElementPresent(findTestObject('Login/Page_HomePage/navigation-Accounts-more'), 5)

WebUI.click(findTestObject('Login/Page_HomePage/navigation-Accounts-more'))

WebUI.waitForElementPresent(findTestObject('Login/Page_HomePage/list-Create-Account'), 5)

WebUI.click(findTestObject('Login/Page_HomePage/list-Create-Account'))

WebUI.waitForElementPresent(findTestObject('Accounts Module/Pane-Create New Account/input_Lead Source Description'), 5)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/ddl_Teams'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/option-Search and Select'))

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Search by primary team name'), 'Hyundai team')

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Accounts Module/Pane-Create New Account/radioButton-Select'), 5)

WebUI.clickOffset(findTestObject('Accounts Module/Pane-Create New Account/radioButton-Select'), 2, 2)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Accounts Module/Pane-Create New Account/ddl_Account Type'), 2)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/ddl_Account Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/option-Prospect'))

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/ddl_Customer Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/option-Individual'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_First Name'), 'Ktest1')

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Last Name'), 'Test1')

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Billing Address_Street'), 'AA')

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Billing Address_Surburb'), 'BB')

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Billing Address_City'), 'CC')

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Billing Address_Postalcode'), '0000')

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Billing Address_Country'), 'DD')

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/ddl_Lead Source'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/option-Brand'))

WebUI.setText(findTestObject('Accounts Module/Pane-Create New Account/input_Lead Source Description'), 'others')

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/button_Save'))

WebUI.waitForElementPresent(findTestObject('Accounts Module/Pane-Create New Account/alert-Success'), 2)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/alert-Success'))

WebUI.waitForElementPresent(findTestObject('Accounts Module/Pane-Create New Account/link-Contact Module'), 2)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/link-Contact Module'))

WebUI.waitForElementPresent(findTestObject('Accounts Module/Pane-Create New Account/link-Accounts Module'), 2)

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/link-Accounts Module'))

WebUI.waitForJQueryLoad(2)

//added by Kathleen Wang (28.08.2019) to check the text contains Hyundai Team
//WebUI.verifyElementText(findTestObject('Accounts Module/Pane-Create New Account/ddl_Teams'), 'Hyundai Team')
WebUI.verifyElementText(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Account Type'), 'Prospect')

WebUI.verifyElementText(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Customer Type'), 'Individual')

WebUI.verifyElementText(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/First Name'), 'Ktest1')

WebUI.verifyElementText(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Last Name'), 'Test1')

WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Address Block'))

WebUI.verifyElementText(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Billing Address_Street'), 
    'AA')

//WebUI.click(findTestObject('Accounts Module/Pane-Create New Account/input_Billing Address_Surburb'))
not_run: WebUI.verifyElementAttributeValue(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Billing Address_Surburb'), 
    'value', 'BB', 1)

// Added by Kathleen
//text = WebUI.getAttribute(findTestObject('Accounts Module/Pane-Create New Account/input_Billing Address_Surburb'),'value')
//WebUI.verifyEqual(text,'BB')
not_run: WebUI.verifyElementAttributeValue(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Billing Address_City'), 
    'value', 'CC', 1)

not_run: WebUI.verifyElementAttributeValue(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Billing Address_Postalcode'), 
    'value', '0000', 1)

not_run: WebUI.verifyElementAttributeValue(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Billing Address_Country'), 
    'value', 'DD', 1)

text = WebUI.getText(findTestObject('Accounts Module/Pane-Create New Account/Verify-Object_Content/Lead Source'))

