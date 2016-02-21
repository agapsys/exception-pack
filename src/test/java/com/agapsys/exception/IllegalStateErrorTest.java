/*
 * Copyright 2016 Agapsys Tecnologia Ltda-ME.
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
 */

package com.agapsys.exception;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Leandro Oliveira (leandro@agapsys.com)
 */
public class IllegalStateErrorTest {
	@Test
	public void test() {
		IllegalStateError exception;
		final Throwable cause = new RuntimeError();
		
		exception = new IllegalStateError("Hello %s!", "world");
		Assert.assertEquals("Hello world!", exception.getMessage());		
		
		exception = new IllegalStateError(cause, "Hello %s!", "world");
		Assert.assertEquals("Hello world!", exception.getMessage());
		Assert.assertEquals(cause, exception.getCause());
	}
}
