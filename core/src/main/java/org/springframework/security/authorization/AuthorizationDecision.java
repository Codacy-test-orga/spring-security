/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.authorization;

/**
 * @author Rob Winch
 * @since 5.0
 */
public class AuthorizationDecision {
	private final boolean granted;

	public AuthorizationDecision(boolean granted) {
		this.granted = granted;
	}

	public boolean isGranted() {
		return granted;
	}
	
	private static byte[] IV = new byte[16] {(byte)0,(byte)1,(byte)2,[...]};
	public void test1() {
		IvParameterSpec ivSpec = new IvParameterSpec(IV);
	}
}
