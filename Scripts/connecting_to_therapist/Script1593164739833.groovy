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

Mobile.tap(findTestObject('connecting_to_therapist/android.widget.TextView0 - Skip'), 0)

Mobile.tap(findTestObject('connecting_to_therapist/android.widget.TextView0 - Next (1)'), 0)

Mobile.tap(findTestObject('connecting_to_therapist/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('connecting_to_therapist/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('connecting_to_therapist/android.widget.TextView0 - Continue'), 0)

Mobile.setText(findTestObject('connecting_to_therapist/android.widget.EditText0 - Search for a professional (1)'), GlobalVariable.therapist_name, 
    0)

Mobile.closeApplication()

