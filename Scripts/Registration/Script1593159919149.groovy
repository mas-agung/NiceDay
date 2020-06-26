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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\DS - AINO\\Katalon_Studio\\NiceDay\\APP\\niceday-coaching-therapie_1.1.9.apk', true)

Mobile.tap(findTestObject('register/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('register/android.widget.TextView0 - Create new account'), 0)

Mobile.setText(findTestObject('register/android.widget.EditText0 - First Name (1)'), GlobalVariable.first_name, 0)

Mobile.setText(findTestObject('register/android.widget.EditText0 - Last Name (1)'), GlobalVariable.last_name, 0)

Mobile.setText(findTestObject('register/android.widget.EditText0 - Email Address'), GlobalVariable.email, 0)

Mobile.setText(findTestObject('register/android.widget.EditText0 - Password'), GlobalVariable.password, 0)

Mobile.doubleTap(findTestObject('register/android.view.ViewGroup0 (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('register/android.view.ViewGroup0 (2)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('register/android.view.ViewGroup0 (3)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('register/android.widget.TextView0 - Create new account (1)'), 0)

WebUI.verifyElementChecked(findTestObject('register/android.widget.TextView0 - Welcome to NiceDay'), 0)

