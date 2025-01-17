/**
 * Copyright (C) 2010-2015 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.test.prefs;

import java.util.Set;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.DefaultFloat;
import org.androidannotations.annotations.sharedpreferences.DefaultInt;
import org.androidannotations.annotations.sharedpreferences.DefaultLong;
import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.SharedPref;
import org.androidannotations.annotations.sharedpreferences.SharedPref.Scope;
import org.androidannotations.test.R;

@SharedPref(Scope.UNIQUE)
public interface SomePrefs {
	
	@DefaultString("John")
	String name();
	
	@DefaultInt(42)
	int age();
	
	@DefaultLong(400000L)
	long ageLong();

	@DefaultFloat(42f)
	float ageFloat();
	
	@DefaultBoolean(true)
	boolean isAwesome();
	
	@DefaultInt(value = 42, keyRes = R.string.prefStringKey)
	int stringResKeyPref();

	long lastUpdated();

	Set<String> types();
}
