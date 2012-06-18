/*
 * ###
 * PHR_android-native-hw
 * %%
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * %%
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
package com.photon.phresco.nativeapp.unit.test;

import junit.framework.TestSuite;

import com.photon.phresco.nativeapp.unit.test.testcases.A_MainActivityTest;

public class AllTests extends TestSuite {
	public static TestSuite suite() {

		TestSuite suite = new TestSuite(AllTests.class.getName());

		suite.addTestSuite(A_MainActivityTest.class);

		return suite;

	}

	public ClassLoader getLoader() {
		return AllTests.class.getClassLoader();
	}
}
