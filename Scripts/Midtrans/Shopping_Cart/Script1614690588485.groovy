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

WebUI.setText(findTestObject('Midtrans/Shopping_Cart_Menu/Midtrans_Pillow'), '25000')

WebUI.setText(findTestObject('Midtrans/Shopping_Cart_Menu/Input_Name'), 'Malik Mukti')

WebUI.setText(findTestObject('Midtrans/Shopping_Cart_Menu/Input_Email'), 'malikspy@mailnesia.com')

WebUI.setText(findTestObject('Midtrans/Shopping_Cart_Menu/Input_PhoneNumber'), '085672536426')

WebUI.setText(findTestObject('Midtrans/Shopping_Cart_Menu/Input_City'), 'Bogor')

WebUI.setText(findTestObject('Midtrans/Shopping_Cart_Menu/Input_Address'), 'Jalan Dramaga , Kabupaten Bogor')

WebUI.setText(findTestObject('Midtrans/Shopping_Cart_Menu/Input_PostalCode'), '19722')

WebUI.delay(5)

WebUI.click(findTestObject('Midtrans/Shopping_Cart_Menu/Btn_CheckOut'))

WebUI.switchToFrame(findTestObject('Midtrans/Shopping_Cart_Menu/Iframe_1'), 2)

