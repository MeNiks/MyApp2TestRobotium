package com.niks.app2test.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.niks.app2test.MainActivity;
import com.niks.app2test.SecondActivity;
import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.niks.app2test.R;

public class TestMainActivity extends
		ActivityInstrumentationTestCase2<MainActivity> {
	private Solo solo;

	public TestMainActivity() {
		super(MainActivity.class);

	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testCase() throws Exception {

		testInsertData();
		
		solo.waitForText("Nikhileh");
		// testButtonClick();
		// goToBackActivity();
		// testCheckCurrentActivity();
		// checkMemorySpace();
	}

	private void checkMemorySpace() {
		solo.assertMemoryNotLow();
	}

	private void testCheckCurrentActivity() {
		solo.assertCurrentActivity("Current Activity", MainActivity.class);

	}

	private void goToBackActivity() {
		solo.goBack();
	}

	private void testButtonClick() {

		// Button index starts from 0
		// Whechever will be the first button on ui will be considered as
		// 0-index
		solo.clickOnButton(0);
		// button1 is the button id
		solo.clickOnButton("button1");
		solo.clickOnButton("button2");

	}

	private void testInsertData() throws Exception {

		solo.sleep(500);
		EditText et_text = (EditText) solo.getView("et_text");
		solo.enterText(et_text, "Nikhilesh");
		solo.sleep(500);
		EditText et_name = (EditText) solo.getView("et_name");
		solo.enterText(et_name, "Nikhilesh");
		solo.sleep(500);
		EditText et_password = (EditText) solo.getView("et_password");
		solo.enterText(et_password, "Nikhilesh");
		solo.sleep(500);
		EditText et_email = (EditText) solo.getView("et_email");
		solo.enterText(et_email, "Nikhilesh");
		solo.sleep(500);
		EditText et_phone = (EditText) solo.getView("et_phone");
		solo.enterText(et_phone, "Nikhilesh");
		solo.sleep(500);
		EditText et_address = (EditText) solo.getView("et_address");
		solo.enterText(et_phone, "Nikhilesh");
		solo.sleep(500);
		solo.enterText(et_address, et_address.getText() + "new value on field");
		solo.sleep(500);
		// solo.setDatePicker(datePicker, 2014, 1, 5);

	}

	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}
