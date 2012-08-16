/*
 * ###
 * Archetype - phresco-android-native-archetype
 * 
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ###
 */
/**
 * 
 */
package com.photon.phresco.nativeapp.performance.test.testcases;

import junit.framework.TestCase;
import android.util.Log;
import android.widget.Button;

import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.nativeapp.R;

/**
 * @author chandankumar_r
 *		   This testcase is for clicking on button in
 *         mainActivity. After click on button will see one toast message
 *         
 */
public class MainActivityVerificationTest extends TestCase{
	
	private Solo soloMain;
	private Button btn;
	private String activityName;
	
	private final String TAG = "MainActivityVerificationTest******";
	
	public MainActivityVerificationTest(Solo solo) {
		this.soloMain = solo;

	}
	
	/**
	 * 
	 * 				@throws TestException
	 *              After execution of setUp() method in MainTest class this
	 *              testMain() will be called and it contains methods for click
	 *              on button which will show one toast message
	 */
	
	public void testMain() throws TestException {

		try {
			Log.i(TAG, "------It is testMain()-----------");
			

			activityName = soloMain.getCurrentActivity().getClass().getSimpleName();

			if (activityName.equalsIgnoreCase("MainActivity")) {
				Log.i(TAG, "------It is MainActivity-----------" + activityName);
				
				soloMain.waitForActivity("MainActivity", 2000);
				
				// click on button
				// get the button view with id i.e R.id.button
				btn = (Button) soloMain.getView(R.id.button);
				
				// click on login button with view id
				soloMain.clickOnView(btn);
				Thread.sleep(3000);

			} else {
				Log.i(TAG, "------ testMain failed-----------");
				throw new TestException("Current Activity Failed----"
						+ soloMain.getCurrentActivity().getClass().getSimpleName() + "failed");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
